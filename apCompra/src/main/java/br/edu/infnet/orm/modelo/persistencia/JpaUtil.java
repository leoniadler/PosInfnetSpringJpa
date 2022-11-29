package br.edu.infnet.orm.modelo.persistencia;

import java.util.List;

import br.edu.infnet.orm.modelo.entidade.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("pu");
	}

	public static EntityManager createEntityManager() {
		
		return emf.createEntityManager();
	}
	
	
	
}
