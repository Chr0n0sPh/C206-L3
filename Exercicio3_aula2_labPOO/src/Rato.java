public class Rato {
    public float velocidade;
    public boolean escondido;

    public void esconder(){
        this.escondido = true;
        System.out.println("Ratinho se escondeu!");
    }

    public void procurarComida(){
        this.escondido = false;
        System.out.println("Ratinho procurando comida!");
    }

    public String toString(){
        return "INFOS DO RATINHO \n" +
                "Velocidade: " + this.velocidade + "\n" +
                "Escondido: " + this.escondido + "\n";
    }
}