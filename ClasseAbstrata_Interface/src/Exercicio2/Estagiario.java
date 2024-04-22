package Exercicio2;

public class Estagiario extends Usuario implements CalculaSalario{
    private int numDeHorasTrabalhadas;

    public Estagiario(int id, int senha, int numDeHorasTrabalhadas) {
        super(id, senha);
        this.numDeHorasTrabalhadas = numDeHorasTrabalhadas;
    }

    @Override
    public float calculaSalario() {
        return 100f * numDeHorasTrabalhadas;
    }
}
