package ejecucion;

import pe.edu.cibertec.proyemp.jpa.dao.EmpleadoDAO;
import pe.edu.cibertec.proyemp.jpa.entidades.Empleado;

public class Ejecucion06 {

	public static void main(String[] args) {

		EmpleadoDAO empleadoDAO=new EmpleadoDAO();
		
		Empleado empleado=empleadoDAO.buscar(2);
		
		System.out.println("Codigo:"+empleado.getIdEmpleado());
		System.out.println("Nombre:"+empleado.getNombre());
		System.out.println("ApePat:"+empleado.getApePaterno());
		System.out.println("ApeMat:"+empleado.getApeMaterno());
		System.out.println("Direccion:"+empleado.getDireccion());
		System.out.println("Departamento:"+empleado.getDepartamento().getNombreDepartamento());

	}

}
