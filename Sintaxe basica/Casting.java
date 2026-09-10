public class Casting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // Casting double to int

        int meuInteiro = 10;
        double meuDouble = (double) meuInteiro; // Casting int to double

        String meuString = "123";
        int meuInteiro2 = Integer.parseInt(meuString); // Casting String to int

        String meuString2 = String.valueOf(meuInteiro2); // Casting int to String
    }
    
}

