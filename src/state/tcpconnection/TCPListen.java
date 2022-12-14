package state.tcpconnection;

import state.orcamento.desconto.exception.DomainException;

public class TCPListen extends TCPState {

    @Override
    protected void open() {
        System.out.println("Conexao aberta com sucesso!");
    }

    @Override
    protected void close() {
        System.out.println("Conexao fechada com sucesso!");
    }

    @Override
    protected void acknowledge() {
        throw new DomainException("ACK");
    }
}
