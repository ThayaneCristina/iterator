import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstanteTest {

    @Test
    void deveContarLivrosDisponiveisNaEstante() {
        Autor PaulaPimenta = new Autor(
                new Livro("Confissões", true),
                new Livro("Minha Vida Fora de Série", true),
                new Livro("Fazendo meu Filme", false),
                new Livro("Apaixonada por Palavras", true)
        );
        assertEquals(3, Estante.contarLivrosDisponiveisNaEstante(PaulaPimenta));
    }

    @Test
    void deveContarTotalDeLivrosDaEstante() {
        Autor PaulaPimenta = new Autor(
                new Livro("Confissões", true),
                new Livro("Minha Vida Fora de Série", true),
                new Livro("Fazendo meu Filme", false),
                new Livro("Apaixonada por Palavras", true)
        );
        assertEquals(4, Estante.contarTotalDeLivrosEstante(PaulaPimenta));
    }

}
