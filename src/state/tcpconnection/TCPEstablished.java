package state.tcpconnection;

import state.orcamento.desconto.exception.DomainException;

public class TCPEstablished extends TCPState {

    @Override
    protected void open() {
        throw new DomainException("Nao e possivvel abrir uma conexao que ja esta estabelecida!");
    }

    @Override
    protected void close() {
        System.out.println("Conexao fechada com sucesso!");
    }

    @Override
    protected void acknowledge() {
        System.out.println("ACK");
    }
}
