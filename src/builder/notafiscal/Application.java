package builder.notafiscal;

import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<ItemNota> itens = List.of(new ItemNota("item 1", 200.0), new ItemNota("item 2", 500.0));

        NotaFiscal notaFiscal = new NotaFiscal("razao social teste",
                "100209990001-99",
                LocalDate.now(),
                itens,
                "observacao teste");

        System.out.println(notaFiscal);

        NotaFiscal notaFiscalBuilder = new NotaFiscalBuilder()
                .razaoSocial("razao social teste")
                .cnpj("100209990001-99")
                .dataEmissao()
                .itens(itens)
                .observacoes("observacao teste")
                .build();

        System.out.println(notaFiscalBuilder);
    }
}
