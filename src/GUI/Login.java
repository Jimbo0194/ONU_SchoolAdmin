/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import static java.util.logging.Level.SEVERE;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luisdiegomontealegrebadilla
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

    }

    void logearse() {

        SQLServerDataSource ds = new SQLServerDataSource();

        ds.setServerName("localhost");
        ds.setDatabaseName("Proyecto_Progra");
        ds.setUser("Admin");
        ds.setPassword("Proyecto");
        ds.setPortNumber(1433);

        try {
            Connection cn = ds.getConnection();
            PreparedStatement ps = cn.prepareStatement("Select * From Usuario where Usuario = ? and Contraseña = ?");
            ps.setObject(1, this.Username.getText());
            ps.setObject(2, this.Password.getText());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                this.dispose();
                Main_Menu principal = new Main_Menu();
                principal.setLocationRelativeTo(null);
                principal.setTitle("Menu Principal");
                principal.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Los credenciales no son válidos, intente nuevamente");
                Login log = new Login();
                log.setLocationRelativeTo(null);
                log.setTitle("Login");
                log.setVisible(true);
            }

        } catch (SQLException e) {

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Greeting = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        Separator_2 = new javax.swing.JSeparator();
        Separator_1 = new javax.swing.JSeparator();
        Password = new javax.swing.JPasswordField();
        exit_btn = new javax.swing.JButton();
        Log_in_Button = new javax.swing.JButton();
        CopyRight = new javax.swing.JLabel();
        Username_label = new javax.swing.JLabel();
        Passw_label = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Greeting.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Greeting.setText("Bienvenido al Gestor de becas ONU");
        getContentPane().add(Greeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 460, 30));

        Username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), null, new java.awt.Color(51, 204, 255)));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, -1));

        Separator_2.setBackground(new java.awt.Color(0, 0, 0));
        Separator_2.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(Separator_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 950, 10));

        Separator_1.setBackground(new java.awt.Color(0, 0, 0));
        Separator_1.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(Separator_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 960, 10));

        Password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), null, new java.awt.Color(51, 204, 255)));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 120, -1));

        exit_btn.setBackground(new java.awt.Color(102, 204, 255));
        exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        exit_btn.setText("Salir");
        exit_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), java.awt.Color.white, new java.awt.Color(51, 204, 255)));
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        getContentPane().add(exit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 100, 30));

        Log_in_Button.setBackground(new java.awt.Color(102, 204, 255));
        Log_in_Button.setForeground(new java.awt.Color(255, 255, 255));
        Log_in_Button.setText("Ingresar");
        Log_in_Button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), java.awt.Color.white, new java.awt.Color(51, 204, 255)));
        Log_in_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_in_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Log_in_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 90, 20));

        CopyRight.setForeground(new java.awt.Color(51, 51, 51));
        CopyRight.setText("Todos los derechos reservados - 2021 ©");
        getContentPane().add(CopyRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 270, 20));

        Username_label.setText("Usuario");
        getContentPane().add(Username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 60, 20));

        Passw_label.setText("Contraseña");
        getContentPane().add(Passw_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 80, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onu_scholarship_sys/1200px-Flag_of_the_United_Nations.svg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -10, 1090, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit_btnActionPerformed

    private void Log_in_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_in_ButtonActionPerformed

        logearse();
        this.dispose();


    }//GEN-LAST:event_Log_in_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CopyRight;
    private javax.swing.JLabel Greeting;
    private javax.swing.JButton Log_in_Button;
    private javax.swing.JLabel Passw_label;
    private javax.swing.JPasswordField Password;
    private javax.swing.JSeparator Separator_1;
    private javax.swing.JSeparator Separator_2;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel Username_label;
    private javax.swing.JButton exit_btn;
    // End of variables declaration//GEN-END:variables
}
