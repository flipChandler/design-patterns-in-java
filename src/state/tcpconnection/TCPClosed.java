package state.tcpconnection;

import state.orcamento.desconto.exception.DomainException;

public class TCPClosed extends TCPState {

    @Override
    protected void open() {
        throw new DomainException("Nao e possivel abrir uma conexao que ja esta fechada!");
    }

    @Override
    protected void close() {
        throw new DomainException("Nao e possivel fechar uma conexao ja fechada!");
    }

    @Override
    protected void acknowledge() {
        throw new DomainException("Nao e possivel ACK em uma conexao ja fechada!");
    }
}
