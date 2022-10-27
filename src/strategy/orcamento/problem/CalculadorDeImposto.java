package strategy.orcamento.problem;

public class CalculadorDeImposto {

    public void realizaCalculo(Orcamento orcamento, String imposto) {
        if (imposto.equals("ICMS")) {
            double icms = new Icms().calculaIcms(orcamento);
            System.out.println(icms);
        } else if (imposto.equals("ISS")) {
            double iss = new Iss().calculaIss(orcamento);
            System.out.println(iss);
        }
    }
}
