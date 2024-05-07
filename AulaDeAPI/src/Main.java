import java.util.*;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Item item1 = new Item("Brownie de Café", 10);
        Item item2 = new Item("Brownie de Doce de Leite", 20);
        Item item3 = new Item("Brownie de Nutella", 30);
        Item item4 = new Item("Brownie de Chocolate", 50);
        Item item5 = new Item("Brownie de Chocolate Branco", 60);
        Item item6 = new Item("Brownie de Morango",70);

        // Add some items
        estoque.adicionarArray(item1);
        estoque.adicionarArray(item2);
        estoque.adicionarArray(item3);

        // Test buscar
        estoque.buscar(1);
        System.out.println();

        // Test deletar
        estoque.deletar(1);

        // Test modificar
        estoque.modificar(item6,0);

        // Test Collections methods
        ArrayList<Item> itensArray = estoque.getItensArray();
        System.out.println("Max item");
        System.out.println(Collections.max(itensArray).getNome());
        System.out.println(Collections.max(itensArray).getValor());
        System.out.println();
        System.out.println("Min item");
        System.out.println(Collections.min(itensArray).getNome());
        System.out.println(Collections.min(itensArray).getValor());

        //Ordenando a lista
        Collections.sort(itensArray);
        System.out.println("Lista Cadastrada");
        for (Item item:itensArray){
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço: R$ " + item.getValor());
        }
        System.out.println();

        // Test ArrayList methods
        ArrayList<Item> anotherList = new ArrayList<>();
        anotherList.add(item4);
        anotherList.add(item5);

        itensArray.addAll(anotherList);
        System.out.println("Antes addAll");
        for (Item item:itensArray){
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço: R$ " + item.getValor());
        }
        System.out.println();

        itensArray.removeAll(anotherList);
        System.out.println("Depois do removeAll");
        for (Item item:itensArray){
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço: R$ " + item.getValor());
        }
        System.out.println();

        int index = itensArray.indexOf(item6);
        System.out.println(index);

        itensArray.forEach(System.out::println);

        System.out.println(itensArray.contains(item1));

        boolean isEmpty = itensArray.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        int lastIndex = itensArray.lastIndexOf(item6);
        System.out.println("Last index of Item6: " + lastIndex);

        int size = itensArray.size();
        System.out.println("Size: " + size);

        HashMap<Integer,Item> mapaDeItens = new HashMap<>();
        mapaDeItens.put(1,item1);
        mapaDeItens.put(2,item2);

        System.out.println(mapaDeItens);;

        HashMap<Integer,Item> outroMapaDeItens = new HashMap<>();
        outroMapaDeItens.put(3,item3);
        outroMapaDeItens.put(4,item4);
        mapaDeItens.putAll(outroMapaDeItens);

        System.out.println(mapaDeItens);
        mapaDeItens.remove(1,item1);

        System.out.println(mapaDeItens);

        System.out.println(mapaDeItens.containsKey(2));
    }
}