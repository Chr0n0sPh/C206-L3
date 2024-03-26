public class Console extends Produto {
    private String geracao;
    private String marca;

    public Console(double valor, String nome, String geracao, String marca) {
        super(valor, nome);
        this.geracao = geracao;
        this.marca = marca;
    }

    public void jogar(){
        System.out.println("Executando o game...");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Geração: " + geracao);
        System.out.println("Marca: " + marca);
    }
}
