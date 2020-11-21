package com.carlos.springboot.app.capacitacion;

/**
 * @author Carlos Martínez
 * Clase base de Cuenta
 */
public abstract class Cuenta {

	private String nombreCliente;
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	
	/** Constructores de la aplicación
	 * - Por defecto
	 * - Con parámetros
	 * - Con copia ( Le pasamos un objeto del mismo tipo para que copie los datos )
	 */
	public Cuenta() {

	}

	public Cuenta( String nombreCliente, String numeroCuenta, double tipoInteres, double saldo ) {
		
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
		
	}

	public Cuenta( Cuenta cuenta ) {

		this.nombreCliente = cuenta.getNombreCliente();
		this.numeroCuenta = cuenta.getNumeroCuenta();
		this.tipoInteres = cuenta.getTipoInteres();
		this.saldo = cuenta.getSaldo();

	}
	

	/**
	 * Métodos Setters & Getters
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Método para imprimir los datos
	 * @return void
	 */
	public abstract void imprimir( Cuenta cuenta );

}
