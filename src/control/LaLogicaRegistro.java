/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.LaVentanaLogin;
import vista.LaVentanaRegistro;
import vista.laVentanaPrincipal;

/**
 *
 * @author alumno
 */
public class LaLogicaRegistro implements ActionListener{

    private LaVentanaRegistro ventana;

   

     

    LaLogicaRegistro(LaVentanaLogin padre) {
         ventana = new LaVentanaRegistro(padre, true);
        ventana.setLocationRelativeTo(padre);
        ventana.setOyente(this);
        ventana.setVisible(true);
    }

     
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "":
                
                break;
        }
    }
    
}
