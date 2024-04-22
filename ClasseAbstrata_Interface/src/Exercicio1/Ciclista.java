package Exercicio1;

public class Ciclista extends Atleta implements Equipamento{
    @Override
    public void colocarEquipamento() {
        System.out.println("Colocando Equipamentos de Ciclista");
    }
}
