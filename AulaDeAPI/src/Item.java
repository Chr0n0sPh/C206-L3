public class Item implements Comparable<Item> {
    private int valor;
    private String nome;

    public Item(String nome, int valor) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Item o) {
        //return this.nome.compareTo(o.nome); //alfabética crescente
        //return o.nome.compareTo(this.nome); //alfabética decrescente
        return Integer.compare(this.valor, o.valor);  //ordem numérica crescente
        //return Integer.compare(o.valor, this.valor);  //ordem numérica decrescente
    }
}