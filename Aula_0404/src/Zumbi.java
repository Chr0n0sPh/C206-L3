public class Zumbi extends Monstro{
    private int numeroDeCerebrosComidos;

    public Zumbi(int idade, int vida, int energia, int numeroDeCerebrosComidos) {
        super(idade, vida, energia);
        this.numeroDeCerebrosComidos = numeroDeCerebrosComidos;
    }

    public void atacarComMordida(Monstro monstroAlvo){
        int novaVida = monstroAlvo.getVida() - this.getEnergia();
        monstroAlvo.setVida(novaVida);

        this.numeroDeCerebrosComidos++;
    }
}
