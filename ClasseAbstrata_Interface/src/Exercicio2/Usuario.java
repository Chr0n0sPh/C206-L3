package Exercicio2;

public class Usuario {
    private int id;
    private int senha;

    public Usuario(int id, int senha) {
        this.id = id;
        this.senha = senha;
    }

    public void logar(){
        System.out.println("Logando!");
    }
}
