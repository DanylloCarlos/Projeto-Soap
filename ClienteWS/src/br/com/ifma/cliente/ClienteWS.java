package br.com.ifma.cliente;

import java.rmi.RemoteException;

import br.com.ifma.evento.servicoweb.Evento;
import br.com.ifma.evento.servicoweb.EventoService;
import br.com.ifma.evento.servicoweb.EventoServiceProxy;

public class ClienteWS {

	public static void main(String[] args) {
		EventoService eventoService = new EventoServiceProxy();
		
		try {
			Evento evento = eventoService.listarClientesPorEvento("show de humor");
			System.out.println("Evento:  " + evento.getNomeEvento());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
