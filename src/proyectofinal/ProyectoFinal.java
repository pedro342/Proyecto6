package proyectofinal;

import menus.inicioView;

/**
 *
 * @author pedri
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicioView inicio = new inicioView();
        inicio.setVisible(true);
        mainLogic main = new mainLogic();
        main.main();
    }

}
