package ups.edu.ec.modelo.transaccion;

public class TablaAmortizacion {

	private  double montoCredito;
	private int tablaInteres;
	private double pagoMensual;
	public TablaAmortizacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TablaAmortizacion(double montoCredito, int tablaInteres, double pagoMensual) {
		super();
		this.montoCredito = montoCredito;
		this.tablaInteres = tablaInteres;
		this.pagoMensual = pagoMensual;
	}
	public double getMontoCredito() {
		return montoCredito;
	}
	public void setMontoCredito(double montoCredito) {
		this.montoCredito = montoCredito;
	}
	public int getTablaInteres() {
		return tablaInteres;
	}
	public void setTablaInteres(int tablaInteres) {
		this.tablaInteres = tablaInteres;
	}
	public double getPagoMensual() {
		return pagoMensual;
	}
	public void setPagoMensual(double pagoMensual) {
		this.pagoMensual = pagoMensual;
	}
	@Override
	public String toString() {
		return "TablaAmortizacion [montoCredito=" + montoCredito + ", tablaInteres=" + tablaInteres + ", pagoMensual="
				+ pagoMensual + "]";
	}
	
	
	
}
