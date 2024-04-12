public class Empilhador extends Robo{
    private Pacote pacotes[]= new Pacote[10];
    private int pesoMaximo;

    public Empilhador(int energia, String nome, int energiaMaxima, int pesoMaximo) {
        super(energia, nome, energiaMaxima);
        this.pesoMaximo = pesoMaximo;
        for (int i = 0; i < pacotes.length; i++) {
            pacotes[i]=new Pacote();
        }
    }

    public void adicionaPacote(int peso){
        if(peso<pesoMaximo){
            for (int i = 0; i < pacotes.length; i++) {
                if(pacotes[i].getPeso() == 0){
                    pacotes[i].setPeso(peso);
                    System.out.println("pacote adicionado");
                    break;
                }
            }
        }else{
            System.out.println("Erro Peso Máximo Ultrapassado");
        }
    }

    public void removePacote(int posicao){
        for (int i = 0; i < pacotes.length; i++) {
            if(i == posicao){
                pacotes[i].setPeso(0);
                break;
            }
        }
    }

    public void mostrarPacotes(){
        for (int i = 0; i < pacotes.length; i++){
            if(pacotes[i].getPeso() != 0){
                System.out.println("Pacote " + i + ": Peso: " + pacotes[i].getPeso());
            }

        }
    }
}
