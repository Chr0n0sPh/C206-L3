public class Produto {
    private double valor;
    private String nome;

    public Produto(double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Valor: " + valor);
    }
}
