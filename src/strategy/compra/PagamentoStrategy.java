package strategy.compra;

import java.math.BigDecimal;

public interface PagamentoStrategy {    // Strategy Interface

    void pagar(BigDecimal valor);
}
