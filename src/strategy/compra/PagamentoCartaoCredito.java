package strategy.compra;

import java.math.BigDecimal;

public class PagamentoCartaoCredito implements PagamentoStrategy {  // Estrategia Concreta

    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagou no credito " + valor);
    }
}
