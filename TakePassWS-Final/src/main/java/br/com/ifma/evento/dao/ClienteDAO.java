package br.com.ifma.evento.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.ifma.evento.modelo.Cliente;

@Stateless
public class ClienteDAO {
	
	@PersistenceContext(unitName="evento")
	public EntityManager manager; //= new JPAUtil().getEntityManager();

	@Transactional
	public Cliente insert(Cliente cliente) {
		manager.persist(cliente);
		
		return cliente;
		
	}

	public Cliente update(Cliente cliente) {
		manager.merge(cliente);
		return cliente;
	}

	public void delete(Cliente Cliente) {
		manager.remove(Cliente);
	}

	public Cliente findById(Integer clienteId) {
		return manager.find(Cliente.class, clienteId);
	}

	public List<Cliente> findAll() {
		 
		String sql = "Select c From Cliente c ";
		Query q = manager.createQuery(sql);
		
		List<Cliente> clientes = q.getResultList();
		
		return clientes;
	}
	
	/*public Cliente findById(Integer clienteId) {
		TypedQuery<Cliente> query = manager.createQuery(Cliente.NAME,
				Cliente.class);
		query.setParameter("clienteId", clienteId);
		return query.getSingleResult();
	}*/

	/*public Empenho findByNumeroEmpenhoEUnidadeGestoraId(String numeroEmpenho,
			Integer unidadeId) {
		String sql = "from " + Empenho.NAME
				+ " e where e.numeroEmpenho = :numeroEmpenho"
				+ " and e.unidadeId = :unidadeId";
		TypedQuery<Empenho> query = this.manager.createQuery(sql, Empenho.class);
		query.setParameter("numeroEmpenho", numeroEmpenho);
		query.setParameter("unidadeId", unidadeId);
		List<Empenho> empenhos = new ArrayList<>();
		return empenhos.isEmpty() ? null : empenhos.get(0);
	}*/
}
