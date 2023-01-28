package composite.orcamento;


import java.math.BigDecimal;

public class ApplicationComposite {

    public static void main(String[] args) {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        orcamentoNovo.adicionarItem(orcamentoAntigo); // adiciona Orcamento ou ItemOrcamento

        System.out.println(orcamentoNovo.getValor()); // 1200
    }
}
