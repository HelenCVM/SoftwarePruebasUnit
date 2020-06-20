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
import ups.edu.ec.modelo.usuario.Socio;

public class controladorTestContabilidad {
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
		assertNotNull(carteraCredito);
	}

	@Test
	public void testAgregarCarteraCreditoenLibroDiario() {
		credito.setCedulaRecomienda("0151489812");
		carteraCredito.setId(1);
		carteraCredito.setCredito(credito);
		libroDiario.addCarteraCredito(carteraCredito);
		List respuesta=con.agregarCarteraCredito(carteraCredito);
        assertNull(respuesta);
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
		double numero = 600.50;
		egreso.setTotal(400.50);
		ingreso.setTotal(200);
		double total = con.calcularTotal(egreso, ingreso);
		assertEquals(numero, total, 0);
	}

	@Test
	public void testCalcularEgreso() {
		Egreso egreso=new Egreso();
		egreso.setMontoInicial(20.2);
		egreso.setIngreseAhorro(200);
		egreso.setInteresesOtraInstitucion(20);
		double esperado = 240.2;
		double total = con.calcularEgreso(egreso);
		assertEquals(esperado, total, 0);

	}

	@Test
	public void testCalcularIngreso() {
		Ingreso ingreso=new Ingreso();
		Transaccion transaccion=new Transaccion();
		ingreso.setMontoInicial(10);
		transaccion.setMonto(56);
		ingreso.setInteres(10);
		ingreso.setMulta(30);
		double esperado = 106;
		double total = con.calcularIngreso(ingreso,transaccion);
		assertEquals(esperado, total, 0);
	}

	@Test
	public void testListarHistorial() {
	
		List<HistorialAhorro> resultado = con.listarHistorial();
		assertNotNull(resultado);
	}

	

	@Test
	public void testListarCarteraCredito() {
		List<CarteraCreditos> resultado = con.listarCarteraCredito();
		assertNotNull(resultado);
	}

	

	@Test
	public void testListarLibroDiario() {
		List<LibroDiario> resultado = con.listarLibroDiario();
		assertNotNull(resultado);
	}

	

	@Test
	public void testListarCaja() {
		List<Caja> resultado = con.listarCaja();
		assertNotNull(resultado);
	}

	

}
