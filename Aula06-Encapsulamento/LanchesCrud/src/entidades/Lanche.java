package entidades;

public class Lanche {
    //Atributos do Lanche
    private String nome;
    private double precoUnitario;

    //Construtor
    public Lanche(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    //Getters - Capturar as informações dos atributos privados
    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    //Setters - Atualizar os atributos privados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    //Exibir as informações dos atributos
    @Override
    public String toString() {
        return " | " + nome + " | R$ " + precoUnitario + " | ";
    }
}
