package ups.edu.ec.modelo.contabilidad;

import ups.edu.ec.modelo.transaccion.Credito;

public class CarteraCreditos {

	private int id;
	private Credito credito;
	public CarteraCreditos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarteraCreditos(int id, Credito credito) {
		super();
		this.id = id;
		this.credito = credito;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Credito getCredito() {
		return credito;
	}
	public void setCredito(Credito credito) {
		this.credito = credito;
	}
	@Override
	public String toString() {
		return "CarteraCreditos [id=" + id + ", credito=" + credito + "]";
	}
	
	
	
}
