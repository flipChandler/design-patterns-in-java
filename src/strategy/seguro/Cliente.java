package strategy.seguro;

public class Cliente {

    private String nome;
    private Integer idade;
    private EGenero genero;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public EGenero getGenero() {
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setGenero(EGenero genero) {
        this.genero = genero;
    }
}
