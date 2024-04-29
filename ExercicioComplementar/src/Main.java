

public class Main {
    public static void main(String[] args) {
        Equipe equipe = new Equipe("Ferrari");
        equipe.constroiCarro(1,180,true);

        Piloto piloto1 = new Piloto("Felipe Massa",38,"Brasileiro");
        Piloto piloto2 = new Piloto("Rubens Barichello",45,"Brasileiro");
        Piloto piloto3 = new Piloto("Fernando Alonso",39,"Espanhol");
        Piloto piloto4 = new Piloto("Sebastian Vetel",36,"Inglês");

        boolean resposta;
        resposta = equipe.adicionarPiloto(piloto1);
        resposta = equipe.adicionarPiloto(piloto2);
        resposta = equipe.adicionarPiloto(piloto3);
        resposta = equipe.adicionarPiloto(piloto4);
        System.out.println(equipe.toString());

        equipe.pitStop(1,1);
        System.out.println(equipe.toString());

        equipe.retirarPiloto(4);
        System.out.println(equipe.toString());

        piloto1.correr(equipe.getCarro());
        System.out.println(piloto1.toString());

        System.out.println(equipe.getCarro().toString());
    }
}