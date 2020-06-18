package ups.edu.ec.controlador;

import java.util.ArrayList;
import java.util.List;

import ups.edu.ec.modelo.contabilidad.CarteraCreditos;
import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;

public class controlador {
	public List<HistorialAhorro> listaHistorialAhorro;
	public List<CarteraCreditos> listaCarteraCreditos;
	public List<CuentaAhorro> listaCuentaAhorro;
	public controlador() {
		listaCuentaAhorro= new ArrayList<CuentaAhorro>();
		listaHistorialAhorro= new ArrayList<HistorialAhorro>();
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
	
	

}
