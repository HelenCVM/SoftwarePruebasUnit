package ups.edu.ec.controlador;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;
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
import ups.edu.ec.modelo.transaccion.TablaAmortizacion;
import ups.edu.ec.modelo.transaccion.Transaccion;
import ups.edu.ec.modelo.usuario.Socio;

public class controladorTestTransaccion {
	CuentaAhorro cuenta = new CuentaAhorro();
	controladorTransaccion con = new controladorTransaccion();
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
		assertNull(respuesta);
	}

	@Test
	public void testIngresarRetiro() {
		boolean respuesta=con.ingresarRetiro(10);
		assertTrue(respuesta);
	}

	@Test
	public void testIngresarDeposito() {
		Transaccion tra=new Transaccion();
		double montovalor=20;
	    tra.setMonto(20);
	    double resultado=con.ingresarDeposito(tra);
	    assertEquals(montovalor, resultado, 0);
	}

	@Test
	public void testAgregarCuenta() {
		Socio socio1 = new Socio();
		ArrayList respuesta = con.agregCuenta(credito);
		assertNotNull(respuesta);
	}

	@Test
	public void testTablaAmortizacion() {
		TablaAmortizacion tabla=new TablaAmortizacion();
		tabla.setMontoCredito(20.2);
		tabla.setPagoMensual(10.2);
		tabla.setTablaInteres(15);
		ArrayList esperado = new ArrayList();
		esperado.add(tabla);
		ArrayList respuesta = con.tablaAmortizacion(tabla);
		assertNull(respuesta);
		
		
	}
	@Test
	public void testCalcularCuota() {
		float esperado=350;
		float respuesta=con.calcularCuota(2000,5, 6);
		assertEquals(esperado, respuesta, 0);
	}



	
}
