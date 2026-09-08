import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Thiago");
        lista.add("João");
        System.out.println(lista.get(0));

        lista.remove(0);
    }
    
}
