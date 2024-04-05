public class Vampiro extends Monstro{
    private int medidorDeSangue;
    private boolean formaDeMorcego;

    public Vampiro(int idade, int vida, int energia, int medidorDeSangue, boolean formaDeMorcego) {
        super(idade, vida, energia);
        this.medidorDeSangue = medidorDeSangue;
        this.formaDeMorcego = formaDeMorcego;
    }

    public void transformar(){
        this.formaDeMorcego = !formaDeMorcego;
    }

    public void recuperarVida(){
        int novaVida = this.getVida() + medidorDeSangue;
        this.setVida(novaVida);
        medidorDeSangue = 0;
    }

    public void atacarComMordida(Monstro monstroAlvo){
        int novaVida = monstroAlvo.getVida() - this.getEnergia();
        monstroAlvo.setVida(novaVida);

        this.medidorDeSangue++;
    }
}
