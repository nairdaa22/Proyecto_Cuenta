/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentas;


/**
 * Clase principal que ejecuta la operativa de una cuenta bancaria.
 * 
 * @author Nairda
 */
public class Main {

     /**
     * Método principal que inicia la ejecución del programa.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        operativa_cuenta(cuenta1, 10);
        
        System.out.println("cambio de prueba");
    }

    /**
     * Realiza operaciones sobre la cuenta bancaria, como retirar e ingresar dinero.
     * 
     * @param cuenta1 Objeto de tipo CCuenta sobre el cual se realizarán las operaciones.
     * @param cantidad Cantidad de dinero utilizada en la operación.
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual;
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}