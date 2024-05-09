import java.util.ArrayList;
import java.util.HashMap;

public class Estoque {
    private ArrayList<Item> itensArray;
    private HashMap<String,Item> mapaDeItens;

    public Estoque() {
        itensArray = new ArrayList<>();
        mapaDeItens = new HashMap<>();
    }

    public void adicionarArray(Item item) {
        itensArray.add(item);
    }

    public void buscar(int posicao) {
        if (posicao >= 0 && posicao < itensArray.size()) {
            System.out.println("Item na posição " + posicao + ": " + itensArray.get(posicao).getNome() +" Preço: R$ " + itensArray.get(posicao).getValor());
        } else {
            System.out.println("posição inválida");
        }
    }

    public void deletar(int posicao) {
        itensArray.remove(posicao);
    }

    public void deletar(Item item) {
        itensArray.remove(item);
    }

    public void modificar(Item item, int posicao) {
        itensArray.set(posicao,item);
    }

    // Additional methods for testing
    public ArrayList<Item> getItensArray() {
        return itensArray;
    }

    public HashMap<String, Item> getMapaDeItens() {
        return mapaDeItens;
    }

    public void mostrarItens(){
        System.out.print("[");
        for (Item item : itensArray){
            try{
                System.out.print("  " + item.getNome() + " - " + item.getValor() + ", ");
            }catch (NullPointerException e){
                System.out.println("Error: " + e);
            }
        }
        System.out.println("]");
    }

    public void mostrarItensMap(){
        System.out.print("[");
        mapaDeItens.forEach(
                (k, v) -> {
                    if (k != null){
                        System.out.print("  Chave : \"" + k + "\" Valor : {" + "  " + v.getNome() + " - " + v.getValor() + " }, ");
                    }
                }
        );
        System.out.println("]");
    }
}