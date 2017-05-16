/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.LaVentanaLogin;
import vista.laVentanaPrincipal;

/**
 *
 * @author alumno
 */
public class LaLogicaLogin implements ActionListener {

    private LaVentanaLogin ventana;
    private LaLogicaRegistro registro;

    LaLogicaLogin(laVentanaPrincipal padre) {
        ventana = new LaVentanaLogin(padre, true);
        ventana.setOyente(this);
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "iniciar":

                break;

            case "registrar":
                registro = new LaLogicaRegistro(ventana);
                break;
        }

    }

}
