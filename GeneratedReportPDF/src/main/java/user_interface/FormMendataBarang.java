/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface;

import connect_to_database.KoneksiDatabase;

import user_interface.sub_user_interface.SubMenuTambahKategori;
import user_interface.sub_user_interface.SubMenuTambahSatuan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Luh Putu Monica Arysta Putri Suastawan - 2005551090
 * @author Gede Rico Wijaya - 2005551091
 */

public class FormMendataBarang extends javax.swing.JFrame {

    /**
     * Creates new form FormMendataBarang
     */
    public FormMendataBarang() {
        initComponents();
        getDataForKategoriComboBox();
        getDataForSatuanComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        NamaBarang_Field = new javax.swing.JTextField();
        Satuan_ComboBox = new javax.swing.JComboBox<>();
        Kategori_ComboBox = new javax.swing.JComboBox<>();
        TambahBarang_Label = new javax.swing.JLabel();
        Kembali_Label = new javax.swing.JLabel();
        TambahKategori_Label = new javax.swing.JLabel();
        TambahSatuan_Label = new javax.swing.JLabel();
        Refresh_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        NamaBarang_Field.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 18)); // NOI18N
        NamaBarang_Field.setForeground(new java.awt.Color(81, 131, 152));
        NamaBarang_Field.setBorder(null);
        jPanel2.add(NamaBarang_Field);
        NamaBarang_Field.setBounds(340, 250, 660, 60);

        Satuan_ComboBox.setEditable(true);
        Satuan_ComboBox.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 18)); // NOI18N
        Satuan_ComboBox.setForeground(new java.awt.Color(81, 131, 152));
        jPanel2.add(Satuan_ComboBox);
        Satuan_ComboBox.setBounds(330, 440, 700, 80);

        Kategori_ComboBox.setEditable(true);
        Kategori_ComboBox.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 18)); // NOI18N
        Kategori_ComboBox.setForeground(new java.awt.Color(81, 131, 152));
        jPanel2.add(Kategori_ComboBox);
        Kategori_ComboBox.setBounds(330, 340, 700, 80);

        TambahBarang_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TambahBarang_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahBarang_LabelMouseClicked(evt);
            }
        });
        jPanel2.add(TambahBarang_Label);
        TambahBarang_Label.setBounds(520, 550, 230, 70);

        Kembali_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kembali_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kembali_LabelMouseClicked(evt);
            }
        });
        jPanel2.add(Kembali_Label);
        Kembali_Label.setBounds(21, 590, 70, 50);

        TambahKategori_Label.setText("+ Kategori");
        TambahKategori_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TambahKategori_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahKategori_LabelMouseClicked(evt);
            }
        });
        jPanel2.add(TambahKategori_Label);
        TambahKategori_Label.setBounds(320, 580, 100, 16);

        TambahSatuan_Label.setText("+ Satuan");
        TambahSatuan_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TambahSatuan_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahSatuan_LabelMouseClicked(evt);
            }
        });
        jPanel2.add(TambahSatuan_Label);
        TambahSatuan_Label.setBounds(200, 580, 56, 16);

        Refresh_Label.setIcon(
                new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Refresh_Kecil.png")); // NOI18N
        Refresh_Label.setText("Refresh");
        Refresh_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Refresh_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Refresh_LabelMouseClicked(evt);
            }
        });
        jPanel2.add(Refresh_Label);
        Refresh_Label.setBounds(830, 540, 140, 90);

        Background.setIcon(new javax.swing.ImageIcon(
                "/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/FormMendataBarang.png")); // NOI18N
        jPanel2.add(Background);
        Background.setBounds(0, 0, 1060, 650);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1059, 650);

        setSize(new java.awt.Dimension(1081, 705));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Refresh_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Refresh_LabelMouseClicked
        getDataForKategoriComboBox();
        getDataForSatuanComboBox();
    }// GEN-LAST:event_Refresh_LabelMouseClicked

    private void Satuan_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Satuan_ComboBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Satuan_ComboBoxActionPerformed

    private void Kembali_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Kembali_LabelMouseClicked
        FormHome beranda = new FormHome();
        beranda.show();
        this.dispose();
    }// GEN-LAST:event_Kembali_LabelMouseClicked

    private void TambahBarang_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TambahBarang_LabelMouseClicked
        // variabel untuk mengekseksusi query
        PreparedStatement StatementQuery;
        // sebuah cursor untuk baris dari tabel tersebut
        ResultSet HasilExecuteQuery;

        String Nama_Barang = NamaBarang_Field.getText();
        Object Kategori = Kategori_ComboBox.getSelectedItem().toString();
        Object Satuan = Satuan_ComboBox.getSelectedItem().toString();

        // Query memasukkan nama_barang
        if (cekTextField()) {
            // melakukan pengecekan nama_barang ada atau tidak
            if (!CekBarang(Nama_Barang)) {
                // menyimpan query yang digunakan pada SQL
                String queryMendataBarang = "INSERT INTO tb_barang(nama_barang, kode_satuan, kode_kategori) VALUES (? , (SELECT kode_kategori FROM tb_kategori WHERE kategori = ?), (SELECT kode_satuan FROM tb_satuan WHERE satuan = ?))";
                try {
                    // mencoba eksekusi query
                    StatementQuery = KoneksiDatabase.getConnection().prepareStatement(queryMendataBarang);
                    // pengganti Value harus sesuai order pada tabel yang digunakan untuk query
                    StatementQuery.setString(1, Nama_Barang);
                    StatementQuery.setString(2, Satuan.toString());
                    StatementQuery.setString(3, Kategori.toString());
                    // Setelah menjalankan query INSERT terhadap barang
                    try {
                        if (StatementQuery.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "Barang Terdaftarkan Pada Sistem ! ");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error, Barang Tidak Terdaftar, Silahkan Cek Data");
                        }
                        // jika tidak akan mendapatkan error dari dialog dan exeception handler
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    // jika query tidak terjalankan akan diberikan SQLExeption pada terminal
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
    }// GEN-LAST:event_TambahBarang_LabelMouseClicked

    private void TambahKategori_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TambahKategori_LabelMouseClicked
        SubMenuTambahKategori MenuKategoriBaru = new SubMenuTambahKategori();
        MenuKategoriBaru.setVisible(true);
        MenuKategoriBaru.pack();
        MenuKategoriBaru.setSize(318, 430);
        MenuKategoriBaru.setLocationRelativeTo(null);
    }// GEN-LAST:event_TambahKategori_LabelMouseClicked

    private void TambahSatuan_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TambahSatuan_LabelMouseClicked
        SubMenuTambahSatuan MenuSatuanBaru = new SubMenuTambahSatuan();
        MenuSatuanBaru.setVisible(true);
        MenuSatuanBaru.pack();
        MenuSatuanBaru.setSize(318, 430);
        MenuSatuanBaru.setLocationRelativeTo(null);
    }// GEN-LAST:event_TambahSatuan_LabelMouseClicked

    /**
     * Method untuk mengecek ketersediaan Nama Barang yang digunakan dengan
     * melakukan query terhadap database nantinya pengecekan ini akan dikembalikan
     * terhadap method klik
     *
     * 2005551091 - Gede Rico Wijaya
     */
    public boolean CekBarang(String Nama_Barang) {
        PreparedStatement StatementQuery;
        ResultSet rs;

        boolean Nama_Barang_terdaftar = false;

        // query yang akan dijalankan pada database
        String query = "SELECT * FROM tb_barang WHERE nama_barang = ?";

        // pengecekan Nama_Barang
        try {
            StatementQuery = KoneksiDatabase.getConnection().prepareStatement(query);
            StatementQuery.setString(1, Nama_Barang);
            rs = StatementQuery.executeQuery();

            if (rs.next()) {
                Nama_Barang_terdaftar = true;
                JOptionPane.showMessageDialog(null,
                        "Nama_Barang Sudah Terdaftar, Silahkan Daftarkan Nama Barang lain !", "Barang Gagal terdaftar",
                        2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Gagal Melakreukan Query", 2);
        }
        return Nama_Barang_terdaftar;
    }

    /**
     * Method ini digunakan untuk menambahkan data yang ada pada database terhadap
     * Kategori_ComboBox
     */
    public void getDataForKategoriComboBox() {

        PreparedStatement StatementQuery;
        ResultSet HasilExecuteQuery;
        try {
            String MencariKategori = "SELECT kategori FROM tb_kategori WHERE status = 'ACTIVE'";
            StatementQuery = KoneksiDatabase.getConnection().prepareStatement(MencariKategori);
            HasilExecuteQuery = StatementQuery.executeQuery();
            while (HasilExecuteQuery.next()) {
                String Kategori = String.valueOf(HasilExecuteQuery.getString("kategori"));
                Kategori_ComboBox.addItem(Kategori);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Query Gagal", 2);
        }
    }

    /**
     * Method yang digunakan untuk mengambil nilai data dari database kepada Satuan
     * Combo Box
     */
    public void getDataForSatuanComboBox() {
        PreparedStatement StatementQuery;
        ResultSet HasilExecuteQuery;
        try {
            String MencariSatuan = "SELECT satuan FROM tb_satuan WHERE status = 'ACTIVE'";
            StatementQuery = KoneksiDatabase.getConnection().prepareStatement(MencariSatuan);
            HasilExecuteQuery = StatementQuery.executeQuery();
            while (HasilExecuteQuery.next()) {
                String Satuan = String.valueOf(HasilExecuteQuery.getString("satuan"));
                Satuan_ComboBox.addItem(Satuan);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Query Gagal", 2);
        }
    }

    /** Method untuk mengecek kekosongan text Field */
    public boolean cekTextField() {
        String NamaBarang = NamaBarang_Field.getText();

        // mengecek field yang kosong
        if (NamaBarang.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Salah satu kotak tidak diisi data", "kotak Kosong", 2);
            return false;
            // jika field tidak kosong
        } else {
            return true;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMendataBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JComboBox<String> Kategori_ComboBox;
    private javax.swing.JLabel Kembali_Label;
    private javax.swing.JTextField NamaBarang_Field;
    private javax.swing.JLabel Refresh_Label;
    private javax.swing.JComboBox<String> Satuan_ComboBox;
    private javax.swing.JLabel TambahBarang_Label;
    private javax.swing.JLabel TambahKategori_Label;
    private javax.swing.JLabel TambahSatuan_Label;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
