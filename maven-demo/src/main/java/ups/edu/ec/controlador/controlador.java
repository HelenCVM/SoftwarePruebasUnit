package ups.edu.ec.controlador;

import java.util.ArrayList;

import java.util.List;

import ups.edu.ec.modelo.contabilidad.Caja;
import ups.edu.ec.modelo.contabilidad.CarteraCreditos;
import ups.edu.ec.modelo.contabilidad.Egreso;
import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.contabilidad.Ingreso;
import ups.edu.ec.modelo.contabilidad.LibroDiario;
import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;
import ups.edu.ec.modelo.transaccion.Cuota;
import ups.edu.ec.modelo.transaccion.TablaAmortizacion;
import ups.edu.ec.modelo.transaccion.Transaccion;
import ups.edu.ec.modelo.usuario.Administrador;
import ups.edu.ec.modelo.usuario.EstadoCuenta;
import ups.edu.ec.modelo.usuario.Socio;

public class controlador {
	public List<HistorialAhorro> listaHistorialAhorro;
	public List<CarteraCreditos> listaCarteraCreditos;
	public List<CuentaAhorro> listaCuentaAhorro;
	public List<Caja>listacaja;
	public List<LibroDiario>listalibroDiario;
	Administrador ad=new Administrador();
	Socio so=new Socio();
	
	public controlador() {
		listaCuentaAhorro= new ArrayList<CuentaAhorro>();
		listaHistorialAhorro= new ArrayList<HistorialAhorro>();
		listacaja= new ArrayList<Caja>();
		listalibroDiario= new ArrayList<LibroDiario>();
	}
	/**
	 * Metodos del modulo de contabilidad 
	 */

	
	/**
	 * Historial de Ahorro
	 * @param cuentaAhorro
	 * @return
	 */
	public List<HistorialAhorro >agregarHistorial(HistorialAhorro historial) {
		listaHistorialAhorro.add(historial);
		return listaHistorialAhorro;
		
	}
	public List<HistorialAhorro> listarHistorial() {	
		
	for (int i = 0; i < listaHistorialAhorro.size(); i++) {
		System.out.println(listaHistorialAhorro);
	}
	return  listaHistorialAhorro;
		
	}
	
	/**
	 * Cartera Credito
	 * @param credito
	 * @return
	 */
	public List<CarteraCreditos >agregarCarteraCredito(CarteraCreditos  carteraCredito) {
	listaCarteraCreditos.add(carteraCredito);
		return listaCarteraCreditos;
		
	}
	
	public List<CarteraCreditos> listarCarteraCredito() {		
		for (int i = 0; i < listaCarteraCreditos.size(); i++) {
			System.out.println(listaCarteraCreditos);
		}
		return listaCarteraCreditos;	
	}
	/**
	 * Libro  diario
	 */
	public List<LibroDiario> agregarCarteraCreditoenLibroDiario(CarteraCreditos cartera){
		LibroDiario lib =  new LibroDiario();
		lib.addCarteraCredito(cartera);
		listalibroDiario.add(lib);
		return listarLibroDiario();
		
	}
	public List<LibroDiario> agregarHistorialCreditoenLibroDiario(HistorialAhorro hisAhorro){
		LibroDiario lib =  new LibroDiario();
		lib.addHistorialCredito(hisAhorro);
		listalibroDiario.add(lib);
		return listalibroDiario;
		
	}
	public List<LibroDiario> listarLibroDiario() {		
		for (int i = 0; i < listalibroDiario.size(); i++) {
			System.out.println(listalibroDiario);
		}
		return listalibroDiario;	
	}
	
	/**
	 * Caja
	 */
	
	public List<Caja >agregarCaja(Caja caja) {
		listacaja.add(caja);
			return listacaja;
			
	}
	public List<Caja> listarCaja() {		
		for (int i = 0; i < listacaja.size(); i++) {
			System.out.println(listacaja);
		}
		return listacaja;	
	}
	
	public double calcularTotal(Egreso egreso, Ingreso ingreso) {
		double egresos=egreso.getTotal();
		double ingresos=ingreso.getTotal();
		return egresos+ingresos;		
	}
	
	public double calcularEgreso(Egreso egreso) {
	double	montoInicial=egreso.getMontoInicial();
	double	interesAhorro=egreso.getIngreseAhorro();
	double	interesesOtraInstitucion= egreso.getInteresesOtraInstitucion();
		egreso.setTotal(montoInicial+interesAhorro+interesesOtraInstitucion);
		return montoInicial+interesAhorro+interesesOtraInstitucion;		
	}
	
	public double calcularIngreso(Ingreso ingreso,Transaccion transaccion) {
		
		//Transaccion transaccion= new Transaccion();
		double montoinicial=ingreso.getMontoInicial();
		double valorTransaccion=transaccion.getMonto();
		double interesMora=ingreso.getInteres();
		double multas=ingreso.getMulta();
		ingreso.setTotal(montoinicial+valorTransaccion+interesMora+multas);
		return montoinicial+valorTransaccion+interesMora+multas;		
	}
	
	
	//Controlador para modulo Socio
	
	
	
}
