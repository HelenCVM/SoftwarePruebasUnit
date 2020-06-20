package ups.edu.ec.controlador;

import java.util.ArrayList;

import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.Cuota;
import ups.edu.ec.modelo.usuario.Administrador;
import ups.edu.ec.modelo.usuario.EstadoCuenta;
import ups.edu.ec.modelo.usuario.Socio;

public class controladorusuario {

	public String mostrarListaSocio(Socio so) {
		return so.toString();
	}
	
	public ArrayList<Socio> eliminarSocio(Socio so) {
       ArrayList<Socio> list1= ingresarSocio(so);
       list1.remove(so);
       return list1;
	}
	
	public ArrayList<Socio> modificarSocio(Socio so) {
		ArrayList<Socio> list1= ingresarSocio(so);
	    Socio socio1=new Socio();
	    socio1.setId(1);
	    list1.set(socio1.getId(), so);
	    return list1;
	}
	
	public ArrayList<Socio> ingresarSocio(Socio so) {
		ArrayList<Socio> list=new ArrayList<Socio>();
		list.add(so);
		return list;
		
	}
	
	public boolean iniciarSesion(String correo,String contraseña) {
		boolean validacion=false;
		Socio socio=new Socio();
		socio.setCod(1);
		socio.setNombreCompleto("Juan Sebastian");
		socio.setApellidosCompletos("Vasquez");
		socio.setCorreo("juanv@gmail.com");
		socio.setContraseña("1234");
		
		if(correo.equals(socio.getCorreo())) {
			System.out.print("Correo correcto");
			validacion=true;
		}else {
			System.out.print("Correo incorrecto");
		}
		
		if(contraseña.equals(socio.getContraseña())) {
			System.out.print("Contraseña correcta");
			validacion=true;
		}else {
			System.out.print("Contraseña incorrecta");
		}
		
		return validacion;
	}
	
	//tengo que ver el requerimiento
	public boolean solicitarCredito() {
		Cuota cuota=new Cuota();
		cuota.setNumCuota(2);
		cuota.setMonto(10.50);
		Credito credito=new Credito();
		credito.setNombreRecomienda("Luz Maria Velez");
		credito.setCedulaRecomienda("0131569812");
		credito.setCuotas(cuota);
		credito.setAceptado(true);
		boolean valor=credito.isAceptado();
		
		if(valor == true) {
			return valor;
		}
		
		return valor;
		
	}
	
	public ArrayList<EstadoCuenta> agregarEstadoCuenta(EstadoCuenta cuenta) {
		ArrayList<EstadoCuenta> estado=new ArrayList<EstadoCuenta>();
		estado.add(cuenta);
		return estado;
	}
	
	
	public float calcularSaldo(double saldo,double interes) {
		float resultadofinal=(float) (saldo*interes);
		return (float) resultadofinal;
	}
	
	
	public float calcularInteres(double saldofinal,double interes,double tasa) {
		float resultadoparcial=(float) (interes*tasa);
		float resultadofinal=(float) (saldofinal/resultadoparcial);
		return (float) resultadofinal;
	}
	
	
	public ArrayList<Administrador> agregarAdministrador(Administrador ad) {
		ArrayList<Administrador> lista=new ArrayList<Administrador>();
		lista.add(ad);
		return lista;
	}
	
	
	/**
	 * 
	 * @param saldoinicial
	 * @param saldofinal
	 * @return
	 */
	public float generarSaldo(double saldoinicial,double saldofinal) {
		float resultadofinal=(float) (saldofinal+saldoinicial);
		return (float) resultadofinal;
	}
	
	
	public float generarInteres(double saldo,double interes) {
		float resultadofinal=(float) (saldo*interes);
		return (float) resultadofinal;
	}
}
