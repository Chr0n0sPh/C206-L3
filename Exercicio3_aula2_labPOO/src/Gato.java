public class Gato {
    public String cor;
    public int idade;
    public int velocidade;

    public void brincar(){
        System.out.println("Gatinho brincando");
    }

    public void cacar(Rato rato){
        if(this.velocidade > rato.velocidade && rato.escondido == false)
            System.out.println("O gato pegou o rato");
        else
            System.out.println("O rato conseguiu fugir ou está escondido");
    }

    public String toString(){
        return "INFOS DO GATO\n" +
                "Cor: " + this.cor + "\n" +
                "Idade: " +this.idade +"\n"+
                "Velocidade: "+this.velocidade+"\n";
    }
}
