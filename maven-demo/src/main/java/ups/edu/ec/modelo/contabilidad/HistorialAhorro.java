package ups.edu.ec.modelo.contabilidad;

import java.util.Date;

import ups.edu.ec.modelo.transaccion.CuentaAhorro;

public class HistorialAhorro {

	private int id;
	private String fecha;
	private CuentaAhorro cuentaahorro;
	public HistorialAhorro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HistorialAhorro(int id, String fecha, CuentaAhorro cuentaahorro) {
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String string) {
		this.fecha = string;
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
