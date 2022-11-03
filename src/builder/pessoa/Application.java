package builder.pessoa;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Pessoa pessoa = new PessoaBuilder("Felipe")
                .sobrenome("Santos")
                .apelido("flip")
                .cpf("200.123.456-00")
                .dataNascimento(LocalDate.of(1987, 1, 11))
                .endereco("Rua das Poesias, 123 - Bairro Bairro - Cotia/SP")
                .build();

        System.out.println(pessoa);
    }
}
