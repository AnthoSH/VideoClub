/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.laVentanaPrincipal;

/**
 *
 * @author alumno
 */
public class LaLogicaPrincipal implements ActionListener {

    private laVentanaPrincipal ventana;
    private LaLogicaLogin login;
    private LaLogicaCompra compra;

    public LaLogicaPrincipal() {
        ventana = new laVentanaPrincipal();
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "invitado":

                compra = new LaLogicaCompra(ventana);

                break;

            case "socio":
                
                login = new LaLogicaLogin(ventana);
                
                break;
        }
    }

}
