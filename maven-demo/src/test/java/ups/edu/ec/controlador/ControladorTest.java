package ups.edu.ec.controlador;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ups.edu.ec.modelo.contabilidad.Caja;
import ups.edu.ec.modelo.contabilidad.CarteraCreditos;
import ups.edu.ec.modelo.contabilidad.Egreso;
import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.contabilidad.Ingreso;
import ups.edu.ec.modelo.contabilidad.LibroDiario;
import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;
import ups.edu.ec.modelo.transaccion.Transaccion;
import ups.edu.ec.modelo.usuario.Socio;

public class ControladorTest {
	CuentaAhorro cuenta= new CuentaAhorro();
	controlador con=new controlador();
	Socio socio=new Socio();
	Egreso egreso =  new Egreso();
	Ingreso ingreso= new Ingreso();
	Transaccion transaccion= new Transaccion();
	HistorialAhorro historial= new HistorialAhorro();
	CarteraCreditos carteraCredito= new CarteraCreditos();
	Credito credito=new Credito();
	LibroDiario libroDiario= new LibroDiario();
	Caja caja= new Caja();
	List<Egreso> listaegreso= new ArrayList<Egreso>();
	List<Ingreso> listaingreso= new ArrayList<Ingreso>();
	
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
	/**
	 * Modulo Contabilidad
	 */
	@Test
	public void testAgregarHistorial() {
	
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
	public void testAgregarCarteraCredito() {
		carteraCredito.setCredito(credito);
		carteraCredito.setId(1);
		con.agregarCarteraCredito(carteraCredito);
	}


	@Test
	public void testAgregarCarteraCreditoenLibroDiario() {
		libroDiario.addCarteraCredito(carteraCredito);
		con.agregarCarteraCredito(carteraCredito);
		

	}

	@Test
	public void testAgregarHistorialCreditoenLibroDiario() {
	libroDiario.addHistorialCredito(historial);
	con.agregarHistorial(historial);
	}



	@Test
	public void testAgregarCaja() {
		listaegreso.add(egreso);
		listaingreso.add(ingreso);
	caja.setEgreso(listaegreso);
	caja.setIngreso(listaingreso);
	con.agregarCaja(caja);
	}


	@Test
	public void testCalcularTotal() {
		double numero=10;
		double total=con.calcularTotal(egreso, ingreso);
		assertEquals(numero,total,0);
	}


	@Test
	public void testCalcularEgreso() {
		double esperado=150;
		double total=con.calcularEgreso(egreso);
		assertEquals(esperado,total,0);
		
	}
	@Test
	public void testCalcularIngreso() {	
		double esperado=180;		
		double total=con.calcularIngreso(ingreso);
		assertEquals(esperado,total,0);
	}

}
