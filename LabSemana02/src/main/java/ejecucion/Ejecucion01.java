package ejecucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pe.edu.cibertec.proyemp.jpa.entidades.Departamento;

public class Ejecucion01 {

	public static void main(String[] args) {
		//Creando la la fabrica de Entitu manager
		 EntityManagerFactory fabrica= Persistence.createEntityManagerFactory("PE");
		 
		 //Creando el Entity Manager
		 EntityManager manager = fabrica.createEntityManager();
		 
		 //Manejo de los objetos
		 
		 Departamento departamento01 = new Departamento();
		 departamento01.setNombreDepartamento("FINANZAS");
		 
		 Departamento departamento02 = new Departamento();
		 departamento02.setNombreDepartamento("RECURSOS HUMANOS");
	
		 try {
			 
			 manager.getTransaction().begin();
			 
			 manager.persist(departamento01);
			 manager.persist(departamento02);
			 
			 manager.getTransaction().commit();
			 System.out.println("Registro exitoso");
			
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
