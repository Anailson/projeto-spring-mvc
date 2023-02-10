package br.com.alura.mvc.mudi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class PedidoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Pedido> recuperaTodosPedidos(){
		
		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
	}

}
