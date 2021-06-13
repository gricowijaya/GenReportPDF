/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface.sub_user_interface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.jar.JarEntry;

import javax.swing.JOptionPane;

import connect_to_database.KoneksiDatabase;

import user_interface.FormMendataBarang;

/**
 *
 * @author Gede Rico Wijaya - 2005551091
 */
public class SubMenuTambahKategori extends javax.swing.JFrame {

    /**
     * Creates new form SubMenuTambahKateogri
     */
    public SubMenuTambahKategori() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NamaKategori_Label = new javax.swing.JTextField();
        Tambah_Label = new javax.swing.JLabel();
        Hapus_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(188, 127, 108));
        jPanel1.setLayout(null);

        NamaKategori_Label.setFont(new java.awt.Font("Kohinoor Devanagari", 1, 24)); // NOI18N
        NamaKategori_Label.setText("Nama Kategori");
        NamaKategori_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NamaKategori_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(NamaKategori_Label);
        NamaKategori_Label.setBounds(20, 110, 280, 70);

        Tambah_Label
                .setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Tambah.png")); // NOI18N
        Tambah_Label.setText("jLabel1");
        Tambah_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tambah_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Tambah_Label);
        Tambah_Label.setBounds(20, 240, 140, 80);

        Hapus_Label
                .setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Hapus.png")); // NOI18N
        Hapus_Label.setText("jLabel1");
        Hapus_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hapus_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Hapus_Label);
        Hapus_Label.setBounds(160, 240, 140, 80);

        Background.setIcon(new javax.swing.ImageIcon(
                "/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/SubMenuCatatKategori.png")); // NOI18N
        Background.setText("jLabel1");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 320, 390);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method yang digunakan untuk mengecek Text Field yang digunakan untuk
     * mendaftarkan 2005551091 - Gede Rico Wijaya
     */
    public boolean cekTextField() {
        String NamaKategori = NamaKategori_Label.getText();

        // pengecekan TextField
        if (NamaKategori.length() == 0) {
            JOptionPane.showMessageDialog(null, "Ketik Nama Kategori!", "Field Kosong", 2);
            return false;
        } else {
            return true;
        }
    }

    public boolean CekNamaKategori(String NamaKategori) {
        PreparedStatement StatementQuery;
        ResultSet HasilQuery;

        boolean NamaKategori_Terdaftar = false;

        // query yang akan dijalankan pada database
        String query = "SELECT * FROM tb_kategori WHERE kode_kategori = ?";

        // pengecekan username
        try {
            StatementQuery = KoneksiDatabase.getConnection().prepareStatement(query);
            StatementQuery.setString(1, NamaKategori);
            HasilQuery = StatementQuery.executeQuery();

            if (HasilQuery.next()) {
                NamaKategori_Terdaftar = true;
                JOptionPane.showMessageDialog(null,
                        "Kategori Sudah Terdaftar, Silahkan Pilih Nama Kategori yang lain !", "Gagal terdaftar", 2);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Query Gagal", 2);
        }
        return NamaKategori_Terdaftar;
    }

    private void Tambah_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Tambah_LabelMouseClicked
        PreparedStatement StatementQuery;
        String NamaKategori = NamaKategori_Label.getText();
        if (cekTextField()) {
            if (!CekNamaKategori(NamaKategori)) {
                try {
                    String TambahKategori = "INSERT INTO tb_kategori VALUES (NULL, ? , 'ACTIVE')";
                    StatementQuery = KoneksiDatabase.getConnection().prepareStatement(TambahKategori);
                    StatementQuery.setString(1, NamaKategori);
                    try {
                        if (StatementQuery.executeUpdate() != 0) {
                            JOptionPane.showMessageDialog(null, "Kategori Terdaftarkan");
                        } else {
                            JOptionPane.showMessageDialog(null, "Kategori Tidak Terhapus");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString(), "Query Gagal", 2);
                }

            }
        }
        FormMendataBarang mendataBarang = new FormMendataBarang();
        mendataBarang.getDataForKategoriComboBox();
    }// GEN-LAST:event_Tambah_LabelMouseClicked

    private void Hapus_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Hapus_LabelMouseClicked
        PreparedStatement StatementQuery;
        String NamaKategori = NamaKategori_Label.getText();
        try {
            String HapusKategori = "UPDATE tb_kategori SET status = 'NOT ACTIVE' WHERE kategori = ?";
            StatementQuery = KoneksiDatabase.getConnection().prepareStatement(HapusKategori);
            StatementQuery.setString(1, NamaKategori);
            try {
                if (StatementQuery.executeUpdate() != 0) {
                    JOptionPane.showMessageDialog(null, "Kategori Terhapuskan");
                } else {
                    JOptionPane.showMessageDialog(null, "Kategori Terhapus");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Query Gagal", 2);
        }
    }// GEN-LAST:event_Hapus_LabelMouseClicked

    private void NamaKategori_LabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_NamaKategori_LabelMouseClicked
        NamaKategori_Label.setText("");
    }// GEN-LAST:event_NamaKategori_LabelMouseClicked

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
            java.util.logging.Logger.getLogger(SubMenuTambahKategori.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubMenuTambahKategori.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubMenuTambahKategori.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubMenuTambahKategori.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubMenuTambahKategori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Hapus_Label;
    private javax.swing.JTextField NamaKategori_Label;
    private javax.swing.JLabel Tambah_Label;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}