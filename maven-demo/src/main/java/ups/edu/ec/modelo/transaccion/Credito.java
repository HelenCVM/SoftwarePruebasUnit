package ups.edu.ec.modelo.transaccion;

public class Credito {

	private String nombreRecomienda;
	private String cedulaRecomienda;
	private String bancoRecomendado;
	private CuentaAhorro cuentaahorro;
	private TablaAmortizacion tablaamort;
	private String motivo;
	private Cuota cuotas;
	private boolean aceptado=true;
	
	public Credito() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Credito(String nombreRecomienda, String cedulaRecomienda, String bancoRecomendado, CuentaAhorro cuentaahorro,
			TablaAmortizacion tablaamort, String motivo, Cuota cuotas) {
		super();
		this.nombreRecomienda = nombreRecomienda;
		this.cedulaRecomienda = cedulaRecomienda;
		this.bancoRecomendado = bancoRecomendado;
		this.cuentaahorro = cuentaahorro;
		this.tablaamort = tablaamort;
		this.motivo = motivo;
		this.cuotas = cuotas;
	}
	public String getNombreRecomienda() {
		return nombreRecomienda;
	}
	public void setNombreRecomienda(String nombreRecomienda) {
		this.nombreRecomienda = nombreRecomienda;
	}
	public String getCedulaRecomienda() {
		return cedulaRecomienda;
	}
	public void setCedulaRecomienda(String cedulaRecomienda) {
		this.cedulaRecomienda = cedulaRecomienda;
	}
	public String getBancoRecomendado() {
		return bancoRecomendado;
	}
	public void setBancoRecomendado(String bancoRecomendado) {
		this.bancoRecomendado = bancoRecomendado;
	}
	public CuentaAhorro getCuentaahorro() {
		return cuentaahorro;
	}
	public void setCuentaahorro(CuentaAhorro cuentaahorro) {
		this.cuentaahorro = cuentaahorro;
	}
	public TablaAmortizacion getTablaamort() {
		return tablaamort;
	}
	public void setTablaamort(TablaAmortizacion tablaamort) {
		this.tablaamort = tablaamort;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Cuota getCuotas() {
		return cuotas;
	}
	public void setCuotas(Cuota cuotas) {
		this.cuotas = cuotas;
	}
	
	
	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	
	@Override
	public String toString() {
		return "Credito [nombreRecomienda=" + nombreRecomienda + ", cedulaRecomienda=" + cedulaRecomienda
				+ ", bancoRecomendado=" + bancoRecomendado + ", cuentaahorro=" + cuentaahorro + ", tablaamort="
				+ tablaamort + ", motivo=" + motivo + ", cuotas=" + cuotas + ", aceptado=" + aceptado + "]";
	}
	
	
	
}
