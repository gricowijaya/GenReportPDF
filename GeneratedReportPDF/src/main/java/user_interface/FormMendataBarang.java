/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface;

/**
 *
 * @author ASUS
 */
public class FormMendataBarang extends javax.swing.JFrame {

    /**
     * Creates new form FormMendataBarang
     */
    public FormMendataBarang() {
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

        jPanel2 = new javax.swing.JPanel();
        NamaBarang_Field = new javax.swing.JTextField();
        Kategori_ComboBox = new javax.swing.JComboBox<>();
        SatuanBarang_Field = new javax.swing.JTextField();
        TambahBarang_Label = new javax.swing.JLabel();
        Kembali_Label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        NamaBarang_Field.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        NamaBarang_Field.setBorder(null);
        jPanel2.add(NamaBarang_Field);
        NamaBarang_Field.setBounds(340, 250, 650, 50);

        Kategori_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pcs", "pack", "gram", "lusin", "rim", "pasang", " ", " " }));
        Kategori_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kategori_ComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(Kategori_ComboBox);
        Kategori_ComboBox.setBounds(340, 350, 660, 60);

        SatuanBarang_Field.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        SatuanBarang_Field.setBorder(null);
        jPanel2.add(SatuanBarang_Field);
        SatuanBarang_Field.setBounds(340, 460, 660, 50);
        jPanel2.add(TambahBarang_Label);
        TambahBarang_Label.setBounds(520, 550, 230, 70);
        jPanel2.add(Kembali_Label);
        Kembali_Label.setBounds(21, 590, 70, 50);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_interface/Form Mendata Barang.png"))); // NOI18N
        jPanel2.add(Background);
        Background.setBounds(0, 0, 1060, 650);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1059, 650);

        setSize(new java.awt.Dimension(1081, 705));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Kategori_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kategori_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kategori_ComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMendataBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    private javax.swing.JTextField SatuanBarang_Field;
    private javax.swing.JLabel TambahBarang_Label;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
