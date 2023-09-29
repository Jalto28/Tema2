import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia:");
        double radio = teclado.nextDouble();  // Double para obtener resultados precisos
        final double pi = 3.14159;

        double perimetro = 2 * pi * radio;  // Longitud de la circunferencia
        double area = pi * radio * radio;   // Área del círculo

        System.out.println("La circunferencia de radio " + radio + " tiene " + perimetro + " de perimetro y " + area + " de area");
    }
}