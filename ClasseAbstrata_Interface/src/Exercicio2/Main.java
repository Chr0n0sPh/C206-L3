package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Estagiario estagiario = new Estagiario(5,123,10);
        Professor professor = new Professor(4,147,5);
        Usuario usuario = new Usuario(1256,123456789);

        usuario.logar();
        System.out.println("Salário do estagiário: R$ " + estagiario.calculaSalario());
        System.out.println("Salário do Professor: R$ " + professor.calculaSalario());
    }
}
