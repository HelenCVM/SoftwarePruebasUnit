package ups.edu.ec.modelo.usuario;

import java.util.Date;

public class EstadoCuenta {
private String id;
private Date fecha;
private Double saldo;
private Double instereses;
public EstadoCuenta() {
	super();
	// TODO Auto-generated constructor stub
}
public EstadoCuenta(String id, Date fecha, Double saldo, Double instereses) {
	super();
	this.id = id;
	this.fecha = fecha;
	this.saldo = saldo;
	this.instereses = instereses;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public Double getSaldo() {
	return saldo;
}
public void setSaldo(Double saldo) {
	this.saldo = saldo;
}
public Double getInstereses() {
	return instereses;
}
public void setInstereses(Double instereses) {
	this.instereses = instereses;
}
@Override
public String toString() {
	return "EstadoCuenta [id=" + id + ", fecha=" + fecha + ", saldo=" + saldo + ", instereses=" + instereses + "]";
}



}
