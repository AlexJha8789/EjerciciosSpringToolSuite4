package ejecucion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pe.edu.cibertec.proyemp.jpa.entidades.Departamento;

public class Ejecucion01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("PE");
		EntityManager manager=fabrica.createEntityManager();
		
		Departamento departamento01= new Departamento();
		departamento01.setNombreDepartamento("FINANZAS");
		
		Departamento departamento02=new Departamento();
		departamento02.setNombreDepartamento("Recursos Humanos");
		
		try {
			manager.getTransaction().begin();
			
			manager.persist(departamento01);
			manager.persist(departamento02);
			
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
