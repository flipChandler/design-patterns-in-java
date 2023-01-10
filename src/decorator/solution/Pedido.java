package decorator.solution;

import java.time.LocalDateTime;

public class Pedido {

    private String cliente;
    private LocalDateTime dataCadastro;
    private Orcamento orcamento;

    public Pedido(String cliente, LocalDateTime dataCadastro, Orcamento orcamento) {
        this.cliente = cliente;
        this.dataCadastro = dataCadastro;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente='" + cliente + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", orcamento=" + orcamento +
                '}';
    }
}
