
public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Exercício 08");
        System.out.println();

        int numero = 3;
        boolean primo = false;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.println("Numero é primo");
        } else {
            System.out.println("numero não é primo");
        }
    }
}





