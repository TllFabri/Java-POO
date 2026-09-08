public class Condicionais {
    public static void main(String[] ars) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.5;
        char c = 'a';
        boolean bo = true;
        String str = "Olá, mundo!";

        if(str.isBlank()) {
            System.out.println("A string está em branco");
        }

        if(str.equals("Olá, mundo!")) {
            System.out.println("A string é igual a 'Olá, mundo!'");
        }

        if(b > 5) {
            System.out.println("b é maior que 5");
        }

       if(bo) {
           System.out.println("Verdadeiro");
       }
        else if(!bo) {
           System.out.println("Falso");
       } else {
           System.out.println("Falso");
       }
    }
}
