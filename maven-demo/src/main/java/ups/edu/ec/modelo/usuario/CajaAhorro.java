package ups.edu.ec.modelo.usuario;

import java.util.List;

public class CajaAhorro {
 private String nombre;
 private String direccion;
 private Administrador administrador;
 private List<Socio> socio;
public CajaAhorro() {
	super();
	// TODO Auto-generated constructor stub
}
public CajaAhorro(String nombre, String direccion, Administrador administrador, List<Socio> socio) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	this.administrador = administrador;
	this.socio = socio;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public Administrador getAdministrador() {
	return administrador;
}
public void setAdministrador(Administrador administrador) {
	this.administrador = administrador;
}
public List<Socio> getSocio() {
	return socio;
}
public void setSocio(List<Socio> socio) {
	this.socio = socio;
}
@Override
public String toString() {
	return "CajaAhorro [nombre=" + nombre + ", direccion=" + direccion + ", administrador=" + administrador + ", socio="
			+ socio + "]";
}
 
 
 
 
}
