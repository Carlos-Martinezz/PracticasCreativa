package com.carlos.springboot.app.capacitacion;

public class TestCuentas {

	public static void main(String[] args) {
		
		//TEST DE CLASE CON PARÁMETROS
		CuentaConParametros cuentaN1 = new CuentaConParametros( "Carlos Martínez", "123456", 2.50, 350.0 );
		cuentaN1.imprimir( cuentaN1 );
		System.out.println();
		
		//TEST DE CLASE POR DEFECTO
		CuentaPorDefecto cuentaN2 = new CuentaPorDefecto();
		cuentaN2.setNombreCliente( "Carlos Martínez" );
		cuentaN2.setNumeroCuenta( "123456" );
		cuentaN2.setTipoInteres( 2.50 );
		cuentaN2.setSaldo( 350.0 );
		cuentaN2.imprimir( cuentaN2 );
		System.out.println();
		
		//TEST CLASE CON COPIA 
		//(Para copiar,  al constructor de la implementación le pasamos el objeto CuentaN1, y a imprimir() le pasamos el CuentaN3)
		CuentaConCopia cuentaN3 = new CuentaConCopia( cuentaN1 );
		cuentaN3.imprimir( cuentaN3 );
		
	}

}
