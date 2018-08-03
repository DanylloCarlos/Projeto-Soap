package br.com.ifma.evento.teste;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.com.ifma.evento.dao.ClienteDAO;
import br.com.ifma.evento.dao.EventoDAO;
import br.com.ifma.evento.modelo.Cliente;
import br.com.ifma.evento.modelo.Evento;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		int opcao = 0;
		teclado = new Scanner(System.in);
		do {
			System.out.println("Sistema de Compra e Venda de Ingressos");
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Incluir um Cliente");
			System.out.println("2 - Listar Clientes");
			System.out.println("3 - Cadastro de Eventos: ");
			System.out.println("4 - Listar Eventos: ");
			System.out.println("5 - Inicializar o Servidor");
			System.out.println("Digite uma opção:");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				incluirCliente();
				break;
			case 2:
				listarClientes();
				break;
			case 3:
				cadastrarEventos();
				break;
			case 4:
				listarClientesPorEventos();
				break;

			case 5:
				System.out.println("Saindo....");
				break;
			default:
				break;
			}

		} while (opcao != 4);

	}

	private static void incluirCliente() throws ClassNotFoundException, SQLException {

		teclado = new Scanner(System.in);

		System.out.println("Nome do Cliente: ");
		String nomeCliente = teclado.nextLine();

		System.out.println("Cpf do cliente: ");
		String cpf = teclado.nextLine();

		Cliente cliente = new Cliente();
		// cliente.setId(1);
		cliente.setNomeCliente(nomeCliente);
		cliente.setCpf(cpf);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.insert(cliente);

		System.out.println("Dados salvo com sucesso");
	}

	private static void listarClientes() throws ClassNotFoundException, SQLException {

		// TODO Auto-generated method stub
		List<Cliente> listaClientesSaida;
		ClienteDAO clienteDAO = new ClienteDAO();
		System.out.println("Id do cliente:");
		Integer idCliente = teclado.nextInt();

		listaClientesSaida = clienteDAO.findAll();

		for (Cliente clientes : listaClientesSaida) {

			System.out.println("IdCliente: " + clientes.getId());
			System.out.println("Nome: " + clientes.getNomeCliente());
			System.out.println("CPf: " + clientes.getCpf());
			System.out.println("******************************");
		}

	}

	private static void cadastrarEventos() throws ClassNotFoundException, SQLException {
		teclado = new Scanner(System.in);

		System.out.println("Descrição do Evento: ");
		String nomeDoEvento = teclado.nextLine();

		System.out.println("Informe o id do cliente: ");
		int idCliente = teclado.nextInt();

		ClienteDAO clienteDAO = new ClienteDAO();

		Cliente cliente = clienteDAO.findById(idCliente);
		Evento evento = new Evento();
		// evento.setId(1);
		evento.setNomeEvento(nomeDoEvento);
		evento.setCliente(cliente);

		EventoDAO eventoDAO = new EventoDAO();

		eventoDAO.insert(evento);

		System.out.println("Evento cadastrado com sucesso");
	}

	private static void listarClientesPorEventos() throws ClassNotFoundException, SQLException {
		List<Evento> listaEventosSaida;
		teclado = new Scanner(System.in);
		
		System.out.println("Informe o evento: ");
		String nomeEvento = teclado.nextLine();

		EventoDAO eventoDAO = new EventoDAO();
	/*	listaEventosSaida = eventoDAO.findByClientesPorEvento(nomeEvento);

		for (Evento evento : listaEventosSaida) {
			System.out.println("IdEvento: " + evento.getId());
			System.out.println("Nome do Evento: " + evento.getNomeEvento());
			System.out.println("IdCliente: " + evento.getCliente().getId());

			System.out.println("******************************");
		}*/

	}

	/*
	 * private static void iniciarServidor() { try {
	 * LocateRegistry.createRegistry(1099); ServicoListarEventos sla = new
	 * ServicoListarEventos(); Naming.rebind("//localhost/listareventos", sla);
	 * System.out.println("Inicializando o Servidor....");
	 * 
	 * } catch (RemoteException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (MalformedURLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
}
