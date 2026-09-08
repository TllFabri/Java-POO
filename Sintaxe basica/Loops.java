import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = new int[10];

        System.out.println(vetor[0]);
        System.out.println(vetor[9]);
        System.out.println(vetor.length);
        System.out.println(vetor2.length);

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Thiago");
        lista.add("João");
        System.out.println(lista.get(0));

        lista.remove(0);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        for (String nome : lista) {
            System.out.println(nome);
        }
        int contador = 0;
        while (contador < 10) {
            System.out.println("Loop infinito");
            contador++;
        }
    }
}
