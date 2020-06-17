package ups.edu.ec.modelo.contabilidad;

import java.util.Date;

import ups.edu.ec.modelo.transaccion.CuentaAhorro;

public class HistorialAhorro {

	private int id;
	private Date fecha;
	private CuentaAhorro cuentaahorro;
	public HistorialAhorro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HistorialAhorro(int id, Date fecha, CuentaAhorro cuentaahorro) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cuentaahorro = cuentaahorro;
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
	public CuentaAhorro getCuentaahorro() {
		return cuentaahorro;
	}
	public void setCuentaahorro(CuentaAhorro cuentaahorro) {
		this.cuentaahorro = cuentaahorro;
	}
	@Override
	public String toString() {
		return "HistorialAhorro [id=" + id + ", fecha=" + fecha + ", cuentaahorro=" + cuentaahorro + "]";
	}
	
	
	
	
}
