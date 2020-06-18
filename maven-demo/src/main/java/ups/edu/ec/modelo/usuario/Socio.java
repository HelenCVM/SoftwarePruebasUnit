package ups.edu.ec.modelo.usuario;

public class Socio extends Persona{


	 private int id;
	 private String lugarTrabajo;
	 private double montoSalario;
	 private String perfil;
	 private EstadoCuenta estado;
	 
	public Socio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Socio(int id, String lugarTrabajo, double montoSalario, String perfil, EstadoCuenta estado) {
		super();
		this.id = id;
		this.lugarTrabajo = lugarTrabajo;
		this.montoSalario = montoSalario;
		this.perfil = perfil;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	public double getMontoSalario() {
		return montoSalario;
	}

	public void setMontoSalario(double montoSalario) {
		this.montoSalario = montoSalario;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public EstadoCuenta getEstado() {
		return estado;
	}

	public void setEstado(EstadoCuenta estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", lugarTrabajo=" + lugarTrabajo + ", montoSalario=" + montoSalario + ", perfil="
				+ perfil + ", estado=" + estado + "]";
	}
	 
	 
	 

}
