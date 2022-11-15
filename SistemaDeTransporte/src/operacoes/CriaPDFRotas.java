/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import classes.Linha;
import classes.Paradas;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import static java.awt.Font.BOLD;
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
public class CriaPDFRotas {
     private static PdfPTable criarCabecalho() throws DocumentException {
        PdfPTable table = new PdfPTable(4);
        PdfPCell celulaID = new PdfPCell(new Phrase(12F,"Número",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaID.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaPonto = new PdfPCell(new Phrase(12F,"Ponto",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaPonto.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaLogradouro = new PdfPCell(new Phrase(12F,"Rua",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaLogradouro.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell celulaHorario = new PdfPCell(new Phrase(12F,"Horario",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12F)));
        celulaHorario.setHorizontalAlignment(Element.ALIGN_CENTER);

        table.addCell(celulaID);
        table.addCell(celulaPonto);
        table.addCell(celulaLogradouro);
        table.addCell(celulaHorario);

        return table;
    }

    /*Este método se o documento passado por parâmetro está aberto ele percorre a lista de matriz de objeto que é as linahs utlizadas para
    adicionar no JTable de faturamento e para cada coluna de cada linha da matriz é adicionado em uma celula de pdf onde ao final é adicionado
    ao PdfTable para ser adicionado no documento. Após isso é criado outro PdfTable com apenas uma célula sendo o faturamento total e o mesmo 
    é adicionado ao documento também.*/
    private static void preencherTabela(Document document, PdfPTable table, ArrayList<Paradas> paradas) throws DocumentException {
        if (document.isOpen()) {
            int i;
            SimpleDateFormat formatterHora = new SimpleDateFormat("HH:mm");
            ArrayList<Paradas> rows = paradas;
            for (i = 0; i < rows.size(); i++) {
                Paradas rowFat = rows.get(i);
                PdfPCell celula1 = new PdfPCell(new Phrase(""+(i+1)));
                PdfPCell celula2 = new PdfPCell(new Phrase(rowFat.getPontoParada()));
                PdfPCell celula3 = new PdfPCell(new Phrase(rowFat.getEndereco()));
                PdfPCell celula4 = new PdfPCell(new Phrase(""+formatterHora.format(rowFat.getHorario())));
                
                celula1.setHorizontalAlignment(Element.ALIGN_CENTER);
                celula2.setHorizontalAlignment(Element.ALIGN_CENTER);
                celula4.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(celula1);
                table.addCell(celula2);
                table.addCell(celula3);
                table.addCell(celula4);
            }
            Date data = new Date();
            PdfPTable total = new PdfPTable(1);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            PdfPCell celulaData = new PdfPCell(new Phrase("Data: "+formatter.format(data)));
            celulaData.setHorizontalAlignment(Element.ALIGN_CENTER);
            total.addCell(celulaData);
            Paragraph pTitulo = new Paragraph(new Phrase(20F,"\n\n", FontFactory.getFont(FontFactory.HELVETICA, 18F)));
            document.add(table);
            document.add(total);
            document.add(pTitulo);

        }
    }

    public static void gerarPDF(ArrayList<Linha> linhas) throws DocumentException, IOException {
        /*-------------------------------------------------------*/
 /*Cria um documento, formata a data do relatório e cria uma String com o nome do arquivo*/
        Document document = new Document();
        String arq = "relatorioRotas.pdf";
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
        for(Linha linha : linhas){
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date data = new Date();
            Paragraph pTitulo = new Paragraph(new Phrase(20F, "Paradas da linha - " +linha.getPontoInicial()+"-"+ linha.getPontoFinal()+"\n\n", FontFactory.getFont(FontFactory.HELVETICA, 18F)));
            pTitulo.setAlignment(Element.ALIGN_CENTER);
            document.add(pTitulo);
            PdfPTable table = CriaPDFRotas.criarCabecalho();
            CriaPDFRotas.preencherTabela(document, table, linha.getParadas());
        }
        

        document.close();
        /*-------------------------------------------------------*/
        /*Abre o pdf pelo aplicativo padrao do computador do usuario*/
        File file = new File(dir + "/" + arq);
        Desktop.getDesktop().open(file);
    }
}
