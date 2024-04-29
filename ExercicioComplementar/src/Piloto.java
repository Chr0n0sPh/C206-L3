public class Piloto {
    private String nome;
    private int idade;
    private String nacionalidade;
    private static int idGeral = 0;
    private int id;

    public Piloto(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        idGeral++;
        id = idGeral;
    }

    public void correr(Carro carro){
        carro.correr();
        System.out.println();
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }
}
