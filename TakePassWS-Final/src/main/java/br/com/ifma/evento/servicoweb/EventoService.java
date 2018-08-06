package br.com.ifma.evento.servicoweb;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.ifma.evento.dao.EventoDAO;
import br.com.ifma.evento.modelo.Evento;

@WebService
public class EventoService {

	@WebMethod
	public Evento listarClientesPorEvento(String nomeEvento){
		
		Evento evento;
		
		EventoDAO evemtoDAO = new EventoDAO();
		
		evento = evemtoDAO.findByClientesPorEvento(nomeEvento);
		
		return evento;
	}
	
	@WebMethod
	public List<Evento> listarTodosOsClientesPorEvento(String nomeEvento){
		
		List<Evento> colEventos;
		
		EventoDAO eventoDAO = new EventoDAO();
		
		colEventos = eventoDAO.findAllClientesPorEvento(nomeEvento);
		
		return colEventos;
	}
}