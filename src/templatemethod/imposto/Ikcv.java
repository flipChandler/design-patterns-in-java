package templatemethod.imposto;

public class Ikcv extends TemplateImpostoCondicional {

    @Override
    protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
    }

    @Override
    protected double getMinimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected double getMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        for (var item : orcamento.getItens()) {
            if (item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }
}
