public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor();

        autor.adicionarSaga(new Saga());
        autor.setNome("J.K.Rowling");
        autor.getSagas()[0].adicionarLivro(new Livro("Harry Potter e a Pedra Filosofal",500));
        autor.getSagas()[1].adicionarLivro(new Livro("Harry Potter e o Cálice de Fogo",600));

        autor.listarSagas();
    }
}