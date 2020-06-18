package ups.edu.ec.controlador;

import java.util.ArrayList;

import java.util.List;

import ups.edu.ec.modelo.contabilidad.CarteraCreditos;
import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;


import ups.edu.ec.modelo.usuario.Administrador;
import ups.edu.ec.modelo.usuario.EstadoCuenta;
import ups.edu.ec.modelo.usuario.Socio;

public class controlador {
	public List<HistorialAhorro> listaHistorialAhorro;
	public List<CarteraCreditos> listaCarteraCreditos;
	public List<CuentaAhorro> listaCuentaAhorro;
	public controlador() {
		listaCuentaAhorro= new ArrayList<CuentaAhorro>();
		listaHistorialAhorro= new ArrayList<HistorialAhorro>();
	}
	/**
	 * Metodos del modulo de contabilidad 
	 */

	
	/**
	 * Historial de Ahorro
	 * @param cuentaAhorro
	 * @return
	 */
	public List<HistorialAhorro >agregarHistorial(HistorialAhorro historial) {
		listaHistorialAhorro.add(historial);
		return listaHistorialAhorro;
		
	}
	public List<HistorialAhorro> listarHistorial() {	
		
	for (int i = 0; i < listaHistorialAhorro.size(); i++) {
		System.out.println(listaHistorialAhorro);
	}
	return  listaHistorialAhorro;
		
	}
	
	/**
	 * Cartera Credito
	 * @param credito
	 * @return
	 */
	public List<CarteraCreditos >agregarCarteraCredito(CarteraCreditos  carteraCredito) {
	listaCarteraCreditos.add(carteraCredito);
		return listaCarteraCreditos;
		
	}
	
	public List<CarteraCreditos> listarCarteraCredito() {		
		for (int i = 0; i < listaCarteraCreditos.size(); i++) {
			System.out.println(listaCarteraCreditos);
		}
		return listaCarteraCreditos;	
	}
	/**
	 * Libro  diario
	 */
	
	

	
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
	
	public boolean iniciarSesion(String correo,String contrase�a) {
		boolean validacion=false;
		if(correo.equals(so.getCorreo())) {
			System.out.print("Correo correcto");
			validacion=true;
		}else {
			System.out.print("Correo incorrecto");
		}
		
		if(contrase�a.equals(so.getContrase�a())) {
			System.out.print("Contrase�a correcta");
			validacion=true;
		}else {
			System.out.print("Contrase�a incorrecta");
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