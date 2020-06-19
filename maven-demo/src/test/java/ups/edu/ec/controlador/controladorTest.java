package ups.edu.ec.controlador;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;
import ups.edu.ec.modelo.contabilidad.Caja;
import ups.edu.ec.modelo.contabilidad.CarteraCreditos;
import ups.edu.ec.modelo.contabilidad.Egreso;
import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.contabilidad.Ingreso;
import ups.edu.ec.modelo.contabilidad.LibroDiario;
import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;
import ups.edu.ec.modelo.transaccion.Transaccion;
import ups.edu.ec.modelo.usuario.Administrador;
import ups.edu.ec.modelo.usuario.EstadoCuenta;
import ups.edu.ec.modelo.usuario.Socio;

public class controladorTest extends TestCase {
	CuentaAhorro cuenta = new CuentaAhorro();
	controlador con = new controlador();
	Socio socio = new Socio();
	Egreso egreso = new Egreso();
	Ingreso ingreso = new Ingreso();
	Transaccion transaccion = new Transaccion();
	HistorialAhorro historial = new HistorialAhorro();
	CarteraCreditos carteraCredito = new CarteraCreditos();
	Credito credito = new Credito();
	LibroDiario libroDiario = new LibroDiario();
	Caja caja = new Caja();
	List<Egreso> listaegreso = new ArrayList<Egreso>();
	List<Ingreso> listaingreso = new ArrayList<Ingreso>();

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
		String esperado = "1,Juan Sebastian,Vasquez,juanv@gmail.com,1234";
		String resultado = con.mostrarListaSocio(socio);
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testEliminarSocio() {
		Socio so = new Socio();
		so.setCod(1);
		so.setNombreCompleto("Juan Sebastian");
		so.setApellidosCompletos("Vasquez");
		so.setCorreo("juanv@gmail.com");
		so.setContraseña("1234");
		ArrayList esperado1 = new ArrayList();
		ArrayList resultado1 = con.eliminarSocio(so);

		assertEquals(esperado1.toString(), resultado1.toString(), 0);

	}

	@Test
	public void testModificarSocio() {
		Socio socio1 = new Socio();
		socio1.setCod(1);
		socio1.setNombreCompleto("Juan Sebastian");
		socio1.setApellidosCompletos("Vasquez");
		socio1.setCorreo("juanv@gmail.com");
		socio1.setContraseña("1234");

		Socio so = new Socio();
		so.setCod(2);
		so.setNombreCompleto("Juan Sebastian");
		so.setApellidosCompletos("Vasquez");
		so.setCorreo("juanv@gmail.com");
		so.setContraseña("1234");

		ArrayList esperado1 = new ArrayList();
		esperado1.add(socio1);

		ArrayList resultado1 = con.modificarSocio(so);
		assertEquals(esperado1.toString(), resultado1.toString(), 0);
	}

	@Test
	public void testIngresarSocio() {
		Socio socio1 = new Socio();
		socio1.setCod(1);
		socio1.setNombreCompleto("Juan Sebastian");
		socio1.setApellidosCompletos("Vasquez");
		socio1.setCorreo("juanv@gmail.com");
		socio1.setContraseña("1234");
		ArrayList esperado = new ArrayList();
		esperado.add(socio1);
		ArrayList respuesta = con.ingresarSocio(socio1);
		String esperado1 = esperado.toString();
		String respuesta1 = respuesta.toString();
		assertEquals(esperado1, respuesta1, 0);
	}

	@Test
	public void testIniciarSesion() {
		String correo = "juanv@gmail.com";
		String contraseña = "1234";
		boolean respuesta = con.iniciarSesion(correo, contraseña);
		assertTrue(respuesta);

	}

	@Test
	public void testSolicitarCredito() {
		boolean respuesta = con.solicitarCredito();
		assertTrue(respuesta);
	}

	@Test
	public void testAgregarEstadoCuenta() {
		EstadoCuenta cuenta = new EstadoCuenta();
		cuenta.setId("1");
		cuenta.setSaldo(20.2);
		cuenta.setInstereses(10.2);
		ArrayList esperado = new ArrayList();
		esperado.add(cuenta);
		ArrayList respuesta = con.agregarEstadoCuenta(cuenta);
		assertEquals(esperado.toString(), respuesta.toString(), 0);
	}

	@Test
	public void testCalcularSaldo() {
		double esperado = 40;
		double saldo = 20;
		double interes = 2;
		double total = con.calcularSaldo(saldo, interes);
		assertEquals(esperado, total, 0);
	}

	@Test
	public void testCalcularInteres() {
		double esperado = 333.333;
		double saldo = 20;
		double interes = 2;
		double tasa = 0.06;
		double total = con.calcularInteres(saldo, interes, tasa);
		assertEquals(esperado, total, 0);
	}

	public void testAgregarAdministrador() {
		Administrador administrador1 = new Administrador();
		administrador1.setCod(1);
		administrador1.setNombreCompleto("Jose Juan");
		administrador1.setApellidosCompletos("Hernandez");
		administrador1.setCorreo("juanjh@gmail.com");
		administrador1.setContraseña("1234");
		ArrayList esperado = new ArrayList();
		esperado.add(administrador1);
		ArrayList respuesta = con.agregarAdministrador(administrador1);
		assertEquals(esperado.toString(), respuesta.toString(), 0);
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
		double numero = 10;
		double total = con.calcularTotal(egreso, ingreso);
		assertEquals(numero, total, 0);
	}

	@Test
	public void testCalcularEgreso() {
		double esperado = 150;
		double total = con.calcularEgreso(egreso);
		assertEquals(esperado, total, 0);

	}

	@Test
	public void testCalcularIngreso() {
		double esperado = 180;
		double total = con.calcularIngreso(ingreso);
		assertEquals(esperado, total, 0);
	}

	@Test
	public void testAgregarTransacciones() {
		Transaccion transaccion = new Transaccion();
		transaccion.setCiudad("Quito");
		Date fecha2 = new Date(116, 5,3);
		transaccion.setFecha(fecha2);
		transaccion.setId(1);
		transaccion.setMonto(100);
		transaccion.setTipoTransaccion("deposito");
		ArrayList esperado = new ArrayList();
		esperado.add(transaccion);
		ArrayList respuesta = con.agregarTransacciones(transaccion);
		String esperado1 = esperado.toString();
		String respuesta1 = respuesta.toString();
		assertEquals(esperado1, respuesta1, 0);
	}

	@Test
	public void testIngresarRetiro() {
		
		
		boolean respuesta=con.ingresarRetiro(100);
		assertTrue(respuesta);
	}

	@Test
	public void testIngresarDeposito() {
		
	}

	@Test
	public void testAgregarCuenta() {
		Socio socio1 = new Socio();
		
		ArrayList esperado = new ArrayList();
		esperado.add(credito);
		ArrayList respuesta = con.agregarCuenta(credito);
		String esperado1 = esperado.toString();
		String respuesta1 = respuesta.toString();
		assertEquals(esperado1, respuesta1, 0);
	}

	@Test
	public void testTablaAmortizacion() {
		fail("Not yet implemented");
	}

	@Test
	public void testCalcularCuota() {
		float esperado=350;
		float respuesta=con.calcularCuota(2000,5, 6);
		assertEquals(esperado, respuesta, 0);
	}

}
