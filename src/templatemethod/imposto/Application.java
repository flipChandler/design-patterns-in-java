package templatemethod.imposto;

public class Application {

    public static void main(String[] args) {
        ImpostoStrategy iss = new Iss();
        ImpostoStrategy icms = new Icms();
        ImpostoStrategy icpp = new Icpp();
        ImpostoStrategy ikcv= new Ikcv();

        Orcamento orcamento = new Orcamento(1000.0);
        orcamento.adicionaItem(new Item("maquina fotografica", 5000.0));

        CalculadorDeImposto calculadorIss = new CalculadorDeImposto(iss);
        CalculadorDeImposto calculadorIcms = new CalculadorDeImposto(icms);
        CalculadorDeImposto calculadorIcpp = new CalculadorDeImposto(icpp);
        CalculadorDeImposto calculadorIkcv = new CalculadorDeImposto(ikcv);

        calculadorIss.calcularImpostoSobre(orcamento);
        calculadorIcms.calcularImpostoSobre(orcamento);
        calculadorIcpp.calcularImpostoSobre(orcamento);
        calculadorIkcv.calcularImpostoSobre(orcamento);
    }
}
