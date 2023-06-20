import java.util.Iterator;

public class Estante {

    public static Integer contarLivrosDisponiveisNaEstante(Autor autor) {
        int quantidade = 0;
        for (Livro livro : autor) {
            if (livro.isDisponivel()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalDeLivrosEstante(Autor autor) {
        int quantidade = 0;
        for (Iterator a = autor.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
