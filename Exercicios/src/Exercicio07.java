
public class Exercicio07 {
    public static void main(String[] args) {
        int numero = 123;
        System.out.println(numero);
        System.out.println();


        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;

        System.out.println("Centena é: " + centena);
        System.out.println("Dezena é: " + dezena);
        System.out.println("Unidade é: " + unidade);


    }
}