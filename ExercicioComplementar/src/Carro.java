public class Carro {
    private Motor motor;
    private int tipoDePneu;

    public Carro(int tipoDePneu, int potencia, boolean turbo){
        motor = new Motor(potencia,turbo);
        this.tipoDePneu = tipoDePneu;
    };

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    public void correr(){
        System.out.println("Correndo!");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }
}
