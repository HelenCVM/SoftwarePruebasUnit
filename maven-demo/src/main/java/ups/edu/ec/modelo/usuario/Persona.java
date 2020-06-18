package ups.edu.ec.modelo.usuario;

public abstract class Persona {
	 private int cod;
	   private String nombreCompleto;
	   private String apellidosCompletos;
	   private String numeroCedula;
	   private String direccion;
	   private String correo;
	   private String contraseña;
	   
	   
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getApellidosCompletos() {
		return apellidosCompletos;
	}
	public void setApellidosCompletos(String apellidosCompletos) {
		this.apellidosCompletos = apellidosCompletos;
	}
	public String getNumeroCedula() {
		return numeroCedula;
	}
	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	@Override
	public String toString() {
		return "Persona [cod=" + cod + ", nombreCompleto=" + nombreCompleto + ", apellidosCompletos="
				+ apellidosCompletos + ", numeroCedula=" + numeroCedula + ", direccion=" + direccion + ", correo="
				+ correo + ", contraseña=" + contraseña + "]";
	}
	   
	   
}
