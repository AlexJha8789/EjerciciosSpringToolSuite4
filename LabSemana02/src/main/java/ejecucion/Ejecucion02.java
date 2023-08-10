package ejecucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pe.edu.cibertec.proyemp.jpa.entidades.Departamento;
import pe.edu.cibertec.proyemp.jpa.entidades.Empleado;

public class Ejecucion02 {
	public static void main(String[] args) {
		//Creando la la fabrica de Entitu manager
		 EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("PE");
		 
		 //Creando el Entity Manager
		 EntityManager manager = fabrica.createEntityManager();
		 
		 //Manejo de los objetos
		 
		 //Tengo la información del departamento
		 Departamento departamento01 = new Departamento();
		 departamento01.setIdDepartamento(2);
		 departamento01.setNombreDepartamento("MARKETING");
		 
		 
		 //Información del empleado 01
		 Empleado empleado01 = new Empleado();
		 empleado01.setNombre("Juan");
		 empleado01.setApePaterno("Rau");
		 empleado01.setApeMaterno("Cabello");
		 empleado01.setDireccion("Av. Los Alisos 666");
		 empleado01.setDepartamento(departamento01);
		 
		 //Información del empleado 02
		 Empleado empleado02 = new Empleado();
		 empleado02.setNombre("Aida");
		 empleado02.setApePaterno("Mino");
		 empleado02.setApeMaterno("Vargas");
		 empleado02.setDireccion("Av. Pacheco 784");
		 empleado02.setDepartamento(departamento01);
		 		  
	
		 try {
			 
			 manager.getTransaction().begin();
			 
			 manager.persist(empleado01);
			 manager.persist(empleado02);
			 
			 manager.getTransaction().commit();
			 System.out.println("Registro Exitoso");
		 
			
		} catch (Exception e) {
			// TODO: handle exception
			manager.getTransaction().rollback();
			System.out.println("Ocurrio algo inesperado "+ e.getMessage());
			
		} finally {
			manager.close();
			System.out.println("manager cerrado");
		}
		 
		 
		 
	}
}
