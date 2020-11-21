package com.carlos.springboot.app.capacitacion;

/**
 * Clase utilizando el constructor con Copia
 */
public class CuentaConCopia extends Cuenta {
	
	public CuentaConCopia( Cuenta cuenta ) {
		super( cuenta );
	}

	@Override
	public void imprimir(Cuenta cuenta) {
		System.out.println( "CONSTRUCTOR CON COPIA" );
		System.out.println( "Nombre del cliente: " + cuenta.getNombreCliente().concat(" - COPIA") );
		System.out.println( "Número de cuenta: " + cuenta.getNumeroCuenta() );
		System.out.println( "Tipo de interés: " + cuenta.getTipoInteres() );
		System.out.println( "Saldo: " + cuenta.getSaldo() );
	}

}
