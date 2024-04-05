import java.util.Arrays;

public class Bruxa extends Monstro{
    private Feitico[] feiticos = new Feitico[10];

    public Bruxa(int idade, int vida, int energia) {
        super(idade, vida, energia);
        for (int i = 0; i < feiticos.length; i++) {
            feiticos[i] = new Feitico();
        }
    }

    public boolean aprenderFeitico(String nome, int poder){
        for (int i = 0; i < feiticos.length; i++){
            if(feiticos[i].getNome() == null){
                feiticos[i].setNome(nome);
                feiticos[i].setPoder(poder);
                break;
            }
        }
        System.out.println("Feitiço aprendido");
        return true;

    }

    public void listarFeiticos(){
        for (int i = 0; i < feiticos.length; i++) {
            Feitico feitico = feiticos[i];
            if (feitico.getNome() != null) {
                System.out.println("Nome: " + feitico.getNome());
                System.out.println("Poder: " + feitico.getPoder());
                System.out.println();
            }
        }
    }

    public void esquecerFeitico(int posicao){
        for (int i = 0; i < feiticos.length; i++) {
            if(i == posicao){
                feiticos[i].setNome(null);
                feiticos[i].setPoder(0);
                System.out.println("Feitiço Esquecido!");
                break;
            }
        }
    }

    public void lancarFeitico(Monstro monstroAlvo,int posicao){
        //subtrair a vida do monstro alvo
        int novaVida = monstroAlvo.getVida() - this.feiticos[posicao].getPoder();
        monstroAlvo.setVida(novaVida);

        //subtrair a energia do monstro que lançou o feitiço
        int novaEnergia = this.getEnergia() - 1;
        this.setEnergia(novaEnergia);
    }

    @Override
    public String toString() {
        return "Idade: " + this.getIdade() + "\n" +
                "Vida: " + this.getVida() + "\n" +
                "Energia: " + this.getEnergia() + "\n";
    }
}