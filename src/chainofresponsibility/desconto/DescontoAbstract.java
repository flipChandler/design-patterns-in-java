package chainofresponsibility.desconto;

import chainofresponsibility.Orcamento;

import java.math.BigDecimal;

public abstract class DescontoAbstract {

    protected DescontoAbstract proximo;

    public DescontoAbstract(DescontoAbstract proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcularDescontoSobre(Orcamento orcamento);
}
