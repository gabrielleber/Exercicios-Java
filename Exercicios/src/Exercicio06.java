
public class Exercicio06 {
    public static void main(String[] args) {
        int Numero = 5;
        int fatorial = 1;

        for (int i = 1; i <= Numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial do numero 5 é: " + fatorial);

    }
}