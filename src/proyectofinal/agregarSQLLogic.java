/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author pedri
 */
public class agregarSQLLogic {

    conexionSQLLogic con;
    Connection cn;
    PreparedStatement PPS;

    public void agregarSQLLogic(conexionSQLLogic con, Connection cn) {

    }

    public void rellenarCasas() {
        try {
            PPS = cn.prepareStatement("INSERT INTO casas(metros_construidos, metros_cuadrados, caracteristicas, ubicacion, amoblada, estado_propiedad) VALUES (?,?,?,?,?,?)");
        } catch (Exception e) {
            System.out.println("El error fue " + e);
        }

    }

    public void rellenarDepartamentos() {
        try {
            PPS = cn.prepareStatement("INSERT INTO departamentos(metros_cuadrados, ubicacion, caracteristicas, estado_propiedad) VALUES (?,?,?,?)");
        } catch (Exception e) {
            System.out.println("El error fue " + e);
        }

    }

    public void rellenarTerrenos() {
        try {
            PPS = cn.prepareStatement("INSERT INTO terrenos(metros_cuadrados, caracteristicas, ubicacion, estado_propiedad) VALUES (?,?,?,?)");
        } catch (Exception e) {
            System.out.println("El error fue " + e);
        }

    }

}
