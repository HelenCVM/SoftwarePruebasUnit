package ups.edu.ec.controlador;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Test;

import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;
import ups.edu.ec.modelo.usuario.Socio;

public class ControladorTest {
	CuentaAhorro cuenta= new CuentaAhorro();
	controlador con=new controlador();
	Socio socio=new Socio();
	/**
	 * Modulo Socio
	 */
	@Test
	public void testMostrarListaSocio() {
		
		socio.setCod(1);
		socio.setNombreCompleto("Juan Sebastian");
		socio.setApellidosCompletos("Vasquez");
		socio.setCorreo("juanv@gmail.com");
		socio.setContraseña("1234");
		String esperado="1,Juan Sebastian,Vasquez,juanv@gmail.com,1234";
		String resultado=con.mostrarListaSocio(socio);
		assertEquals(esperado,resultado,0);
	}

	@Test
	public void testEliminarSocio() {
		Socio so=new Socio();
		so.setCod(1);
		so.setNombreCompleto("Juan Sebastian");
		so.setApellidosCompletos("Vasquez");
		so.setCorreo("juanv@gmail.com");
		so.setContraseña("1234");
		ArrayList esperado1= new ArrayList();
		ArrayList resultado1=con.eliminarSocio(so);
		//assertArrayEquals(esperado1, resultado1);
	
	}

	@Test
	public void testModificarSocio() {
		fail("Not yet implemented");
	}

	@Test
	public void testIngresarSocio() {
		fail("Not yet implemented");
	}

	@Test
	public void testIniciarSesion() {
		fail("Not yet implemented");
	}

	@Test
	public void testSolicitarCredito() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregarEstadoCuenta() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalcularSaldo() {
		fail("Not yet implemented");
	}
	@Test
	public void testControlador() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregarHistorial() {
	HistorialAhorro historial= new HistorialAhorro();
	historial.setFecha("11/11/2012");
	historial.setId(1);	
	
	cuenta.setCapital(100);
	cuenta.setNumeroCuenta("22335566");
	cuenta.setSaldo(100);
	cuenta.setSocio(socio);
	historial.setCuentaahorro(cuenta);
	con.agregarHistorial(historial);
	}

	@Test
	public void testListarHistorial() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregarCarteraCredito() {
		fail("Not yet implemented");
	}

	@Test
	public void testListarCarteraCredito() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregarCarteraCreditoenLibroDiario() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregarHistorialCreditoenLibroDiario() {
		fail("Not yet implemented");
	}

	@Test
	public void testListarLibroDiario() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregarCaja() {
		fail("Not yet implemented");
	}

	@Test
	public void testListarCaja() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalcularTotal() {
		double numero=10;
		
		//double total=con.calcularTotal();
		//assertEquals(numero,total,0);
	}


	@Test
	public void testCalcularEgreso() {
		double esperado=150;
		double montoInicial=100;
		double interes=20;
		double interesOtraInst=30;
		double total=con.calcularEgreso(montoInicial, interes, interesOtraInst);
		assertEquals(esperado,total,0);
		
	}

	@Test
	public void testCalcularIngreso() {
		fail("Not yet implemented");
	}

}
