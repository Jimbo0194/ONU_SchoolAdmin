/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;


public class Country_list extends javax.swing.JFrame {

   
    public Country_list() {
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

        new_usr_message = new javax.swing.JLabel();
        Report_button = new javax.swing.JButton();
        Separator_3 = new javax.swing.JSeparator();
        Separator_2 = new javax.swing.JSeparator();
        Back_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Country_table = new javax.swing.JTable();
        CopyRight = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        new_usr_message.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        new_usr_message.setText("Lista de Paises");
        getContentPane().add(new_usr_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 190, -1));

        Report_button.setBackground(new java.awt.Color(102, 204, 255));
        Report_button.setForeground(new java.awt.Color(255, 255, 255));
        Report_button.setText("Obtener Reporte");
        Report_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), java.awt.Color.white, new java.awt.Color(51, 204, 255)));
        Report_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Report_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Report_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 140, 30));

        Separator_3.setBackground(new java.awt.Color(0, 0, 0));
        Separator_3.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(Separator_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 940, -1));

        Separator_2.setBackground(new java.awt.Color(0, 0, 0));
        Separator_2.setForeground(new java.awt.Color(0, 204, 255));
        getContentPane().add(Separator_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 940, 10));

        Back_button.setBackground(new java.awt.Color(102, 204, 255));
        Back_button.setForeground(new java.awt.Color(255, 255, 255));
        Back_button.setText("Volver");
        Back_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), java.awt.Color.white, new java.awt.Color(51, 204, 255)));
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 90, 30));

        Country_table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 255), new java.awt.Color(51, 204, 255), java.awt.Color.white, new java.awt.Color(51, 204, 255)));
        Country_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pais", "Capital", "Region", "Subregion", "Poblacion"
            }
        ));
        jScrollPane1.setViewportView(Country_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 750, 340));

        CopyRight.setForeground(new java.awt.Color(51, 51, 51));
        CopyRight.setText("Todos los derechos reservados - 2021 ©");
        getContentPane().add(CopyRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 270, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onu_scholarship_sys/1200px-Flag_of_the_United_Nations.svg.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 0, 1130, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        this.dispose();        
        call_menu();
    }//GEN-LAST:event_Back_buttonActionPerformed

    private void Report_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Report_buttonActionPerformed
         
        try {
            poblar_tabla_de_paises();
        } catch (IOException ex) {
            Logger.getLogger(Country_list.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Report_buttonActionPerformed

    // declaracion de metodos para llamado de formularios
    
    private void call_menu(){
        Main_Menu menu_principal = new Main_Menu();
        menu_principal.setTitle("Menu Principal");
        menu_principal.setSize(900, 600);
        menu_principal.setLocationRelativeTo(null);
        menu_principal.setVisible(true);
        
    }
    
    public void poblar_tabla_de_paises() throws IOException{
        
        Countries obj_paises = new Countries ();
            
        JSONArray array = obj_paises.GetCountries();
        
        JSONObject object =null;
        
        //Uso de la tabla en pantalla
        
        //Hago referencia a la tabla que diseñé en pantalla para agregarle los países
        DefaultTableModel model = (DefaultTableModel) Country_table.getModel();
        
        //Arreglo que mapea los campos de la tabla en pantalla
        Object rowData[]= new Object[7];
        
        if (array!=null){
            
            for (int i = 0; i < array.length(); i++) {
                
                //Lee cada uno de los países que trae el JSON desde la clase Countries
                object = array.getJSONObject(i);
                
                rowData[0]= object.getString("name");
                rowData[1]= object.getString("capital");
                rowData[2]= object.getString("region");
                rowData[3]= object.getString("subregion");
                rowData[4]= object.getLong("population");
                
                
                //Tipo de objeto de la tabla le asignamos el registro del país
                
                model.addRow(rowData);
                
            }
 
        } else {
                    
                JOptionPane.showMessageDialog(null, "No existen registros de países que mostrar");
                    
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
            java.util.logging.Logger.getLogger(Country_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Country_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Country_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Country_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Country_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JLabel CopyRight;
    private javax.swing.JTable Country_table;
    private javax.swing.JButton Report_button;
    private javax.swing.JSeparator Separator_2;
    private javax.swing.JSeparator Separator_3;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel new_usr_message;
    // End of variables declaration//GEN-END:variables
}
