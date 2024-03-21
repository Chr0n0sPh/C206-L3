public class Autor {
    private String nome;
    private Saga[] sagas;

    public Autor(){
        sagas = new Saga[100];
    }

    public void adicionarSaga(Saga saga){
        for (int i = 0; i < sagas.length; i++) {
            if(sagas[i] == null){
                sagas[i] = saga;
                break;
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Saga[] getSagas() {
        return sagas;
    }


    public void listarSagas(){
        for (int i = 0; i < sagas.length; i++) {
            if (sagas[i] != null) {
                System.out.println(sagas[i].getNota());
                sagas[i].listarLivros();
            }
        }
    }
}