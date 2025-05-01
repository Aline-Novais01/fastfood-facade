
public class Bebida implements ItemCombo {
    private String nome;
    private double preco;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {

        return nome;
    }

    @Override
    public double getPreco() {

        return preco;
    }

    public static Bebida refrigerante()
    {
        return new Bebida("Refrigerante", 5.00);
    }

    public static Bebida suco() {

        return new Bebida("Suco", 4.50);
    }
}
