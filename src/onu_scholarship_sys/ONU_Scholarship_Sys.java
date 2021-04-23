package onu_scholarship_sys;

import GUI.Login;
/**
 *
 * @author luisdiegomontealegrebadilla
 */

public class ONU_Scholarship_Sys {
   
    
    public static void main(String[] args) {
        inicio_sistema();
        
    }
    
    public static void inicio_sistema(){
        
        Login inicio = new Login();
        
        //centrado de formulario
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        
    }
    
}
