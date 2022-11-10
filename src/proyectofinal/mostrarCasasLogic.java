/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author pedri
 */
public class mostrarCasasLogic {

    public void mostrarCasasLogic() {

    }

    private int bandera = 3000;

    public int getBandera() {
        return bandera;
    }

    public void setBandera(int bandera) {
        this.bandera = bandera;
    }

    public void calculoCasas(ArrayList<casasLogic> casasVentaArray) {
        for (int i = 0; i < casasVentaArray.size(); i++) {
            if (getBandera() == casasVentaArray.get(i).getMetrosConstruidos()) {
                System.out.println(casasVentaArray.get(i).getCaracteristicas());
            }
        }
    }

}
