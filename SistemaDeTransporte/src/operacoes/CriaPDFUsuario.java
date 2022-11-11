/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Usuario;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import static com.itextpdf.text.Font.BOLD;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vini_
 */
public class CriaPDFUsuario {

    private static PdfPTable criarCabecalho() throws DocumentException {
        PdfPTable table = new PdfPTable(4);
        PdfPCell celulaID = new PdfPCell(new Phrase(12F,"Número",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaID.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaCPF = new PdfPCell(new Phrase(12F,"CPF",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaCPF.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaNome = new PdfPCell(new Phrase(12F,"Nome",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaNome.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaTipo = new PdfPCell(new Phrase(12F,"Tipo",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaTipo.setHorizontalAlignment(Element.ALIGN_CENTER);

        table.addCell(celulaID);
        table.addCell(celulaCPF);
        table.addCell(celulaNome);
        table.addCell(celulaTipo);

        return table;
    }

    /*Este método se o documento passado por parâmetro está aberto ele percorre a lista de matriz de objeto que é as linahs utlizadas para
    adicionar no JTable de faturamento e para cada coluna de cada linha da matriz é adicionado em uma celula de pdf onde ao final é adicionado
    ao PdfTable para ser adicionado no documento. Após isso é criado outro PdfTable com apenas uma célula sendo o faturamento total e o mesmo 
    é adicionado ao documento também.*/
    private static void preencherTabela(Document document, PdfPTable table, ArrayList<Usuario> usuarios) throws DocumentException {
        if (document.isOpen()) {
            int i;
            ArrayList<Usuario> rows = usuarios;
            for (i = 0; i < rows.size(); i++) {
                Usuario rowFat = rows.get(i);
                PdfPCell celula1 = new PdfPCell(new Phrase(""+(i+1)));
                celula1.setHorizontalAlignment(Element.ALIGN_CENTER);
                PdfPCell celula2 = new PdfPCell(new Phrase(rowFat.getCpf()));
                PdfPCell celula3 = new PdfPCell(new Phrase(rowFat.getNome()));
                celula2.setHorizontalAlignment(Element.ALIGN_CENTER);
                PdfPCell celula4 = new PdfPCell(new Phrase(rowFat.getTipo()));
                table.addCell(celula1);
                table.addCell(celula2);
                table.addCell(celula3);
                table.addCell(celula4);
            }
            Date data = new Date();
            PdfPTable total = new PdfPTable(2);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            PdfPCell celulaTotal = new PdfPCell(new Phrase(BOLD, "Quantidade de usuarios: " + i));
            PdfPCell celulaData = new PdfPCell(new Phrase("Data: "+formatter.format(data)));
            celulaData.setHorizontalAlignment(Element.ALIGN_CENTER);
            celulaTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
            total.addCell(celulaTotal);
            total.addCell(celulaData);
            document.add(table);
            document.add(total);

        }
    }

    public static void gerarPDF(ArrayList<Usuario> usuarios) throws DocumentException, IOException {
        /*-------------------------------------------------------*/
 /*Cria um documento, formata a data do relatório e cria uma String com o nome do arquivo*/
        Document document = new Document();
        String arq = "relatorioUsuarios.pdf";
        /*-------------------------------------------------------*/
 /*Verifica se o diretório existe para caso não existir ser criado e após é criado o pdf passando o documento e diretório somado com
        o nome do arquivo.*/
        File dir = new File("./relatorios");
        if (!dir.exists()) {
            dir.mkdir();
        }

        PdfWriter pdf = PdfWriter.getInstance(document, new FileOutputStream(dir + "/" + arq));
        /*-------------------------------------------------------*/
 /*Abre o documento e chama o método de criar cabeçalho, após isso percorre a lista de faturamentos verificando se a data dele é igual
        a informada para gerar o relatório, caso sim é chamado o método que preencher o relatório com as informaçÕes do determinado faturamento
        daquele dia.*/
        document.open();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        Paragraph pTitulo = new Paragraph(new Phrase(20F , "Relatorio de Usuário - "+formatter.format(data)+"\n\n", FontFactory.getFont(FontFactory.HELVETICA, 18F)));
        pTitulo.setAlignment(Element.ALIGN_CENTER);
        document.add( pTitulo );
        PdfPTable table = CriaPDFUsuario.criarCabecalho();
        CriaPDFUsuario.preencherTabela(document, table, usuarios);

        document.close();
        /*-------------------------------------------------------*/
        /*Abre o pdf pelo aplicativo padrao do computador do usuario*/
        File file = new File(dir + "/" + arq);
        Desktop.getDesktop().open(file);
    }
}
