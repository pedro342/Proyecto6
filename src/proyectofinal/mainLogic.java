/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class mainLogic {

    public void mainLogic() {

    }

    public void main() {
        storageLogic storage = new storageLogic();
        Scanner sc = new Scanner(System.in);
        terrenosLogic terreno = new terrenosLogic();
        casasLogic casas = new casasLogic();
        departamentosLogic departamentoVenta = new departamentosLogic();
        clienteLogic cliente = new clienteLogic();
        storage.llamar();
        System.out.println("Bienvenido a RUDISEN S.A, ¿que accion le gustaria realizar en nuestra inmobiliaria?\nComprar, Alquilar, Vender");
        String dato = sc.next();
        String datoLower = dato.toLowerCase();
        switch (datoLower) {
            case "comprar":
                System.out.println("Le gustaria comprar terrenos, casas o departamentos?");
                String comprar = sc.next();
                String comprarLower = comprar.toLowerCase();
                storage.rellenarArrayTerrenosVenta();
                storage.rellenarArrayCasasVenta();
                storage.rellenarArrayCasasAlquiler();
                storage.rellenarArrayDepartamentoAlquiler();
                storage.rellenarArrayDepartamentoVenta();
                switch (comprarLower) {
                    case "terrenos":
                        storage.mostrarTerrenos();
                        break;
                    case "casas":
                        storage.mostrarCasasVenta();
                        break;
                    case "departamentos":
                        storage.mostrarDepartamentosVenta();
                        break;
                }
                break;
            case "alquilar":
                System.out.println("Le gustaria alquilar casas o departamentos?");
                String alquilar = sc.next();
                String alquilarLower = alquilar.toLowerCase();
                switch (alquilarLower) {
                    case "casas":
                        storage.mostrarCasasAlquiler();
                        break;
                    case "departamentos":
                        storage.mostrarDepartamentosAlquiler();
                        break;
                }
                break;
            case "vender":
                System.out.println("Le gustaria vender terrenos, casas o departamentos?");
                String vender = sc.next();
                String venderLower = vender.toLowerCase();
                switch (venderLower) {
                    case "terrenos":
                        storage.rellenarTerrenosAgregarVenta(terreno, cliente);
                        terreno.datos();
                        break;
                    case "casas":
                        storage.rellenarCasasAgregarVenta(casas, cliente);
                        casas.datos();
                        break;
                    case "departamentos":
                        storage.rellenarDepartamentosAgregarVenta(departamentoVenta, cliente);
                        casas.datos();
                        break;
                }
                break;
        }
    }
}
