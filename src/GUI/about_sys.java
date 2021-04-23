/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author luisdiegomontealegrebadilla
 */
public class about_sys extends javax.swing.JFrame {

    /**
     * Creates new form about_sys
     */
    public about_sys() {
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

        Separator_2 = new javax.swing.JSeparator();
        Separator_1 = new javax.swing.JSeparator();
        Back_button = new javax.swing.JButton();
        dev_1 = new javax.swing.JLabel();
        dev_2 = new javax.swing.JLabel();
        dev_3 = new javax.swing.JLabel();
        CopyRight = new javax.swing.JLabel();
        devs_lbl1 = new javax.swing.JLabel();
        about_sys_lbl = new javax.swing.JLabel();
        purpose_lbl = new javax.swing.JLabel();
        expl_lbl = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separator_2.setBackground(new java.awt.Color(0, 0, 0));
        Separator_2.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(Separator_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 960, 20));

        Separator_1.setBackground(new java.awt.Color(0, 0, 0));
        Separator_1.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(Separator_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 460, 970, 30));

        Back_button.setBackground(new java.awt.Color(102, 204, 255));
        Back_button.setForeground(new java.awt.Color(255, 255, 255));
        Back_button.setText("Volver");
        Back_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), java.awt.Color.white, new java.awt.Color(51, 204, 255)));
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 100, 30));

        dev_1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dev_1.setText("Luis Diego Montealegre Badilla");
        getContentPane().add(dev_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, -1));

        dev_2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dev_2.setText("Mayron Samuel Lopez Romero");
        getContentPane().add(dev_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        dev_3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dev_3.setText("Marvin Alberto Vindas Umaña");
        getContentPane().add(dev_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 250, -1));

        CopyRight.setForeground(new java.awt.Color(51, 51, 51));
        CopyRight.setText("Todos los derechos reservados - 2021 ©");
        getContentPane().add(CopyRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 270, 60));

        devs_lbl1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        devs_lbl1.setText("Proposito:");
        getContentPane().add(devs_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 250, -1));

        about_sys_lbl.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        about_sys_lbl.setText("Acerca del sistema");
        getContentPane().add(about_sys_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 250, -1));

        purpose_lbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        purpose_lbl.setText("Desarrolladores:");
        getContentPane().add(purpose_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, -1));

        expl_lbl.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        expl_lbl.setText("Administrar y facilitar beneficiarios de becas de la ONU");
        getContentPane().add(expl_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 420, 120));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onu_scholarship_sys/1200px-Flag_of_the_United_Nations.svg.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 1080, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        this.dispose();
        call_menu();
    }//GEN-LAST:event_Back_buttonActionPerformed

    // declaracion de metodos para llamado de formularios
    
    private void call_menu(){
        Main_Menu menu_principal = new Main_Menu();
        menu_principal.setTitle("Menu Principal");
        menu_principal.setSize(900, 600);
        menu_principal.setLocationRelativeTo(null);
        menu_principal.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(about_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about_sys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about_sys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JLabel CopyRight;
    private javax.swing.JSeparator Separator_1;
    private javax.swing.JSeparator Separator_2;
    private javax.swing.JLabel about_sys_lbl;
    private javax.swing.JLabel background;
    private javax.swing.JLabel dev_1;
    private javax.swing.JLabel dev_2;
    private javax.swing.JLabel dev_3;
    private javax.swing.JLabel devs_lbl1;
    private javax.swing.JLabel expl_lbl;
    private javax.swing.JLabel purpose_lbl;
    // End of variables declaration//GEN-END:variables
}
