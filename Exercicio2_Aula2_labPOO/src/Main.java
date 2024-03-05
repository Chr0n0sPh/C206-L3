public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma(50,10);
        Arma arma2 = new Arma(40,10);

        Jogador jogador = new Jogador(arma1,100,100);
        Jogador jogador2 = new Jogador();
        jogador2.energia = 90;
        jogador2.vida = 100;
        jogador2.arma = arma2;

        System.out.println("Antes do Ataque");
        System.out.println(jogador.toString());
        System.out.println(jogador2.toString());

        jogador.atacar(jogador2);

        System.out.println("Depois do Ataque");
        System.out.println(jogador.toString());
        System.out.println(jogador2.toString());
    }

}