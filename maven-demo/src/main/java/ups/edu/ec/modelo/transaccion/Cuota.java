package ups.edu.ec.modelo.transaccion;

import java.util.Date;

public class Cuota {

	private int id;
	private Date fecha;
	private double monto;
	private int numCuota;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getNumCuota() {
		return numCuota;
	}
	public void setNumCuota(int numCuota) {
		this.numCuota = numCuota;
	}
	
	
	public Cuota() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuota(int id, Date fecha, double monto, int numCuota) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.monto = monto;
		this.numCuota = numCuota;
	}
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", numCuota=" + numCuota + "]";
	}
	
	
	
	
}
