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
import java.io.File;
import java.time.*;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import connect_to_database.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HasilReport {

    public static void generate_report() {
        // String untuk file dari nama
        try {
            // String untuk nama dari file, bisa digunakan dengan directory tetapi
            // karena keterbatasan sistem maka hanya diperlukan nama dari Judul pdf saja
            String nama_file = "HasilReport.pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(new File(nama_file)));
            document.open();

            // menambahkan koneksi pada database
            KoneksiDatabase koneksi = new KoneksiDatabase();
            Connection database_koneksi = koneksi.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;

            // Query yang digunakan untuk mengambil data dari database db_stok_barang
            String query_Pengambilan_data = "SELECT nama_barang, stok_awal, in_stok, out_stok, sisa_stok, kode_kategori FROM tb_barang";
            ps = database_koneksi.prepareStatement(query_Pengambilan_data);
            rs = ps.executeQuery();
            // Menambahkan paragraf yang berupa sebuah hasil rekap dari store dengan detail
            // waktu pencatatan tersebut
            String judul = new String("Hasil Rekap Store Tanggal" + LocalDateTime.now().toString());
            document.addTitle(judul);

            // membuat tabel yang digunakan untuk menyimpan data
            // tabel ini dibuat dengan 6 kolom yang menyimpan nama_barang, stok_awal,
            // in_stok, out_stok, sisa_stok
            PdfPTable tabel_penyimpanan_data = new PdfPTable(6);
            PdfPCell kolom = new PdfPCell(new Phrase("Nama Barang"));
            tabel_penyimpanan_data.addCell(kolom);

            kolom = new PdfPCell(new Phrase("Stok Awal"));
            tabel_penyimpanan_data.addCell(kolom);

            kolom = new PdfPCell(new Phrase("Stok IN"));
            tabel_penyimpanan_data.addCell(kolom);

            kolom = new PdfPCell(new Phrase("Stok OUT"));
            tabel_penyimpanan_data.addCell(kolom);

            kolom = new PdfPCell(new Phrase("Stok Akhir"));
            tabel_penyimpanan_data.addCell(kolom);

            kolom = new PdfPCell(new Phrase("Kategori"));
            tabel_penyimpanan_data.addCell(kolom);

            document.add(kolom);
            document.close();

            // jika dokumen HasilReport.pdf sudah tercipta maka pada command line akan
            // terdapat pesan "Document Tercipta"
            System.out.print("Document Tercipta");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
