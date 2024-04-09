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
        int novaVida = monstroAlvo.getVida() - 1;
        monstroAlvo.setVida(novaVida);

        this.medidorDeSangue++;
        System.out.println("Sangue ");
    }

    public String toString() {
        return "Infos do Vampiro" + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Vida: " + this.getVida() + "\n" +
                "Energia: " + this.getEnergia() + "\n" +
                "Forma de Morcego: " + this.formaDeMorcego + "\n" +
                "Medidor de Sangue: " + medidorDeSangue;
    }
}
