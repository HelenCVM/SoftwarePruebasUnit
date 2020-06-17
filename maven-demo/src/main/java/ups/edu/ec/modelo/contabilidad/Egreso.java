package ups.edu.ec.modelo.contabilidad;

import java.util.Date;

public class Egreso {

	private double montoInicial;
	private Date fecha;
	private int ingreseAhorro;
	public Egreso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Egreso(double montoInicial, Date fecha, int ingreseAhorro) {
		super();
		this.montoInicial = montoInicial;
		this.fecha = fecha;
		this.ingreseAhorro = ingreseAhorro;
	}
	public double getMontoInicial() {
		return montoInicial;
	}
	public void setMontoInicial(double montoInicial) {
		this.montoInicial = montoInicial;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIngreseAhorro() {
		return ingreseAhorro;
	}
	public void setIngreseAhorro(int ingreseAhorro) {
		this.ingreseAhorro = ingreseAhorro;
	}
	@Override
	public String toString() {
		return "Egreso [montoInicial=" + montoInicial + ", fecha=" + fecha + ", ingreseAhorro=" + ingreseAhorro + "]";
	}
	
	
	
}
