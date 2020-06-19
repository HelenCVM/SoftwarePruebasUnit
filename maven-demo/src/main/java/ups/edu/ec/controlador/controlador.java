package ups.edu.ec.controlador;

import java.util.ArrayList;

import java.util.List;

import ups.edu.ec.modelo.contabilidad.Caja;
import ups.edu.ec.modelo.contabilidad.CarteraCreditos;
import ups.edu.ec.modelo.contabilidad.Egreso;
import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.contabilidad.Ingreso;
import ups.edu.ec.modelo.contabilidad.LibroDiario;
import ups.edu.ec.modelo.transaccion.Credito;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;
import ups.edu.ec.modelo.transaccion.Cuota;
import ups.edu.ec.modelo.transaccion.TablaAmortizacion;
import ups.edu.ec.modelo.transaccion.Transaccion;
import ups.edu.ec.modelo.usuario.Administrador;
import ups.edu.ec.modelo.usuario.EstadoCuenta;
import ups.edu.ec.modelo.usuario.Socio;

public class controlador {
	public List<HistorialAhorro> listaHistorialAhorro;
	public List<CarteraCreditos> listaCarteraCreditos;
	public List<CuentaAhorro> listaCuentaAhorro;
	public List<Caja>listacaja;
	public List<LibroDiario>listalibroDiario;
	Administrador ad=new Administrador();
	Socio so=new Socio();
	
	public controlador() {
		listaCuentaAhorro= new ArrayList<CuentaAhorro>();
		listaHistorialAhorro= new ArrayList<HistorialAhorro>();
		listacaja= new ArrayList<Caja>();
		listalibroDiario= new ArrayList<LibroDiario>();
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
	public List<LibroDiario> agregarCarteraCreditoenLibroDiario(CarteraCreditos cartera){
		LibroDiario lib =  new LibroDiario();
		lib.addCarteraCredito(cartera);
		listalibroDiario.add(lib);
		return listarLibroDiario();
		
	}
	public List<LibroDiario> agregarHistorialCreditoenLibroDiario(HistorialAhorro hisAhorro){
		LibroDiario lib =  new LibroDiario();
		lib.addHistorialCredito(hisAhorro);
		listalibroDiario.add(lib);
		return listalibroDiario;
		
	}
	public List<LibroDiario> listarLibroDiario() {		
		for (int i = 0; i < listalibroDiario.size(); i++) {
			System.out.println(listalibroDiario);
		}
		return listalibroDiario;	
	}
	
	/**
	 * Caja
	 */
	
	public List<Caja >agregarCaja(Caja caja) {
		listacaja.add(caja);
			return listacaja;
			
	}
	public List<Caja> listarCaja() {		
		for (int i = 0; i < listacaja.size(); i++) {
			System.out.println(listacaja);
		}
		return listacaja;	
	}
	
	public double calcularTotal(Egreso egreso, Ingreso ingreso) {
		double egresos=egreso.getTotal();
		double ingresos=ingreso.getTotal();
		return egresos+ingresos;		
	}
	
	public double calcularEgreso(Egreso egreso) {
		
		
	double	montoInicial=egreso.getMontoInicial();
	double	interesAhorro=egreso.getIngreseAhorro();
	double	interesesOtraInstitucion= egreso.getInteresesOtraInstitucion();
		egreso.setTotal(montoInicial+interesAhorro+interesesOtraInstitucion);
		return montoInicial+interesAhorro+interesesOtraInstitucion;		
	}
	
	public double calcularIngreso(Ingreso ingreso) {
		
		Transaccion transaccion= new Transaccion();
		double montoinicial=ingreso.getMontoInicial();
		double valorTransaccion=transaccion.getMonto();
		double interesMora=ingreso.getInteres();
		double multas=ingreso.getMulta();
		ingreso.setTotal(montoinicial+valorTransaccion+interesMora+multas);
		return montoinicial+valorTransaccion+interesMora+multas;		
	}
	
	
	//Controlador para modulo Socio
	
	
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
		return (float)(saldo*interes);
	}
	
	
	public float calcularInteres(double saldofinal,double interes,double tasa) {
		return (float)(saldofinal/(interes*tasa));
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
		
		return (float) (saldofinal+saldoinicial);
	}
	
	
	public float generarInteres(double saldo,double interes) {
		return (float)(saldo*interes);
	}
	/**
	 * Transaccion
	 * @param tra
	 * @return
	 */
	public ArrayList<Transaccion> agregarTransacciones(Transaccion tra) {
		ArrayList<Transaccion> lista=new ArrayList<Transaccion>();
		lista.add(tra);
		return lista;
	}
	
	public String generarNumeroCuenta(CuentaAhorro numero) {
		return "NDC" + numero;
	}
	
	public boolean ingresarRetiro(double monto) {
		Transaccion tra=new Transaccion();
		tra.setMonto(20.2);
		double saldo=tra.getMonto();
		
		boolean valor;
		if(monto < saldo) {
			valor=true;
		}
		else {
			valor=false;
			
		}
		
		return valor;
	}
	
	
	public double ingresarDeposito(Transaccion tra) {
		return tra.getMonto();
	}
	
	
	public ArrayList<Credito> agregarCuenta(Credito credito) {
		ArrayList<Credito> lista=new ArrayList<Credito>();
		lista.add(credito);
		return lista;
	}
	
	
	public ArrayList<TablaAmortizacion> tablaAmortizacion(TablaAmortizacion tabla) {
		ArrayList<TablaAmortizacion> lista=new ArrayList<TablaAmortizacion>();
		lista.add(tabla);
		return lista;
	}
	
	public float calcularCuota(double montocredito,double tasainteres,int cantidadmeses) {
		double interes=(montocredito*tasainteres)/100;
		float totalparcial=(float)(montocredito+interes);
		return (float)(totalparcial/cantidadmeses);	
	}
	
	
}
