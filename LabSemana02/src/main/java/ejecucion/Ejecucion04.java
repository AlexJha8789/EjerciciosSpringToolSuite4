package ejecucion;

import pe.edu.cibertec.proyemp.jpa.dao.EmpleadoDAO;
import pe.edu.cibertec.proyemp.jpa.entidades.Departamento;
import pe.edu.cibertec.proyemp.jpa.entidades.Empleado;

public class Ejecucion04 {

	public static void main(String[] args) {

		EmpleadoDAO empleadoDAO= new EmpleadoDAO();
		
		Departamento departamento=new Departamento();
		departamento.setIdDepartamento(1);
		
		Empleado empleado=new Empleado();
		empleado.setIdEmpleado(15);
		empleado.setNombre("Mirko");
		empleado.setApePaterno("Ruiz");
		empleado.setApeMaterno("Ramos");
		empleado.setDireccion("Av brasil 789");
		empleado.setDepartamento(departamento);
		
		empleadoDAO.actualizar(empleado);
		
		System.out.println("Empleado actualizado");

	}

}
