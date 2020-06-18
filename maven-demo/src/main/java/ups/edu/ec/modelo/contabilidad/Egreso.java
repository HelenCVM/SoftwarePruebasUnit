package ups.edu.ec.modelo.contabilidad;

import java.util.Date;

public class Egreso {

	private double montoInicial;
	private Date fecha;
	private int ingreseAhorro;
	private int interesesOtraInstitucion;
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
	
	
	public int getInteresesOtraInstitucion() {
		return interesesOtraInstitucion;
	}
	public void setInteresesOtraInstitucion(int interesesOtraInstitucion) {
		this.interesesOtraInstitucion = interesesOtraInstitucion;
	}
	@Override
	public String toString() {
		return "Egreso [montoInicial=" + montoInicial + ", fecha=" + fecha + ", ingreseAhorro=" + ingreseAhorro + "]";
	}
	
	
	
}
