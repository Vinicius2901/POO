package negocio;

import dados.Cidade;
import dados.Cliente;
import dados.Reserva;

public class ReservaPassagem {
	private Cidade[] listaDeCidades = new Cidade[10];
	private Cliente[] listaDeClientes = new Cliente[10];
	private int numCidades = 0;
	private int numClientes = 0;
	private int numReservas = 0;
	
	public int getNumCidades() {
		return numCidades;
	}

	public void setNumCidades(int numCidades) {
		this.numCidades = numCidades;
	}

	public int getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}
	
	public void cadastrarCidade( Cidade cidade ) {
		if( numCidades < 10 ) {
			this.listaDeCidades[numCidades] = cidade;
			numCidades++;
		}
	}
	
	public void cadastrarCliente( Cliente cliente ) {
		if( numClientes < 10 ) {
			this.listaDeClientes[numClientes] = cliente;
			numClientes++;
		}
	}
	
	public void reservarIda( Cliente cliente, Reserva reserva ) {
		reserva.setNumReserva( numReservas );
		numReservas++;
		cliente.reservarIda(reserva);
	}
	
	public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta) {

        ida.setNumReserva(this.numReservas);
        this.numReservas++;

        volta.setNumReserva(this.numReservas);
        this.numReservas++;

        cliente.reservarVolta(ida, volta);
    }
	
	public Cliente buscaCliente( String cpf ) {
		for( int i = 0; i < numClientes; i++ ) {
			if( this.listaDeClientes[i].getCpf() == cpf ) {
				return this.listaDeClientes[i];
			}
		}
		return null;
	}
	
	public Reserva[] mostrarReservas( String cpfCliente ) {
		Cliente cliente = buscaCliente( cpfCliente );
		if( cliente != null ) {
			return cliente.getReservas();
		}
		return null;
	}
	
	public Cliente mostrarClientes( int index ) {
		return this.listaDeClientes[index];
	}

	public Cidade mostrarCidades( int index ) {
		return this.listaDeCidades[index];
	}

}
