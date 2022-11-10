/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author orare
 */
public class storageLogic {

    public void storage() {

    }
    Scanner sc = new Scanner(System.in);
    ArrayList<clienteLogic> clientes = new ArrayList<clienteLogic>();
    ArrayList<departamentosLogic> departamentoAgregarVentaArray = new ArrayList<departamentosLogic>();
    ArrayList<casasLogic> casasAgregarVentaArray = new ArrayList<casasLogic>();
    ArrayList<terrenosLogic> terrenoVentaArray = new ArrayList<terrenosLogic>();
    ArrayList<terrenosLogic> terrenoArray = new ArrayList<terrenosLogic>();
    ArrayList<casasLogic> casasArray = new ArrayList<casasLogic>();
    ArrayList<departamentosLogic> departamentosArray = new ArrayList<departamentosLogic>();

    private boolean volver = true, stop = true;
    private String ubicacion = "", nombre, apellido, direccion, DNI, fecha_nacimiento, numero_telefono;
    private int tamaño = 0;
    mostrarCasasLogic visible = new mostrarCasasLogic();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public void setStop(boolean volver) {
        this.volver = volver;
    }

    public void rellenarCliente(clienteLogic cliente) {
        System.out.println("Ingrese su nombre");
        nombre = sc.next();
        System.out.println("Ingrese su apellido");
        apellido = sc.next();
        System.out.println("Ingrese su direccion");
        direccion = sc.next();
        System.out.println("Ingrese su DNI");
        DNI = sc.next();
        System.out.println("Ingrese su fecha de nacimiento");
        fecha_nacimiento = sc.next();
        System.out.println("Por ultimo, ingrese su numero telefonico");
        numero_telefono = sc.next();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setDireccion(direccion);
        cliente.setDNI(DNI);
        cliente.setFecha_nacimiento(fecha_nacimiento);
        cliente.setNumero_telefono(numero_telefono);
    }

    public void rellenarArrays() {
        try {
            while (volver) {
                System.out.println("Ingrese la ubicacion");
                ubicacion = sc.next();
                System.out.println("Ingrese el tamanio");
                tamaño = sc.nextInt();
                setUbicacion(ubicacion);
                setTamaño(tamaño);
                System.out.println("Desea agregar alguna otra propiedad?");
                String parar = sc.next();
                if (parar.equals("si")) {
                    stop = true;
                    setStop(stop);
                } else {
                    if (parar.equals("no")) {
                        stop = false;
                        setStop(stop);
                    } else {
                        System.out.println("Lo ingresado no es correcto");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error, no se pudo rellenar");
        }
    }

    public void rellenarTerrenosAgregarVenta(terrenosLogic terreno, clienteLogic cliente) {
        try {
            rellenarArrays();
            terreno.setUbicacion(ubicacion);
            terreno.setMetrosCuadrados(tamaño);
            rellenarCliente(cliente);
        } catch (Exception e) {
            System.out.println("Se produjo un error");
        }
    }

    public void rellenarCasasAgregarVenta(casasLogic casaVenta, clienteLogic cliente) {
        try {
            rellenarArrays();
            casaVenta.setUbicacion(ubicacion);
            casaVenta.setMetrosCuadrados(tamaño);
            rellenarCliente(cliente);
        } catch (Exception e) {
            System.out.println("Se produjo un error");
        }
    }

    public void rellenarDepartamentosAgregarVenta(departamentosLogic departamentoVenta, clienteLogic cliente) {
        try {
            rellenarArrays();
            departamentoVenta.setUbicacion(ubicacion);
            departamentoVenta.setMetrosCuadrados(tamaño);
            rellenarCliente(cliente);
        } catch (Exception e) {
            System.out.println("Se produjo un error");
        }
    }

    terrenosLogic terreno1 = new terrenosLogic();
    terrenosLogic terreno2 = new terrenosLogic();
    terrenosLogic terreno3 = new terrenosLogic();
    terrenosLogic terreno4 = new terrenosLogic();
    terrenosLogic terreno5 = new terrenosLogic();

    public void terrenosEstatico() {
        terreno1.setUbicacion("El terreno esta ubicado en la provincia de Catamarca");
        terreno1.setMetrosCuadrados(4000);
        terreno2.setUbicacion("El terreno esta ubicado en la provincia de Jujuy");
        terreno2.setMetrosCuadrados(3000);
        terreno3.setUbicacion("El terreno esta ubicado en Concepcion, Tucuman");
        terreno3.setMetrosCuadrados(3200);
        terreno4.setUbicacion("El terreno esta ubicado en Leales, tucuman");
        terreno4.setMetrosCuadrados(2500);
        terreno5.setUbicacion("El terreno esta ubicado en San Miguel de Tucuman");
        terreno5.setMetrosCuadrados(1200);
    }

    public void rellenarArrayTerrenosVenta() {
        terrenosEstatico();
        terrenoArray.add(terreno1);
        terrenoArray.add(terreno2);
        terrenoArray.add(terreno3);
        terrenoArray.add(terreno4);
        terrenoArray.add(terreno5);
    }

    public void mostrarTerrenos() {
        terrenoArray.get(0).datos();
        terrenoArray.get(1).datos();
        terrenoArray.get(2).datos();
        terrenoArray.get(3).datos();
        terrenoArray.get(4).datos();
    }

//  Una funcion para cada casa/terreno/dpto
    casasLogic casa_venta1 = new casasLogic();
    casasLogic casa_venta2 = new casasLogic();
    casasLogic casa_venta3 = new casasLogic();
    casasLogic casa_venta4 = new casasLogic();
    casasLogic casa_venta5 = new casasLogic();

    public void casasEstatico() {
        casa_venta1.setUbicacion("La casa esta ubicada en la provincia de Catamarca");
        casa_venta1.setMetrosCuadrados(4000);
        casa_venta1.setMetrosConstruidos(3500);
        casa_venta1.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_venta2.setUbicacion("La casa esta ubicada en la provincia de Jujuy");
        casa_venta2.setMetrosCuadrados(3000);
        casa_venta2.setMetrosConstruidos(3500);
        casa_venta2.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_venta3.setUbicacion("La casa esta ubicada en Concepcion, Tucuman");
        casa_venta3.setMetrosCuadrados(3200);
        casa_venta3.setMetrosConstruidos(3500);
        casa_venta3.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_venta4.setUbicacion("La casa esta ubicada en Leales, tucuman");
        casa_venta4.setMetrosCuadrados(2500);
        casa_venta4.setMetrosConstruidos(3500);
        casa_venta4.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_venta5.setUbicacion("El terreno esta ubicado en San Miguel de Tucuman");
        casa_venta5.setMetrosCuadrados(1200);
        casa_venta5.setMetrosConstruidos(3500);
        casa_venta5.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
    }

    public void rellenarArrayCasasVenta() {
        casasEstatico();
        casasArray.add(casa_venta1);
        casasArray.add(casa_venta2);
        casasArray.add(casa_venta3);
        casasArray.add(casa_venta4);
        casasArray.add(casa_venta5);
    }

    public void mostrarCasasVenta() {
        casasArray.get(0).datos();
        casasArray.get(1).datos();
        casasArray.get(2).datos();
        casasArray.get(3).datos();
        casasArray.get(4).datos();
    }

    casasLogic casa_alquiler1 = new casasLogic();
    casasLogic casa_alquiler2 = new casasLogic();
    casasLogic casa_alquiler3 = new casasLogic();
    casasLogic casa_alquiler4 = new casasLogic();
    casasLogic casa_alquiler5 = new casasLogic();

    public void casasAlquilerEstatico() {
        casa_alquiler1.setUbicacion("La casa esta ubicada en la provincia de Catamarca");
        casa_alquiler1.setMetrosCuadrados(4000);
        casa_alquiler1.setMetrosConstruidos(3500);
        casa_alquiler1.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_alquiler2.setUbicacion("La casa esta ubicada en la provincia de Jujuy");
        casa_alquiler2.setMetrosCuadrados(3000);
        casa_alquiler2.setMetrosConstruidos(3500);
        casa_alquiler2.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_alquiler3.setUbicacion("La casa esta ubicada en Concepcion, Tucuman");
        casa_alquiler3.setMetrosCuadrados(3200);
        casa_alquiler3.setMetrosConstruidos(3500);
        casa_alquiler3.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_alquiler4.setUbicacion("La casa esta ubicada en Leales, tucuman");
        casa_alquiler4.setMetrosCuadrados(2500);
        casa_alquiler4.setMetrosConstruidos(3500);
        casa_alquiler4.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        casa_alquiler5.setUbicacion("El terreno esta ubicado en San Miguel de Tucuman");
        casa_alquiler5.setMetrosCuadrados(1200);
        casa_alquiler5.setMetrosConstruidos(3500);
        casa_alquiler5.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
    }

    public void rellenarArrayCasasAlquiler() {
        casasAlquilerEstatico();
        casasArray.add(casa_alquiler1);
        casasArray.add(casa_alquiler2);
        casasArray.add(casa_alquiler3);
        casasArray.add(casa_alquiler4);
        casasArray.add(casa_alquiler5);
    }

    public void mostrarCasasAlquiler() {
        rellenarArrayCasasAlquiler();
        casasArray.get(0).datos();
        casasArray.get(1).datos();
        casasArray.get(2).datos();
        casasArray.get(3).datos();
        casasArray.get(4).datos();
    }

    departamentosLogic departamento_alquiler1 = new departamentosLogic();
    departamentosLogic departamento_alquiler2 = new departamentosLogic();
    departamentosLogic departamento_alquiler3 = new departamentosLogic();
    departamentosLogic departamento_alquiler4 = new departamentosLogic();
    departamentosLogic departamento_alquiler5 = new departamentosLogic();

    public void departamentosAlquilerEstatico() {
        departamento_alquiler1.setUbicacion("La casa esta ubicada en la provincia de Catamarca");
        departamento_alquiler1.setMetrosCuadrados(4000);
        departamento_alquiler1.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_alquiler2.setUbicacion("La casa esta ubicada en la provincia de Jujuy");
        departamento_alquiler2.setMetrosCuadrados(3000);
        departamento_alquiler2.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_alquiler3.setUbicacion("La casa esta ubicada en Concepcion, Tucuman");
        departamento_alquiler3.setMetrosCuadrados(3200);
        departamento_alquiler3.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_alquiler4.setUbicacion("La casa esta ubicada en Leales, tucuman");
        departamento_alquiler4.setMetrosCuadrados(2500);
        departamento_alquiler4.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_alquiler5.setUbicacion("El terreno esta ubicado en San Miguel de Tucuman");
        departamento_alquiler5.setMetrosCuadrados(1200);
        departamento_alquiler5.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
    }

    public void rellenarArrayDepartamentoAlquiler() {
        departamentosAlquilerEstatico();
        departamentosArray.add(departamento_alquiler1);
        departamentosArray.add(departamento_alquiler2);
        departamentosArray.add(departamento_alquiler3);
        departamentosArray.add(departamento_alquiler4);
        departamentosArray.add(departamento_alquiler5);
    }

    public void mostrarDepartamentosAlquiler() {
        rellenarArrayDepartamentoAlquiler();
        departamentosArray.get(0).datos();
        departamentosArray.get(1).datos();
        departamentosArray.get(2).datos();
        departamentosArray.get(3).datos();
        departamentosArray.get(4).datos();
    }

    departamentosLogic departamento_venta1 = new departamentosLogic();
    departamentosLogic departamento_venta2 = new departamentosLogic();
    departamentosLogic departamento_venta3 = new departamentosLogic();
    departamentosLogic departamento_venta4 = new departamentosLogic();
    departamentosLogic departamento_venta5 = new departamentosLogic();

    public void departamentosVentaEstatico() {
        departamento_venta1.setUbicacion("La casa esta ubicada en la provincia de Catamarca");
        departamento_venta1.setMetrosCuadrados(4000);
        departamento_venta1.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_venta2.setUbicacion("La casa esta ubicada en la provincia de Jujuy");
        departamento_venta2.setMetrosCuadrados(3000);
        departamento_venta2.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_venta3.setUbicacion("La casa esta ubicada en Concepcion, Tucuman");
        departamento_venta3.setMetrosCuadrados(3200);
        departamento_venta3.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_venta4.setUbicacion("La casa esta ubicada en Leales, tucuman");
        departamento_venta4.setMetrosCuadrados(2500);
        departamento_venta4.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
        departamento_venta5.setUbicacion("El terreno esta ubicado en San Miguel de Tucuman");
        departamento_venta5.setMetrosCuadrados(1200);
        departamento_venta5.setCaracteristicas("Posee 2 habitaciones, comedor, 3 baños, quincho");
    }

    public void rellenarArrayDepartamentoVenta() {
        departamentosVentaEstatico();
        departamentosArray.add(departamento_venta1);
        departamentosArray.add(departamento_venta2);
        departamentosArray.add(departamento_venta3);
        departamentosArray.add(departamento_venta4);
        departamentosArray.add(departamento_venta5);
    }

    public void mostrarDepartamentosVenta() {
        departamentosArray.get(0).datos();
        departamentosArray.get(1).datos();
        departamentosArray.get(2).datos();
        departamentosArray.get(3).datos();
        departamentosArray.get(4).datos();
    }

    public void llamar() {
        visible.calculoCasas(casasArray);
    }
}
