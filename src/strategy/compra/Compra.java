package strategy.compra;

import java.math.BigDecimal;

public class Compra {   // Contexto (Dados)

    private BigDecimal valor;

    public Compra(BigDecimal valor) {
        this.valor = valor;
    }

    public void processarCompra(PagamentoStrategy pagamentoStrategy) {
        pagamentoStrategy.pagar(valor);
    }
}
