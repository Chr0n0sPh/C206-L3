

public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public Pirata lutar(Pirata pirata){
        try {
            if(pirata.getPoder()>poder)
                return pirata;
        }
        catch (Exception e){
            System.out.println("ERRO: " + e);
        }
        return pirata;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        cozinheiro.prepararPrato(index);
        if(cozinheiro.getLivroDeReceitas().get(index).getNome().equals(comidaFavorita))
            this.poder *=2;
        else
            this.poder++;
    }

    public int getPoder() {
        return poder;
    }

    @Override
    public String toString() {
        return "Pirata{" +
                "nome='" + nome + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", poder=" + poder +
                '}';
    }
}
