/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.LaVentanaCompra;
import vista.laVentanaPrincipal;

/**
 *
 * @author alumno
 */
public class LaLogicaCompra implements ActionListener{

    private LaVentanaCompra ventana;
    
    LaLogicaCompra(laVentanaPrincipal padre) {
        
        ventana = new LaVentanaCompra(padre, true);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(padre);
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
