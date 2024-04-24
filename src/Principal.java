public class Principal{
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("the Matrix");
        favorito.setAnoDeLancamento(2000);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);



        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(10);
        favorito.avalia(7);

        System.out.println("Media de avaliações do filme: " +favorito.pegaMedia());
    }
}
