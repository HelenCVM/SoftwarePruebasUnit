package ups.edu.ec.controlador;

import static org.junit.Assert.*;

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
import ups.edu.ec.modelo.usuario.Administrador;
import ups.edu.ec.modelo.usuario.EstadoCuenta;
import ups.edu.ec.modelo.usuario.Socio;

public class controladorTestUsuario {
	CuentaAhorro cuenta = new CuentaAhorro();
	controladorusuario con = new controladorusuario();
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
		String esperado = socio.toString();
		String resultado = con.mostrarListaSocio(socio);
		assertNotNull(socio);
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

		assertNotNull(so);


		

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
		ArrayList resultado1 = con.modificarSocio(so);

		assertNotNull(resultado1);

		}

	@Test
	public void testIngresarSocio() {
		Socio socio1 = new Socio();
		socio1.setCod(1);
		socio1.setNombreCompleto("Juan Sebastian");
		socio1.setApellidosCompletos("Vasquez");
		socio1.setCorreo("juanv@gmail.com");
		socio1.setContraseña("1234");	
		ArrayList respuesta = con.ingresarSocio(socio1);
	assertNotNull(respuesta);
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
		ArrayList respuesta = con.agregarEstadoCuenta(cuenta);
		assertNotNull(respuesta);
	}

	@Test
	public void testCalcularSaldo() {
		float esperado = 40;
		float saldo = 20;
		float interes = 2;
		float total = con.calcularSaldo(saldo, interes);
		assertEquals(esperado, total, 0);
	}

	@Test
	public void testCalcularInteres() {
		double esperado = 5;
		double saldo = 60;
		double interes = 2;
		double tasa = 6;
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
		ArrayList respuesta = con.agregarAdministrador(administrador1);
		assertNull(respuesta);
	}
}
