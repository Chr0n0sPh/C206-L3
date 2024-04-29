import java.util.Arrays;

public class Equipe {
    private Carro carro;
    private Piloto pilotos[] = new Piloto[4];
    private Piloto pilotoAtual;
    private String nome;

    private boolean trocarPilotoAtual(int pilotoId){
        for (int i = 0; i < pilotos.length; i++) {
            if(pilotos[i].getId() == pilotoId){
                pilotoAtual = pilotos[i];
                return true;
            }
        }
        return false;
    }

    private boolean trocarPneu(int tipoDepeneu){
            carro.setTipoDePneu(tipoDepeneu);
            return true;
    }

    public void pitStop(int tipoDePneu, int pilotoId){
        trocarPneu(tipoDePneu);
        trocarPilotoAtual(pilotoId);
        }


    public boolean adicionarPiloto(Piloto piloto){
        for (int i = 0; i < pilotos.length; i++) {
            if(pilotos[i] == null) {
                    pilotos[i] = piloto;
                    return true;

            }
        }
        return false;
    }

    public boolean retirarPiloto(int pilotoId){
        for (int i = 0; i < pilotos.length; i++) {
            if(pilotoId == pilotos[i].getId()){
                pilotos[i] = null;
                return true;
            }
        }
        return false;
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo){
        carro = new Carro(tipoDePneu,potencia,turbo);
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "carro=" + carro +
                ", pilotos=" + Arrays.toString(pilotos) +
                ", pilotoAtual=" + pilotoAtual +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Carro getCarro() {
        return carro;
    }
}
