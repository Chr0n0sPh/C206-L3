public class Main {
    public static void main(String[] args) {
            Aluno aluno = new Aluno();

            aluno.nome = "Paulo";
            aluno.matricula = 530;
            aluno.periodo = 6;
            aluno.np1 = 70;
            aluno.np2 = 30;

            aluno.calculaMedia();

        System.out.println(aluno.toString());
        }
    }