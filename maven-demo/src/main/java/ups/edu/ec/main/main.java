package ups.edu.ec.main;

import java.util.ArrayList;
import java.util.List;

import ups.edu.ec.controlador.controlador;
import ups.edu.ec.modelo.contabilidad.HistorialAhorro;
import ups.edu.ec.modelo.transaccion.CuentaAhorro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		controlador con= new controlador();
		HistorialAhorro historal = new HistorialAhorro();
		
		CuentaAhorro cuentaAhorro= new CuentaAhorro();
		cuentaAhorro.setCapital(200);
		cuentaAhorro.setNumeroCuenta("0003336844");
		cuentaAhorro.setSaldo(200);
		System.out.println(cuentaAhorro);
		historal.setFecha("22/22/2020");
		historal.setId(1);
		historal.setCuentaahorro(cuentaAhorro);
		
		
		System.out.println("prueba");
		con.agregarHistorial(historal);
		System.out.println("-kskdjnskjdfk");
		System.out.println(con.listaHistorialAhorro);	
		

		ArrayList array= new ArrayList();
		System.out.println(array);
		
		String ro="[]";
		System.out.println(ro);
		
		ArrayList array1= new ArrayList();
		System.out.println(array1);
		
		if(array.equals(array1)) {
			System.out.println("ok");
		}
		
		
		}
	
	
}

