package pe.edu.cibertec.proyemp.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pe.edu.cibertec.proyemp.jpa.entidades.Empleado;

public class EmpleadoDAO {

	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("PE");

	public void insertar(Empleado empleado) {

		EntityManager manager = null;

		try {
			manager = fabrica.createEntityManager();
			manager.getTransaction().begin(); // inicia la transaccion
			manager.persist(empleado); // genera el JPQL internamente INSERT
			manager.getTransaction().commit(); // confirma cambios y finaliza la transaccion

		} catch (Exception e) {

			manager.getTransaction().rollback(); // revierte los cambios
			e.printStackTrace();

		} finally {

			manager.close(); // cierra el manager

		}

	}

	public void actualizar(Empleado empleado) {

		EntityManager manager = null;

		try {
			manager = fabrica.createEntityManager();
			manager.getTransaction().begin(); // inicia la transaccion
			manager.merge(empleado); // Genera el JPQL internamente update
			manager.getTransaction().commit(); // confirma cambios y finaliza la transaccion

		} catch (Exception e) {

			manager.getTransaction().rollback(); // revierte los cambios
			e.printStackTrace();
		} finally {
			manager.close(); // cierra el manager
		}

	}

	public void eliminar(int idCodigo) {

		EntityManager manager = null;

		try {

			manager = fabrica.createEntityManager();
			Empleado empleado = manager.find(Empleado.class, idCodigo);

			manager.getTransaction().begin(); // inicia la transaccion
			manager.remove(empleado); // genera el JPQL internamente el delete
			manager.getTransaction().commit(); // confirma cambio y finaliza la transaccion

		} catch (Exception e) {

			manager.getTransaction().rollback(); // revierte los cambios
			e.printStackTrace();
		} finally {

			manager.close(); // cierra el manager
		}

	}

	public Empleado buscar(int idCodigo) {

		EntityManager manager = null;

		try {
			manager = fabrica.createEntityManager();
			return manager.find(Empleado.class, idCodigo);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

}
