package com.carlos.springboot.app.capacitacion;

/**
 * Clase utilizando el constructor por Defecto
 */
public class CuentaPorDefecto extends Cuenta {
	
	public CuentaPorDefecto( ) {
				
	}
			
	@Override
	public void imprimir( Cuenta cuenta ) {		
		System.out.println( "CONSTRUCTOR POR DEFECTO" );
		System.out.println( "Nombre del cliente: " + cuenta.getNombreCliente() );
		System.out.println( "Número de cuenta: " + cuenta.getNumeroCuenta() );
		System.out.println( "Tipo de interés: " + cuenta.getTipoInteres() );
		System.out.println( "Saldo: " + cuenta.getSaldo() );
	}
			
}
