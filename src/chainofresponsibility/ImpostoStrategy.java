package chainofresponsibility;

import java.math.BigDecimal;

public interface ImpostoStrategy {

    BigDecimal calcula(Orcamento orcamento);
}
