public class Main {
    public static void main(String[] args) {
        Bruxa bruxa = new Bruxa(200,1000,150);
        bruxa.aprenderFeitico("Bola de Fogo",10);
        bruxa.aprenderFeitico("Relâmpago",20);
        bruxa.listarFeiticos();
        bruxa.esquecerFeitico(1);
        bruxa.listarFeiticos();
        Zumbi zumbi = new Zumbi(50,100,50,0);
        Vampiro vampiro = new Vampiro(3000,200,1000,0,false);

        bruxa.lancarFeitico(zumbi,0);
        System.out.println(bruxa.toString());

        zumbi.atacarComMordida(vampiro);
    }
}