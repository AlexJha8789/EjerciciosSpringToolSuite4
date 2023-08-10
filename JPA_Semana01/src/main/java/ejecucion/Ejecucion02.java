package ejecucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pe.edu.cibertec.proyemp.jpa.entidades.Departamento;
import pe.edu.cibertec.proyemp.jpa.entidades.Empleado;

public class Ejecucion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("PE");
		EntityManager manager=fabrica.createEntityManager();
		
		Departamento departamento01=new Departamento();
		departamento01.setIdDepartamento(2);
		departamento01.setNombreDepartamento("MARKETING");
		
		Empleado empleado01=new Empleado();
		empleado01.setNombre("Juan");
		empleado01.setApePaterno("Cavero");
		empleado01.setApeMaterno("Rau");
		empleado01.setDireccion("AV. avestruces 652");
		empleado01.setDepartamento(departamento01);
		
		Empleado empleado02=new Empleado();
		empleado02.setNombre("Raul");
		empleado02.setApePaterno("Correa");
		empleado02.setApeMaterno("Pers");
		empleado02.setDireccion("av las arcadis 1258");
		empleado02.setDepartamento(departamento01);
		
		try {
			manager.getTransaction().begin();
			
			manager.persist(empleado01);
			manager.persist(empleado02);
			
			manager.getTransaction().commit();
			System.out.println("Registro exitoso");
			
		} catch (Exception e) {
			// TODO: handle exception
			manager.getTransaction().rollback();
			System.out.println("Ocurrio algo inesperado"+e.getMessage());
		}
		finally {
			manager.close();
			System.out.println("manager cerrado");
		}
		

	}

}
