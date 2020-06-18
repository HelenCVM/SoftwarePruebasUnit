package ups.edu.ec.modelo.contabilidad;

import java.util.Date;
import java.util.List;

import ups.edu.ec.modelo.transaccion.Transaccion;

public class Ingreso {

	private double montoInicial;
	private List<Transaccion> transaccion;
	private Date fecha;
	private int interes;
	private double multa;
	private double total;
	
	
	
	public Ingreso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ingreso(double montoInicial, List<Transaccion> transaccion, Date fecha, int interes, double multa) {
		super();
		this.montoInicial = montoInicial;
		this.transaccion = transaccion;
		this.fecha = fecha;
		this.interes = interes;
		this.multa = multa;
	}
	public double getMontoInicial() {
		return montoInicial;
	}
	public void setMontoInicial(double montoInicial) {
		this.montoInicial = montoInicial;
	}
	public List<Transaccion> getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getInteres() {
		return interes;
	}
	public void setInteres(int interes) {
		this.interes = interes;
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Ingreso [montoInicial=" + montoInicial + ", transaccion=" + transaccion + ", fecha=" + fecha
				+ ", interes=" + interes + ", multa=" + multa + ", total=" + total + "]";
	}
	
	
	
	
	
}
