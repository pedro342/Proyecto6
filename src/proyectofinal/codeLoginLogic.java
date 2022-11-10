/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.util.Scanner;
import menus.logeoView;
import menus.menuView;

/**
 *
 * @author pedri
 */
public class codeLoginLogic {

    conexionSQLLogic con;
    Connection cn;

    public void codeLoginLogic(conexionSQLLogic con, Connection cn) {

    }

    menuView ventanaMenu = new menuView(con, cn);
    Scanner sc = new Scanner(System.in);
    private String usuario = "", contraseña = "";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void logeo(logeoView window) {
        if (getUsuario().equals("admin")) {
            if (getContraseña().equals("1234")) {
                ventanaMenu.setVisible(true);
                window.setVisible(false);
            } else {
                //mensaje error en algun campo
            }
        }
    }
}
