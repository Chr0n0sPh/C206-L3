package Exercicio2;

public class Aluno extends Usuario{
    private int[] notas = new int[10];

    public Aluno(int id, int senha, int[] notas) {
        super(id, senha);
        this.notas = notas;
    }
}
