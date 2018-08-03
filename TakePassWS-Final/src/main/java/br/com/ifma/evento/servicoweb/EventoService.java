package br.com.ifma.evento.servicoweb;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.ifma.evento.dao.EventoDAO;
import br.com.ifma.evento.modelo.Evento;

@WebService
public class EventoService {

	@WebMethod
	public Evento listarClientesPorEvento(String nomeEvento){
		
		Evento evento;
		
		EventoDAO facadeBean = new EventoDAO();
		
		evento = facadeBean.findByClientesPorEvento(nomeEvento);
		
		return evento;
	}
}