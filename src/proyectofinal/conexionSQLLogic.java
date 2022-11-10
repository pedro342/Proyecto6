/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.*;

/**
 *
 * @author pedri
 */
public class conexionSQLLogic {

    public void conexionSQLLogic() {

    }
    Connection cn;
    Statement st;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_final", "root", "");
            System.out.println("La conexion fue exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
    }
}

//    pps.setString (1, nombre.getText());
    //pps.executeUpdate();
