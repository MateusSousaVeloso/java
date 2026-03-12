public class TesteLivroDeNotas {
    public static void main(String[] args) {
        int[] notas1 = {1,2,3};
        int[] notas2 = {10,5,4};
        int[] notas3 = {10,9,3};
        LivroDeNotas Livro1 = new LivroDeNotas("Arthur <>", notas1);
        Livro1.exibirMensagem();

        LivroDeNotas Livro2 = new LivroDeNotas("Gustavo S2", notas2);
        Livro2.exibirNotas();

        LivroDeNotas Livro3 = new LivroDeNotas("Mateus", notas3);
        Livro3.calcularMedia();
    }
}
