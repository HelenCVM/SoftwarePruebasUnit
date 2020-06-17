package ups.edu.ec.modelo.transaccion;

import java.util.Date;

public class Transaccion {

	private int id;
	private Date fecha;
	private double monto;
	private String ciudad;
	private String tipoTransaccion;
	public Transaccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaccion(int id, Date fecha, double monto, String ciudad, String tipoTransaccion) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.monto = monto;
		this.ciudad = ciudad;
		this.tipoTransaccion = tipoTransaccion;
	}
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
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", ciudad=" + ciudad
				+ ", tipoTransaccion=" + tipoTransaccion + "]";
	}
	
	
}
