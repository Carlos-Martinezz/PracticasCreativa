package com.carlos.springboot.app.capacitacion;

/**
 * Clase utilizando el constructor con Parámetros
 */
public class CuentaConParametros extends Cuenta {
	
	//Llamamos al Constructor de la clase abstracta y le pasamos parametros con super()
	public CuentaConParametros( String nombre, String numeroCuenta, double tipoInteres, double saldo ) {
		super( nombre, numeroCuenta, tipoInteres, saldo );
	}
		
		
	@Override
	public void imprimir( Cuenta cuenta ) {
		System.out.println( "CONSTRUCTOR CON TODOS LOS PARAMETROS" );
		System.out.println( "Nombre del cliente: " + cuenta.getNombreCliente() );
		System.out.println( "Número de cuenta: " + cuenta.getNumeroCuenta() );
		System.out.println( "Tipo de interés: " + cuenta.getTipoInteres() );
		System.out.println( "Saldo: " + cuenta.getSaldo() );
	}
	
}
