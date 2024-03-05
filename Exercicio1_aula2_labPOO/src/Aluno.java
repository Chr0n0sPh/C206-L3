import java.util.Scanner;
public class Aluno {
    public int matricula;
    public int np1;
    public int np2;
    public int periodo;
    public String nome;

    public int calculaMedia(){
        int media = ((this.np1 + this.np2)/2);
        if(media>60)
            System.out.println("Parabéns, Você passou!");
        else {
            System.out.println("Ainda tem chance");
            calculaNP3(media);
        }
        return media;
    }

    public int calculaNP3(int media){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a nota da NP3: ");
        int NP3 = entrada.nextInt();

        int novaMedia = (media + NP3)/2;

        if(novaMedia > 50)
            System.out.println("Deu bom!");
        else
            System.out.println("Deu Ruim. Semestre que vem tem dnovo");

        return novaMedia;
    }

    public String toString(){
        return "Matricula:" + this.matricula +"\n"
                + "NP1: " + this.np1 +"\n"
                + "NP2: " + this.np2 +"\n"
                + "Periodo: "+ this.periodo +"\n"
                + "Nome: " + this.nome +"\n";
    }
}
