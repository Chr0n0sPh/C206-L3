public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.cor = "Rajado";
        gato.idade = 3;
        gato.velocidade = 3;

        Rato rato = new Rato();
        rato.escondido = false;
        rato.velocidade = 2f;

        System.out.println(gato.toString());
        System.out.println(rato.toString());
        gato.brincar();
        rato.procurarComida();
        rato.esconder();
        gato.cacar(rato);
    }
}