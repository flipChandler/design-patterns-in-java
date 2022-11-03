package builder.pessoa;

import java.time.LocalDate;

public class PessoaBuilder {

    private Pessoa pessoa;

    public PessoaBuilder(String nome) {
        this.pessoa = new Pessoa();
        this.pessoa.setNome(nome);
    }

    public PessoaBuilder nome(String nome) {
        this.pessoa.setNome(nome);
        return this;
    }

    public PessoaBuilder sobrenome(String sobrenome) {
        this.pessoa.setSobrenome(sobrenome);
        return this;
    }

    public PessoaBuilder apelido(String apelido) {
        this.pessoa.setApelido(apelido);
        return this;
    }

    public PessoaBuilder dataNascimento(LocalDate dataNascimento) {
        this.pessoa.setDataNascimento(dataNascimento);
        return this;
    }

    public PessoaBuilder cpf(String cpf) {
        this.pessoa.setCpf(cpf);
        return this;
    }

    public PessoaBuilder endereco(String endereco) {
        this.pessoa.setEndereco(endereco);
        return this;
    }

    public Pessoa build() {
        return this.pessoa;
    }
}
