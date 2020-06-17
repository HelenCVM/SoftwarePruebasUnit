package ups.edu.ec.modelo.contabilidad;

import java.util.List;

public class Caja {

	private List<Egreso>egreso;
	private List<Ingreso>ingreso;
	public Caja() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Caja(List<Egreso> egreso, List<Ingreso> ingreso) {
		super();
		this.egreso = egreso;
		this.ingreso = ingreso;
	}
	public List<Egreso> getEgreso() {
		return egreso;
	}
	public void setEgreso(List<Egreso> egreso) {
		this.egreso = egreso;
	}
	public List<Ingreso> getIngreso() {
		return ingreso;
	}
	public void setIngreso(List<Ingreso> ingreso) {
		this.ingreso = ingreso;
	}
	@Override
	public String toString() {
		return "Caja [egreso=" + egreso + ", ingreso=" + ingreso + "]";
	}
	
	
	
	
}
