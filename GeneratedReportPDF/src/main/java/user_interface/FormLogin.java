/*
 * Form Login merupakan Frame yang digunakan agar user dapat login terhadap program
 * 2005551090 - Luh Putu Monica Arysta Suastawan 
 * 2005551091 - Gede Rico Wijaya
 * */ 
package user_interface;

import connect_to_database.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class FormLogin extends javax.swing.JFrame {

    // contructor akan memanggil method initComponents() 
    public FormLogin() {
        initComponents();
    }

    /**
     * Method initComponents merupakan method yang dibangkitkan saat perancangan GUI 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Masuk_Label = new javax.swing.JLabel();
        Daftar_Label = new javax.swing.JLabel();
        LupaKataSandi_Label = new javax.swing.JLabel();
        LihatPassword_Label = new javax.swing.JLabel();
        NamaPengguna_Field = new javax.swing.JTextField();
        KataSandi_Field = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Masuk_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Masuk_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Masuk_Label);
        Masuk_Label.setBounds(720, 520, 170, 40);

        Daftar_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Daftar_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(Daftar_Label);
        Daftar_Label.setBounds(720, 630, 170, 50);

        LupaKataSandi_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LupaKataSandi_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(LupaKataSandi_Label);
        LupaKataSandi_Label.setBounds(810, 450, 180, 30);

        LihatPassword_Label.setText("   ");
        LihatPassword_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LihatPassword_LabelMouseClicked(evt);
            }
        });
        jPanel1.add(LihatPassword_Label);
        LihatPassword_Label.setBounds(920, 380, 50, 30);

        NamaPengguna_Field.setBackground(new java.awt.Color(214, 236, 243));
        NamaPengguna_Field.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        NamaPengguna_Field.setBorder(null);
        NamaPengguna_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaPengguna_FieldActionPerformed(evt);
            }
        });
        jPanel1.add(NamaPengguna_Field);
        NamaPengguna_Field.setBounds(590, 330, 380, 30);

        KataSandi_Field.setBackground(new java.awt.Color(214, 236, 243));
        KataSandi_Field.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        KataSandi_Field.setBorder(null);
        KataSandi_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KataSandi_FieldActionPerformed(evt);
            }
        });
        jPanel1.add(KataSandi_Field);
        KataSandi_Field.setBounds(590, 410, 380, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user_interface/Form Login.png"))); // NOI18N
        Background.setText("jLabel1");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 1060, 690);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 690);

        setSize(new java.awt.Dimension(1083, 744));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaPengguna_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPengguna_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPengguna_FieldActionPerformed

    private void Daftar_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Daftar_LabelMouseClicked
        FormDaftar daftar = new FormDaftar();
        daftar.show();
        this.dispose();
    }//GEN-LAST:event_Daftar_LabelMouseClicked

    private void LupaKataSandi_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LupaKataSandi_LabelMouseClicked
        FormLupaPassword lupa;
        
        lupa = new FormLupaPassword();
        lupa.show();
        this.dispose();
    }//GEN-LAST:event_LupaKataSandi_LabelMouseClicked

  
    private void Masuk_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Masuk_LabelMouseClicked
              // variabel untuk mengekseksusi query
        PreparedStatement st;
        // sebuah cursor untuk baris dari tabel tersebut
        ResultSet rs;

        // menyimpan username dan password
        String username = NamaPengguna_Field.getText();
        String password = String.valueOf(KataSandi_Field.getPassword());

        // query untuk mengecek password dan username sudah terdatftar
        String query = "SELECT * FROM tb_pegawai WHERE id_pegawai = ? AND password = ? ";

        // memberikan info bahwa username atau password empty
        if (username.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan ketik username", "Username kosong", 2);
        } else if (password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan ketik password", "Password Kosong", 2);
        } else {
            try {
                st = KoneksiDatabase.getConnection().prepareStatement(query);
                st.setString(1, username);
                st.setString(2, password);
                rs = st.executeQuery();
                // jika sudah terdaftar maka ResultSet akan berlanjut ke baris selanjutnya
                if (rs.next()) {
                    MenuBeranda beranda = new MenuBeranda();
                    beranda.show();
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau Password Anda Salah", "Tidak Dapat Login", 2);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
 
    }//GEN-LAST:event_Masuk_LabelMouseClicked

    private void LihatPassword_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LihatPassword_LabelMouseClicked
        if(LihatPassword_Label.getText().equals("")) {
            LihatPassword_Label.setText("");
            KataSandi_Field.setEchoChar((char)0);
        } else {
            LihatPassword_Label.setText("");
            KataSandi_Field.setEchoChar('*');
        } 
    }//GEN-LAST:event_LihatPassword_LabelMouseClicked

    private void KataSandi_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KataSandi_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KataSandi_FieldActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Daftar_Label;
    private javax.swing.JPasswordField KataSandi_Field;
    private javax.swing.JLabel LihatPassword_Label;
    private javax.swing.JLabel LupaKataSandi_Label;
    private javax.swing.JLabel Masuk_Label;
    private javax.swing.JTextField NamaPengguna_Field;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
