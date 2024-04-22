package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Atleta atleta = new Atleta();
        atleta.treinar();

        Nadador nadador = new Nadador();
        nadador.treinar();

        Corredor corredor = new Corredor();
        corredor.treinar();
        corredor.colocarEquipamento();

        Ciclista ciclista = new Ciclista();
        ciclista.treinar();
        ciclista.colocarEquipamento();
    }
}