public class BracoArticulado extends Robo {
    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;

    public BracoArticulado(int energia, String nome, int energiaMaxima, int numeroDeArticulacoes) {
        super(energia, nome, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        garra = new Garra();
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void setGarra(Garra garra){
        this.garra = garra;
    }

    public void trabalhar(){
        if(camera.getQualidade() != 0){
            int peca = camera.acharPecas();
            garra.agarraPeca(peca);
        }
        else{
            garra.agarrarPeca();
        }
    }
}
