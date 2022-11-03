package builder.notafiscal;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscalBuilder {

    private NotaFiscal notaFiscal;

    public NotaFiscalBuilder() {
        this.notaFiscal = new NotaFiscal();
    }

    public NotaFiscalBuilder razaoSocial(String razaoSocial) {
        this.notaFiscal.setRazaoSocial(razaoSocial);
        return this;
    }

    public NotaFiscalBuilder cnpj(String cnpj) {
        this.notaFiscal.setCnpj(cnpj);
        return this;
    }

    public NotaFiscalBuilder dataEmissao() {
        this.notaFiscal.setDataEmissao(LocalDate.now());
        return this;
    }

    public NotaFiscalBuilder itens(List<ItemNota> itens) {
        this.notaFiscal.setItens(itens);
        return this;
    }

    public NotaFiscalBuilder observacoes(String observacoes) {
        this.notaFiscal.setObservacoes(observacoes);
        return this;
    }

    public NotaFiscal build() {
        return this.notaFiscal;
    }
}
