package desafio;

public class Roupa {

    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double valorTotal(){
        return this.quantidade * this.valor;
    }

    public void venda(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Informe um valor válido");
        }
    }

    public void abastecer(int quantidade){
        if(quantidade > 0){
            this.quantidade += quantidade;
            System.out.println("Estoque abastecido com sucesso");
        } else {
            System.out.println("Valor inválido");
        }

    }

    @Override
    public String toString() {
        return
                "Marca: " + this.marca +
                "\nTipo: " + this.tipo +
                "\nTamanho: " + this.tamanho +
                "\nQuantidade: " + this.quantidade +
                "\nValor: " + this.valor +
                "\nValor Total: " + this.valorTotal();
    }
}


