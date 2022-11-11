/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 *
 * @author Vini_
 */
public class CriaPDFUsuario {

    public static void main(String[] arq) {
        // Creating a PdfWriter object
        // criação do objeto documento
        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream("./dados/relatorioUser.pdf"));
            document.open();

            // adicionando um parágrafo ao documento
            document.add(new Paragraph("Gerando um PDF usando iText em Java"));

            // adicionando um parágrafo com fonte diferente ao arquivo
            document.add(new Paragraph("Adicionando outro paragrafo", FontFactory.getFont(FontFactory.COURIER, 12)));

        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            document.close();
        }

    }
}
