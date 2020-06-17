package ups.edu.ec.modelo.contabilidad;

import java.util.Date;
import java.util.List;

public class LibroDiario {

	private int cod;
	private Date fecha;
	private Caja caja;
	private List<CarteraCreditos> carteracredito;
	private List<HistorialAhorro> historialahorro;
	
	
	public LibroDiario(int cod, Date fecha, Caja caja, List<CarteraCreditos> carteracredito,
			List<HistorialAhorro> historialahorro) {
		super();
		this.cod = cod;
		this.fecha = fecha;
		this.caja = caja;
		this.carteracredito = carteracredito;
		this.historialahorro = historialahorro;
	}
	
	
	
	public LibroDiario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Caja getCaja() {
		return caja;
	}
	public void setCaja(Caja caja) {
		this.caja = caja;
	}
	public List<CarteraCreditos> getCarteracredito() {
		return carteracredito;
	}
	public void setCarteracredito(List<CarteraCreditos> carteracredito) {
		this.carteracredito = carteracredito;
	}
	public List<HistorialAhorro> getHistorialahorro() {
		return historialahorro;
	}
	public void setHistorialahorro(List<HistorialAhorro> historialahorro) {
		this.historialahorro = historialahorro;
	}



	@Override
	public String toString() {
		return "LibroDiario [cod=" + cod + ", fecha=" + fecha + ", caja=" + caja + ", carteracredito=" + carteracredito
				+ ", historialahorro=" + historialahorro + "]";
	}
	
	
	
	
}
