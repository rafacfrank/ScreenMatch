import br.com.rafacfrank.screenmatch.calculos.CalculadoraDeTempo;
import br.com.rafacfrank.screenmatch.calculos.FiltroRecomendacao;
import br.com.rafacfrank.screenmatch.modelos.Episodio;
import br.com.rafacfrank.screenmatch.modelos.Filme;
import br.com.rafacfrank.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        serie.exibeFichaTecnica();
        outro.exibeFichaTecnica();
        favorito.exibeFichaTecnica();

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(favorito);
        filtro.filtrar(outro);
        filtro.filtrar(primeiro);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(favorito);
        listaDeFilmes.add(outro);

        System.out.println("Tamanho da lista: " +listaDeFilmes.size());
        System.out.println("Primeiro Filme: " +listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}
