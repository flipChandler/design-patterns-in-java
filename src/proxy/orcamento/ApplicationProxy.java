package proxy.orcamento;

import java.math.BigDecimal;

public class ApplicationProxy {

    public static void main(String[] args) {
        Orcamento orcamentoAntigo = new Orcamento();
        orcamentoAntigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        orcamentoAntigo.reprovar();

        Orcamento orcamentoNovo = new Orcamento();
        orcamentoNovo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
        orcamentoNovo.adicionarItem(orcamentoAntigo); // adiciona Orcamento ou ItemOrcamento

        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoNovo);
        System.out.println(proxy.getValor()); // 1200 -- demorou 2 segundos pra printar
        System.out.println(proxy.getValor()); // 1200 -- print instantâneo
        System.out.println(proxy.getValor()); // 1200 -- print instantâneo
        System.out.println(proxy.getValor()); // 1200 -- print instantâneo
        System.out.println(proxy.getValor()); // 1200 -- print instantâneo
    }
}
