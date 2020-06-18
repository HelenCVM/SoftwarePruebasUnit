package ups.edu.ec.controlador;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControladorTest {

	controlador con=new controlador();
	
	@Test
	public void testControlador() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregarHistorial() {
		fail("Not yet implemented");
		
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
		org.junit.Assert.assertEquals(esperado,total,0);
		
	}

	@Test
	public void testCalcularIngreso() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrarListaSocio() {
		fail("Not yet implemented");
	}

	@Test
	public void testEliminarSocio() {
		fail("Not yet implemented");
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

}
