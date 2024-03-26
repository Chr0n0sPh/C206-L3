public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(5.00,"Pilha AA");
        Notebook note = new Notebook(5.0,"Notebook Acer","Intel i5","8 GB RAM");
        Console console = new Console(5000.00,"PlayStation","Gen5","Sony");

        produto.mostraInfo();

        note.instalarAplicativo();
        note.mostraInfo();

        console.jogar();
        console.mostraInfo();
    }
}