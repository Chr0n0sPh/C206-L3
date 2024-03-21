public class Banda {
    private Musica[] musicas;
    private String nome;
    private int numeroDeIntegrantes;

    public Banda(String nome, int numeroDeIntegrantes){
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
        musicas = new Musica[100];
    }

    public void tocarMusica(int posicao){
        for (int i = 0; i < musicas.length; i++) {
            if(i == posicao){
                System.out.println("A Banda está tocando " + this.musicas[i].getNome() + " agora");
            }
            else
                System.out.println("A Banda não possui músicas lançadas");
        }
    }

    public void adicionarMusica(Musica musica){
        for (int i = 0; i < musicas.length; i++) {
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    public void deletarMusica(String nome){
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null) {
                if (musicas[i].getNome().equals(nome)) {
                    musicas[i] = null;
                    break;
                }
            }
        }

    }
}
