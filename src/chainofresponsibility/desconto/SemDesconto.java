package chainofresponsibility.desconto;

import java.math.BigDecimal;

public class SemDesconto extends DescontoAbstract {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcularDescontoSobre(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
