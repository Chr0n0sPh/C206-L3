//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Circuferência: " + calc.circunferencia(2));
        System.out.println("Volume da Esfera: " + calc.volumeEsfera(2));
        System.out.println("Volume do Cilindro: " + calc.volumeCilindro(2,2));
    }
}