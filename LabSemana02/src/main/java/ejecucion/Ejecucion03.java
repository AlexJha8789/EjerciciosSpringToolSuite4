package ejecucion;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.cibertec.proyemp.jpa.dao.EmpleadoDAO;
import pe.edu.cibertec.proyemp.jpa.entidades.Departamento;
import pe.edu.cibertec.proyemp.jpa.entidades.Empleado;

public class Ejecucion03 {

	public static void main(String[] args) {

		EmpleadoDAO empleadoDAO=new EmpleadoDAO();
		
		Departamento departamento=new Departamento();
		departamento.setIdDepartamento(1);
		
		Empleado empleado= new Empleado();
		empleado.setDni("40677190");
		empleado.setFechaNacimiento(fecha("1980-07-08"));
		empleado.setEstadoCivil("Soltero");
		empleado.setNombre("Alex");
		empleado.setApePaterno("Herrera");
		empleado.setApeMaterno("Alvan");
		empleado.setDireccion("Av El mundo 879");
		empleado.setSalario(new BigDecimal(25000.75));
		empleado.setFechaIngreso(fecha("2022-09-24"));
		empleado.setDepartamento(departamento);
		
		empleadoDAO.insertar(empleado);
		
		System.out.println("Empleado incertado");

	}
	static Date fecha(String cadenaFecha) {

		 
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

		Date fecha = null;

 

		try {

 

			fecha = formato.parse(cadenaFecha);

		} catch (Exception e) {

			// TODO: handle exception

			System.out.println("Ocurrio algo inesperado: "+e.getMessage());

		}

		return fecha;

	}

}
