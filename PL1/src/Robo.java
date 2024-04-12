public class Robo {
    private int energia;
    private String nome;
    private static int totalDeRobos;
    private int energiaMaxima;

    public Robo(int energia, String nome, int energiaMaxima) {
        this.energia = energia;
        this.nome = nome;
        this.energiaMaxima = energiaMaxima;
        totalDeRobos++;
    }

    public int getEnergia() {
        return energia;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalDeRobos() {
        return totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void trabalhar(){
        energia--;
    }

    public void trocarEnergia(Robo roboAlvo){
    }

    public void recarregar(int horas){
        int novaEnergia;
        if(this.energia < this.energiaMaxima){
            novaEnergia = this.energia + horas;
            this.energia = novaEnergia;
        }
    }
}
