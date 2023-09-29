import java.util.Scanner;

public class Ej15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversión a grados Kelvin utilizando la fórmula kelvin=celsius+273.15 para convertir la temperatura a grados Kelvin.
        double kelvin = celsius + 273.15;

        // Conversión a grados Fahrenheit utilizando la fórmula fahrenheit=celsius×(9/5)+32f para convertir la temperatura a grados Fahrenheit.
        double fahrenheit = celsius * (9.0 / 5.0) + 32;

        System.out.println("Temperatura en grados Kelvin: " + kelvin + " K");
        System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit + " °F");
    }
}
