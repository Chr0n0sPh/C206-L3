public class Jogador {
    private Arma arma;
    private int energia;
    private int vida;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Jogador alvo){
        if(this.energia > arma.getCustoDeEnergia()){
            alvo.vida -= arma.getDano();
            this.energia -= arma.getCustoDeEnergia();
        }
        else
            System.out.println("Jogador não possui energia suficiente para realizar o ataque");
    }

    public Jogador(){

    }

    public Jogador(Arma arma,int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public String toString(){
        return "INFO DA ARMA \n"+
                "Dano da Arma: " + this.arma.getDano() + "\n" +
                "Custo de Energia da Arma: " + this.arma.getCustoDeEnergia() + "\n\n" +
                "INFOS DO JOGADOR \n" +
                "Energia: " + this.energia + "\n" +
                "Vida: " + this.vida;
    }
}