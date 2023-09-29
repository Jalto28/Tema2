import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        // Supongamos tasas de cambio ficticias
        double tasaEuroDolar = 0.94;  // 1 euro = 0.94 dólares 
        double tasaEuroLibra = 1.15;  // 1 euro = 1.15 libras 

        // Conversión a dólares y libras
        double dolares = euros * tasaEuroDolar;
        double libras = euros * tasaEuroLibra;

        System.out.println("Cantidad en dólares: " + dolares + " USD");
        System.out.println("Cantidad en libras: " + libras + " GBP");
    }
}
