package br.com.ifma.evento.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import br.com.ifma.evento.modelo.Evento;
import br.com.ifma.evento.util.JPAUtil;

@Stateless
public class EventoDAO {
	
	private List<Evento> listarClientesPorEvento;
	
	@PersistenceContext(unitName = "evento")
	public EntityManager manager = new JPAUtil().getEntityManager();

	@Transactional
	public Evento insert(Evento evento) {
		
		if(evento.getCliente() == null) {
			System.out.println("É preciso inserir um cliente antes de inserir um evento");
		}
		manager.persist(evento);
		
		return evento;
	}

	public Evento update(Evento evento) {
		manager.merge(evento);
		return evento;
	}

	public void delete(Evento evento) {
		if(evento.getCliente() != null) {
			System.out.println("Não é possível remover um evento vinculado ao cliente até seu encerramento");
		}
		manager.remove(evento);
	}

	public Evento findByPrimaryKey(Integer eventoId) {
		return manager.find(Evento.class, eventoId);
	}
	
	@Transactional
	public Evento findByClientesPorEvento(String nomeEvento){
		//listarClientesPorEvento = new ArrayList<>();
	
		/*String sql = "Select e From Evento e, Cliente c "
				+ " where  e.cliente.id = c.id"
				+ " and e.nomeEvento = :nomeEvento";*/
		
		String sql = "select e.* from evento e, cliente c where c.id = e.cliente_id and e.nome_evento like :nomeEvento";
		
		EventoDAO dao = null;
		
		try {
			dao = InitialContext.doLookup("java:global/reunire/EventoDAO");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Query query = dao.manager.createNativeQuery(sql, Evento.class);
		query.setParameter("nomeEvento", "%" + nomeEvento + "%");
		
		listarClientesPorEvento = query.getResultList();
		//listarClientesPorEvento = query.getResultList();
		
		/*for (Evento evento : listarClientesPorEvento) {
			System.out.println("Cliente: " + evento.toString());
		}*/
		
		return listarClientesPorEvento.get(0);
	}

	public List<Evento> findAll() {
		String sql = "Select e From Evento e ";
		Query q = manager.createQuery(sql);
		
		List<Evento> eventos = q.getResultList();
		
		return eventos;
	}
}
