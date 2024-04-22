package Exercicio2;

public class Professor extends Usuario implements CalculaSalario{
    private int numDeAulas;

    public Professor(int id, int senha, int numDeAulas) {
        super(id, senha);
        this.numDeAulas = numDeAulas;
    }

    @Override
    public float calculaSalario() {
        return 500f * numDeAulas;
    }
}
