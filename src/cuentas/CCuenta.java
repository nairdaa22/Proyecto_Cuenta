/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas de ingreso y retiro.
 * 
 * @author Nairda
 */
public class CCuenta {

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta Número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés Tipo de interés a establecer.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /** Nombre del titular de la cuenta. */
    private String nombre;
    /** Número de cuenta bancaria. */
    private String cuenta;
    /** Saldo disponible en la cuenta. */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * 
     * @param nom Nombre del titular.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo disponible.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
