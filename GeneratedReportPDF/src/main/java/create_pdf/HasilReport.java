/* Class Hasil Report 
 * Merupakan class yang digunakan untu
            
   melakukan generasi pada dokumen 
 * yang berbentuk pdf, Hasil tersebut terdapat bebarapa kolom tabel 
 * sehingga dapat digunakan untuk membuat laporan stok setelah penjualan
 *
 * Gede Rico Wijaya - 2005551091 PBO E
*/

package create_pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

public class HasilReport {
    public static void generate_report() {
        // String untuk file dari nama 
        String nama_file = "Laporan Stok.pdf"; 
        Document document = new Document();
        try {
          
            document.open();
     
            /* Membuat tabel dengan 4 kolom untuk generasi pdf Report
             *
             * Pada Tabel ini lebar dari setiap tabel dilakukan generasi 4 kolom 
             * lalu lebar dari setiap tabel tersebut adalah 100 %
             * dan di set Spacing Before dan Afternya 
             */

            // Pdf Table (4) dengan 4 kolom 
            PdfPTable table = new PdfPTable(4); 
            table.setWidthPercentage(100); 
            table.setSpacingBefore(10f); 
            table.setSpacingAfter(10f); 
     
            //Set Column widths
            float[] columnWidths = {1f, 1f, 1f};
            table.setWidths(columnWidths);
     
            PdfPCell cell1 = new PdfPCell(new Paragraph(nama_file;Cell 1nama_file;));
            cell1.setBorderColor(BaseColor.BLACK);
            cell1.setPaddingLeft(10);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
     
            PdfPCell cell2 = new PdfPCell(new Paragraph(&quot;Cell 2&quot;));
            cell2.setBorderColor(BaseColor.BLACK);
            cell2.setPaddingLeft(10);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
     
            PdfPCell cell3 = new PdfPCell(new Paragraph(&quot;Cell 3&quot;));
            cell3.setBorderColor(BaseColor.BLACK);
            cell3.setPaddingLeft(10);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
     
            //To avoid having the cell border and the content overlap, if you are having thick cell borders
            //cell1.setUserBorderPadding(true);
            //cell2.setUserBorderPadding(true);
            //cell3.setUserBorderPadding(true);
     
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
     
            document.add(table);
     
            document.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
    }
}
