public class Main {
    public static void main(String[] args) {
        System.out.println("COZINHEIRO");
        Cozinheiro cozinheiro = new Cozinheiro("Fogaça","Filé de Tubarão",10);
        System.out.println(cozinheiro.prepararPrato(0));
        cozinheiro.mostrarReceitas();
        cozinheiro.comer(cozinheiro,2);
        System.out.println();

        System.out.println("CAPITÃO");
        Capitao capitao = new Capitao("Barba Negra","Bolinho de Bacalhau",150);
        System.out.println(capitao.toString());
        capitao.darOrdens();capitao.mudarRota();
        capitao.comer(cozinheiro,0);
        Pirata pirata = new Pirata("Fernando","Bolacha",100);
        capitao.conquistarNovoSeguidor(pirata);

        Espadachim espadachim = new Espadachim("Zorro","Bolinho de Bacalhau",90,"Uchigatana");
        espadachim.darOrdens();
        espadachim.mudarRota();
        System.out.println(espadachim.lutar(pirata));


    }
}