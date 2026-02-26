package ADS1002.oo_parte1;

import java.util.Arrays;

public class LivroDeNotas {
    private String nome;
    private int[] notas;

    public LivroDeNotas(String nome, int[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // tipo de retorno, nome, lista de parâmetros, corpo
    void exibirMensagem() {
        System.out.println("Bem vindo ao livro de notas: " + nome);
    }

    void exibirNotas() {
        System.out.println(Arrays.toString(notas));
    }

    void calcularMedia() {
        float acc = 0;
        for (int i = 0; i <= notas.length - 1; i++) {
            acc += notas[i];
        }
        float notaFinal = acc/notas.length;
        System.out.println("A media aritmética do aluno é: " + notaFinal);
    }
}
