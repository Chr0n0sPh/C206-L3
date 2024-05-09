import java.util.ArrayList;

public class Cozinheiro extends Pirata{
    private ArrayList<Receita> livroDeReceitas = new ArrayList<>();

    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
        livroDeReceitas.add(new Receita("Bolinho de Bacalhau",2));
        livroDeReceitas.add(new Receita("Filé de Tubarão",10));
        livroDeReceitas.add(new Receita("Bolacha",0));
    }

    public String prepararPrato(int index){
        return "Peparando " + livroDeReceitas.get(index).getNome();
    }

    public void mostrarReceitas(){
        try{
            for (int i = 0; i < livroDeReceitas.size(); i++) {
                System.out.println("Nome: " + livroDeReceitas.get(i).getNome());
                System.out.println("Dificuldade: " + livroDeReceitas.get(i).getDificuldade());
            }
        }catch (Exception e){
            System.out.println("ERRO: " + e);
        }
    }

    public ArrayList<Receita> getLivroDeReceitas() {
        return livroDeReceitas;
    }
}
