package ups.edu.ec.controlador;

import java.util.ArrayList;

import ups.edu.ec.modelo.usuario.Administrador;
import ups.edu.ec.modelo.usuario.EstadoCuenta;
import ups.edu.ec.modelo.usuario.Socio;

public class controlador {

	
	//Controlador para modulo Socio
	Administrador ad=new Administrador();
	Socio so=new Socio();
	
	public String mostrarListaSocio(Socio so) {
		return so.toString();
	}
	
	public ArrayList eliminarSocio(Socio so) {
       ArrayList list1= ingresarSocio(so);
       list1.remove(so);
       return list1;
       
	}
	
	public ArrayList modificarSocio(Socio so) {
		ArrayList list1= ingresarSocio(so);
	    list1.set(so.getCod(), so);
	    return list1;
	}
	
	public ArrayList ingresarSocio(Socio so) {
		ArrayList list=new ArrayList();
		list.add(so);
		return list;
		
	}
	
	public boolean iniciarSesion(String correo,String contraseña) {
		boolean validacion=false;
		if(correo.equals(so.getCorreo())) {
			System.out.print("Correo correcto");
			validacion=true;
		}else {
			System.out.print("Correo incorrecto");
		}
		
		if(contraseña.equals(so.getContraseña())) {
			System.out.print("Contraseña correcta");
			validacion=true;
		}else {
			System.out.print("Contraseña incorrecta");
		}
		
		return validacion;
	}
	
	//tengo que ver el requerimiento
	public void solicitarCredito() {
		
	}
	
	public ArrayList agregarEstadoCuenta(EstadoCuenta cuenta) {
		ArrayList estado=new ArrayList();
		estado.add(cuenta);
		return estado;
	}
	
	
	public float calcularSaldo(double saldo,double interes) {
		return (float)(saldo*interes);
	}
	
	
	
	
	
}
