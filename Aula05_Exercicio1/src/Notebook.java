public class Notebook extends Produto{
    private String processador;
    private String memoria;

    public Notebook(double valor, String nome, String processador, String memoria) {
        super(valor, nome);
        this.processador = processador;
        this.memoria = memoria;
    }

    public void instalarAplicativo(){
        System.out.println("Instalando Avast Antivirus");
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Processador: " + processador);
        System.out.println("Memoria: " + memoria);
    }
}
