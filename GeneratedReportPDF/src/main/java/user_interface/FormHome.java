/*
 * Form Home Merupakan salah satu program yang digunakan dalam Menu Beranda Untuk Nabvigasi Menu 
 */
package user_interface;

// import java swing 
import javax.swing.JOptionPane;
import java.awt.Cursor;
/**
 *
 * @author Luh Putu Monica Arysta Putri Suastawan- 2005551090 
 * @author Gede Rico Wijaya - 2005551091 
 */
public class FormHome extends javax.swing.JFrame {

    /**
     * Creates new form FormHome
     */
    public FormHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RiwayatPencatatan_Label = new javax.swing.JLabel();
        PencatatanStok_Label = new javax.swing.JLabel();
        Keluar_Label = new javax.swing.JLabel();
        MendataBarang_Label = new javax.swing.JLabel();
        Beranda_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(null);

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 40, 45, 16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 20, 10);

        RiwayatPencatatan_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RiwayatPencatatan_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RiwayatPencatatan_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(RiwayatPencatatan_Label);
        RiwayatPencatatan_Label.setBounds(280, 560, 160, 90);

        PencatatanStok_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PencatatanStok_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PencatatanStok_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(PencatatanStok_Label);
        PencatatanStok_Label.setBounds(650, 550, 130, 110);

        Keluar_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Keluar_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Keluar_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(Keluar_Label);
        Keluar_Label.setBounds(870, 570, 80, 80);

        MendataBarang_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MendataBarang_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MendataBarang_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(MendataBarang_Label);
        MendataBarang_Label.setBounds(480, 440, 140, 130);

        Beranda_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Beranda_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Beranda_LabelMouseClicked(evt);
            }
        });
        getContentPane().add(Beranda_Label);
        Beranda_Label.setBounds(60, 570, 130, 90);

        Background.setIcon(new javax.swing.ImageIcon("/Users/macos/NetBeansProjects/GeneratedReportPDF/icon/Beranda_Update.png")); // NOI18N
        Background.setLabelFor(this);
        getContentPane().add(Background);
        Background.setBounds(0, 30, 1050, 660);

        setSize(new java.awt.Dimension(1070, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Mehthod yang digunakan untuk keluar dari program sehingga pengguna dapat diberikan sebuah menu keluar
    private void Keluar_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Keluar_LabelMouseClicked
        FormKeluar keluar = new FormKeluar();
        keluar.show();
        this.dispose();
    }//GEN-LAST:event_Keluar_LabelMouseClicked

    private void MendataBarang_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MendataBarang_LabelMouseClicked
        FormMendataBarang data = new FormMendataBarang();
        data.show();
        this.dispose();
    }//GEN-LAST:event_MendataBarang_LabelMouseClicked

    private void PencatatanStok_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PencatatanStok_LabelMouseClicked
        FormPencatatanStok catat = new FormPencatatanStok();
        catat.show();
        this.dispose();
    }//GEN-LAST:event_PencatatanStok_LabelMouseClicked

    private void Beranda_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Beranda_LabelMouseClicked
        JOptionPane.showMessageDialog(null, "Anda Sudah Beranda Pada Beranda Aplikasi !");
    }//GEN-LAST:event_Beranda_LabelMouseClicked

    private void RiwayatPencatatan_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RiwayatPencatatan_LabelMouseClicked
        FormRiwayatPendataan rp = new FormRiwayatPendataan(); 
        rp.setVisible(true);
        rp.pack();
        rp.setSize(1153, 695);
        rp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RiwayatPencatatan_LabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Beranda_Label;
    private javax.swing.JLabel Keluar_Label;
    private javax.swing.JLabel MendataBarang_Label;
    private javax.swing.JLabel PencatatanStok_Label;
    private javax.swing.JLabel RiwayatPencatatan_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
