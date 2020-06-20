package ups.edu.ec.controlador;

import java.util.ArrayList;

import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;
import ups.edu.ec.modelo.transaccion.TablaAmortizacion;
import ups.edu.ec.modelo.transaccion.Transaccion;

public class controladorTransaccion {
	/**
	 * Transaccion
	 * @param tra
	 * @return
	 */
	public ArrayList<Transaccion> agregarTransacciones(Transaccion tra) {
		ArrayList<Transaccion> lista=new ArrayList<Transaccion>();
		lista.add(tra);
		return lista;
	}
	
	public String generarNumeroCuenta(CuentaAhorro numero) {
		return "NDC" + numero;
	}
	
	public boolean ingresarRetiro(double monto) {
		Transaccion tra=new Transaccion();
		tra.setMonto(20.2);
		double saldo=tra.getMonto();
		
		boolean valor;
		if(monto < saldo) {
			valor=true;
		}
		else {
			valor=false;
			
		}
		
		return valor;
	}
	
	
	public double ingresarDeposito(Transaccion tra) {
		return tra.getMonto();
	}
	
	
	public ArrayList<Credito> agregCuenta(Credito credito) {
		ArrayList<Credito> lista=new ArrayList<Credito>();
		lista.add(credito);
		return lista;
	}
	
	
	public ArrayList<TablaAmortizacion> tablaAmortizacion(TablaAmortizacion tabla) {
		ArrayList<TablaAmortizacion> lista=new ArrayList<TablaAmortizacion>();
		lista.add(tabla);
		return lista;
	}
	
	public float calcularCuota(double montocredito,double tasainteres,int cantidadmeses) {
		double interes=(montocredito*tasainteres)/100;
		float totalparcial=(float)(montocredito+interes);
		return (float)(totalparcial/cantidadmeses);	
	}
	
	
}
