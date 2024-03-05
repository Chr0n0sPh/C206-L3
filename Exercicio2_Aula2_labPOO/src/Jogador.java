public class Jogador {
    public Arma arma;
    public int energia;
    public int vida;

    public void atacar(Jogador alvo){
        if(this.energia > arma.custoDeEnergia){
            alvo.vida -= arma.dano;
            this.energia -= arma.custoDeEnergia;
        }
        else
            System.out.println("Jogador não possui energia suficiente para realizar o ataque");
    }

    Jogador(){

    }

    Jogador(Arma arma,int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }

    public String toString(){
        return "INFO DA ARMA \n"+
                "Dano da Arma: " + this.arma.dano + "\n" +
                "Custo de Energia da Arma: " + this.arma.custoDeEnergia + "\n\n" +
                "INFOS DO JOGADOR \n" +
                "Energia: " + this.energia + "\n" +
                "Vida: " + this.vida;
    }
}
