package ups.edu.ec.modelo.transaccion;

import java.util.List;

import ups.edu.ec.modelo.usuario.Socio;

public class CuentaAhorro {

	private String numeroCuenta;
	private double saldo;
	private Socio socio;
	private int capital;
	private List<Transaccion>transaccion;
	public CuentaAhorro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CuentaAhorro(String numeroCuenta, double saldo, Socio socio, int capital, List<Transaccion> transaccion) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.socio = socio;
		this.capital = capital;
		this.transaccion = transaccion;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public List<Transaccion> getTransaccion() {
		return transaccion;
	}
	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}
	@Override
	public String toString() {
		return "CuentaAhorro [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", socio=" + socio + ", capital="
				+ capital + ", transaccion=" + transaccion + "]";
	}
	
	
	
}
