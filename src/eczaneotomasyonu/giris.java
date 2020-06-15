package eczaneotomasyonu;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class giris extends javax.swing.JFrame {

    /**
     * Creates new form giris
     */
    public giris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_kadi = new javax.swing.JTextField();
        txt_sifre = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        txt_kadi.setBackground(new java.awt.Color(234, 234, 234));
        txt_kadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kadiActionPerformed(evt);
            }
        });
        getContentPane().add(txt_kadi);
        txt_kadi.setBounds(320, 120, 170, 40);

        txt_sifre.setBackground(new java.awt.Color(234, 234, 234));
        getContentPane().add(txt_sifre);
        txt_sifre.setBounds(320, 200, 170, 40);

        jButton1.setBackground(new java.awt.Color(18, 125, 167));
        jButton1.setFont(new java.awt.Font("MS UI Gothic", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Giriş");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 300, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 125, 167));
        jLabel1.setText("Kullanıcı Adı :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 130, 110, 19);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(18, 125, 167));
        jLabel2.setText("Şifre :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 210, 60, 19);

        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 590, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_kadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kadiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        String kadi=txt_kadi.getText();
        String sifre=txt_sifre.getText();
        if (kadi.equals("")   ||   sifre.equals(""))
            
        {
            JOptionPane.showMessageDialog(this,"Lütfen Boş Alanları Doldurunuz.");
    }//GEN-LAST:event_jButton1ActionPerformed

        else{
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
            
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/eczane","root","");
            
            st=(Statement)con.createStatement();
            Statement st1 = (Statement)con.createStatement();
            rs=st.executeQuery("select * from uyeler where kadi='"+kadi+"' and sifre='"+sifre+"'");
            rs.next();
            String turu=rs.getString("turu");
            if(rs.getRow()<1){
                JOptionPane.showMessageDialog(null,"Böyle bir kullanıcı Kayıtlı Değil");
            }
            else{
                if(turu.equals("Yönetici")){
                    yonetici_giris giris1=new yonetici_giris();
                    giris1.setVisible(true);
                }
                else if (turu.equals("Personel")){
                    personel_giris giris2=new personel_giris();
                    giris2.setVisible(true);
                }
            }
        }
        }catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Hata : " + ex.toString());
            
            }catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı"  +ex.toString());
            }
    }
    
  
    
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
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_kadi;
    private javax.swing.JPasswordField txt_sifre;
    // End of variables declaration//GEN-END:variables
}
