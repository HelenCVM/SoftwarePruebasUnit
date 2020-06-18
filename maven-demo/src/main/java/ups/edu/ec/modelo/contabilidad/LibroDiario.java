package ups.edu.ec.modelo.contabilidad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibroDiario {

	private int cod;
	private Date fecha;
	private Caja caja;
	private int saldoinicial;
	private List<CarteraCreditos> carteracredito;
	private List<HistorialAhorro> historialahorro;
	
	
	
	public LibroDiario(int cod, Date fecha, Caja caja, List<CarteraCreditos> carteracredito,
			List<HistorialAhorro> historialahorro) {
		super();
		this.cod = cod;
		this.fecha = fecha;
		this.caja = caja;
		carteracredito = new ArrayList<CarteraCreditos>();
		historialahorro = new ArrayList<HistorialAhorro>();
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
	
	public void addHistorialCredito (HistorialAhorro historial) {
		historialahorro.add(historial);
		
	}
	
	public void addCarteraCredito (CarteraCreditos cartera) {
		carteracredito.add(cartera);
		
	}
	
	
	

	public int getSaldoinicial() {
		return saldoinicial;
	}



	public void setSaldoinicial(int saldoinicial) {
		this.saldoinicial = saldoinicial;
	}



	@Override
	public String toString() {
		return "LibroDiario [cod=" + cod + ", fecha=" + fecha + ", caja=" + caja + ", saldoinicial=" + saldoinicial
				+ ", carteracredito=" + carteracredito + ", historialahorro=" + historialahorro + "]";
	}



	
	
	
	
}
