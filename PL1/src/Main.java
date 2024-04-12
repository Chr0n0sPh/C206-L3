public class Main {
    public static void main(String[] args) {
        Empilhador empilhador = new Empilhador(100,"embilhador",300,500);
        empilhador.adicionaPacote(100);
        empilhador.adicionaPacote(100);
        empilhador.adicionaPacote(100);
        empilhador.adicionaPacote(100);
        empilhador.adicionaPacote(500);
        empilhador.mostrarPacotes();

        BracoArticulado bracoArticulado = new BracoArticulado(200,"Armbot",500,2);
        Camera camera1 = new Camera(100);
        bracoArticulado.setCamera(camera1);
        bracoArticulado.trabalhar();

        BracoArticulado bracoArticulado2 = new BracoArticulado(200,"Armbot",500,2);
    }
}