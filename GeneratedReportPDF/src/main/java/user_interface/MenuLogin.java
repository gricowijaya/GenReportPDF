package user_interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * Luh Putu Monica Arysta Putri Suastawan - 2005551090 Gede Rico Wijaya
 * -2005551091
 *
 */
public class MenuLogin extends javax.swing.JFrame {

    /** Creates new form MenuLogin */
    public MenuLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowPassword = new javax.swing.JButton();
        NamaPengguna = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        LupaKataSandi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Masuk = new javax.swing.JButton();
        Daftar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1098, 698));
        getContentPane().setLayout(null);

        ShowPassword.setBackground(new java.awt.Color(214, 236, 243));
        ShowPassword.setForeground(new java.awt.Color(214, 236, 243));
        ShowPassword.setBorder(null);
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassword);
        ShowPassword.setBounds(980, 400, 50, 30);

        NamaPengguna.setBorder(null);
        NamaPengguna.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(NamaPengguna);
        NamaPengguna.setBounds(590, 330, 380, 30);

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(590, 400, 380, 40);
        getContentPane().add(LupaKataSandi);
        LupaKataSandi.setBounds(810, 450, 180, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_interface/Login.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 1120, 710);

        Masuk.setText("jButton1");
        getContentPane().add(Masuk);
        Masuk.setBounds(720, 510, 170, 60);

        Daftar.setText("jButton1");
        getContentPane().add(Daftar);
        Daftar.setBounds(720, 630, 170, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method ini merupakan method yang digunakan untuk Button yang memperlihatkan
     * password saat user mengetik password Pemrogram : Luh Putu Monica Arysta Putri
     * Suastawan - 2005551090 Pemrogram : Gede Rico Wijaya - 2005551091
     */
    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {
        ShowPassword.setVisible(true);
    }

    /**
     * Method ini merupakan method yang digunakan untuk Icon Show Password yang
     * dimana digunakan untuk mengubah warna atau opaque ketik Icon ditunjuk oleh
     *
     * cursor pada mouse Pemrogram Gede Rico Wijaya - 2005551091
     */
    private void ShowPasswordMouseEntered(java.awt.event.MouseEvent evt) {
        ShowPassword.setOpaque(true);
        ShowPassword.setBackground(Color.RED);
    }

    /**
     * 
     * Method ini merupakan method yang digunakan dalam mengetik password pada label
     * password sehingga pengguna dapat masuk kedalam program yang ingin dijalankan
     * Pemrogram : Gede Rico Wijaya 2005551091
     */
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {
        if (ShowPassword.isSelected()) {
            Password.setEchoChar((char) 0);
        } else {
            Password.setEchoChar('*');
        }
        System.out.print(evt);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Daftar;
    private javax.swing.JButton LupaKataSandi;
    private javax.swing.JButton Masuk;
    private javax.swing.JTextField NamaPengguna;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton ShowPassword;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
