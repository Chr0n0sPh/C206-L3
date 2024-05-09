import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarArray(new Item("Brownie de Café", 10));
        estoque.adicionarArray(new Item("Brownie de Doce de Leite", 20));
        estoque.adicionarArray(new Item("Brownie de Nutella", 30));
        Item item4 = new Item("Brownie de Morango",9);
        Item item5 = new Item("Coxinha",3);
        Item item6 = new Item("Coca-cola",4);
        estoque.adicionarArray(item4);

        estoque.mostrarItens();

        //Ordenação
        System.out.println("Ordenando o Array");
        Collections.sort(estoque.getItensArray());
        estoque.mostrarItens();

        //Maior valor
        System.out.println("Máx: " + Collections.max(estoque.getItensArray()).getNome());

        //Menor valor
        System.out.println("Min: " + Collections.min(estoque.getItensArray()).getNome());

        ArrayList<Item> listaExtra = new ArrayList<>();
        listaExtra.add(item5);
        listaExtra.add(item6);
        estoque.getItensArray().addAll(listaExtra);
        estoque.mostrarItens();

        estoque.getItensArray().removeAll(listaExtra);
        estoque.mostrarItens();

        // contains isEmpty , size
        System.out.print("IndexOf -> ");
        System.out.println(estoque.getItensArray().indexOf(item6));
        System.out.print("LastIndexOf -> ");
        System.out.println(estoque.getItensArray().lastIndexOf(item4));

        System.out.print("Contains -> ");
        System.out.println(estoque.getItensArray().contains(item4));
        System.out.print("isEmpty -> ");
        System.out.println(estoque.getItensArray().isEmpty());
        System.out.print("Size -> ");
        System.out.println(estoque.getItensArray().size());

        estoque.getMapaDeItens().put("Salgado",new Item("Esfirra de Carne",7));
        estoque.getMapaDeItens().put("Chocolate",new Item("KitKat",8));
        estoque.mostrarItensMap();
    }
}