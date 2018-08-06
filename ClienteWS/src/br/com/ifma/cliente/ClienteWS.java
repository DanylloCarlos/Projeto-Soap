package br.com.ifma.cliente;

import java.rmi.RemoteException;
import java.util.List;

import br.com.ifma.evento.servicoweb.Evento;
import br.com.ifma.evento.servicoweb.EventoService;
import br.com.ifma.evento.servicoweb.EventoServiceProxy;

public class ClienteWS {

	public static void main(String[] args) {
		EventoService eventoService = new EventoServiceProxy();
		
		try {
			Evento evento = eventoService.listarClientesPorEvento("show de humor");
			System.out.println("******************************************");
				System.out.println("Evento:  " + evento.getNomeEvento());
				System.out.println("Cliente:  " + evento.getCliente().getNomeCliente());
				System.out.println("Cpf do cliente:  " + evento.getCliente().getCpf());
				System.out.println("******************************************");
				System.out.println("\n");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			Evento[] evento = eventoService.listarTodosOsClientesPorEvento("show de humor");
			
			for (Evento evento2 : evento) {
				System.out.println("******************************************");
				System.out.println("Evento:  " + evento2.getNomeEvento());
				System.out.println("Cliente:  " + evento2.getCliente().getNomeCliente());
				System.out.println("Cpf do cliente:  " + evento2.getCliente().getCpf());
				System.out.println("******************************************");
				System.out.println("\n");
			}
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}

}
