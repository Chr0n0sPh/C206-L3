public class Zumbi extends Monstro{
    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia, int numeroDeCerebrosComidos) {
        super(idade, vida, energia);
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }

    public void atacarComMordida(Monstro monstroAlvo){
        int novaVida = monstroAlvo.getVida() - 1;
        monstroAlvo.setVida(novaVida);

        this.numeroDeCerebrosComidos++;
        System.out.println("Cerebro devorado!");
    }

    public String toString() {
        return "Infos do Zumbi" + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Vida: " + this.getVida() + "\n" +
                "Energia: " + this.getEnergia() + "\n" +
                "Número de Cérebros devorados: " + numeroDeCerebrosComidos;
    }
}
