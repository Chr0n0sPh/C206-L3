public class Capitao extends Pirata implements Comandar{
    private  int numeroDeSeguidores;

    public Capitao(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public void conquistarNovoSeguidor(Pirata pirata){
        if(this.getPoder() > pirata.getPoder()){
            numeroDeSeguidores++;
        }
    }

    @Override
    public void darOrdens() {
        System.out.println("O Capitão está ordenando " + numeroDeSeguidores + " tripulantes");
    }

    @Override
    public void mudarRota() {
        System.out.println("O Capitão está mudando a rota");
    }

    @Override
    public String toString() {
        return "Capitao{" +
                "numeroDeSeguidores=" + numeroDeSeguidores +
                '}';
    }
}
