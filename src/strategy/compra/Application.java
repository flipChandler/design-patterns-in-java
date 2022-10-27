package strategy.compra;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        Compra compra = new Compra(new BigDecimal("150.23"));

        compra.processarCompra(new PagamentoCartaoCredito());
        compra.processarCompra(new PagamentoCartaoDebito());
    }
}
