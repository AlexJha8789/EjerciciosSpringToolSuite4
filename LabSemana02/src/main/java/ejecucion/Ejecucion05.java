package ejecucion;

import pe.edu.cibertec.proyemp.jpa.dao.EmpleadoDAO;
import pe.edu.cibertec.proyemp.jpa.entidades.Empleado;

public class Ejecucion05 {

	public static void main(String[] args) {
		
		EmpleadoDAO empleadoDAO=new EmpleadoDAO();
		
		Empleado empleado=new Empleado();
		empleado.setIdEmpleado(15);
		
		empleadoDAO.eliminar(empleado.getIdEmpleado());
		
		System.out.println("Empleado eliminado");

	}

}
