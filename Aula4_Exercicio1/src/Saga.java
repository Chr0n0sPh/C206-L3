public class Saga {
    private int nota;
    private Livro[] livros;

    public Saga(){
        livros = new Livro[100];
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public int getNota() {
        return nota;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void listarLivros(){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] != null){
                System.out.println("Título: " +  this.livros[i].getTitulo());
                System.out.println("N° de Páginas: " + this.livros[i].getPaginas());
            }
        }
    }

    public void adicionarLivro(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if(livros[i] == null){
                livros[i] = livro;
                break;
            }
        }
    }
}
