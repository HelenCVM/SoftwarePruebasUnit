package ups.edu.ec.controlador;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;

import org.junit.Test;

import ups.edu.ec.modelo.usuario.Socio;

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
		assertEquals(esperado,total,0);
		
	}

	@Test
	public void testCalcularIngreso() {
		fail("Not yet implemented");
	}

	@Test
	public void testMostrarListaSocio() {
		Socio so=new Socio();
		so.setCod(1);
		so.setNombreCompleto("Juan Sebastian");
		so.setApellidosCompletos("Vasquez");
		so.setCorreo("juanv@gmail.com");
		so.setContraseña("1234");
		String esperado="1,Juan Sebastian,Vasquez,juanv@gmail.com,1234";
		String resultado=con.mostrarListaSocio(so);
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

}
