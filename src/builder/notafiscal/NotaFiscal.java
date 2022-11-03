package builder.notafiscal;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataEmissao;
    private double valorBruto;
    private double impostos;
    private List<ItemNota> itens;
    private String observacoes;

    public NotaFiscal() {
    }

    public NotaFiscal(String razaoSocial, String cnpj, LocalDate dataEmissao, List<ItemNota> itens, String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataEmissao = dataEmissao;
        this.itens = itens;
        this.observacoes = observacoes;
        this.setValorBruto();
        this.setImpostos();
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public double getValorBruto() {
        return this.valorBruto;
    }

    public double getImpostos() {
        this.impostos = valorBruto * 0.05;
        return impostos;
    }

    public List<ItemNota> getItens() {
        return itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public void setItens(List<ItemNota> itens) {
        this.itens = itens;
        this.setValorBruto();
        this.setImpostos();
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    private void setValorBruto() {
        for (ItemNota item : this.itens) {
            this.valorBruto += item.getValor();
        }
    }

    private void setImpostos() {
        this.impostos = this.valorBruto * 0.05;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", valorBruto=" + valorBruto +
                ", impostos=" + impostos +
                ", itens=" + itens +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
