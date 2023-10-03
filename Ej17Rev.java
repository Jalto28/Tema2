import java.util.Scanner;

public class ConsumoAutomovil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Primer repostaje
        System.out.println("Primer repostaje:");
        System.out.print("Introduce el precio por litro de combustible: ");
        double precioLitro1 = scanner.nextDouble();
        System.out.print("Introduce el total pagado al llenar el depósito: ");
        double totalPagado1 = scanner.nextDouble();
        System.out.print("Introduce el número de kilómetros en el cuentakilómetros: ");
        double km1 = scanner.nextDouble();

        // Segundo repostaje
        System.out.println("\nSegundo repostaje:");
        System.out.print("Introduce el precio por litro de combustible: ");
        double precioLitro2 = scanner.nextDouble();
        System.out.print("Introduce el total pagado al llenar el depósito: ");
        double totalPagado2 = scanner.nextDouble();

        // Tercer repostaje
        System.out.println("\nTercer repostaje:");
        System.out.print("Introduce el número de kilómetros en el cuentakilómetros: "); 
        double km3 = scanner.nextDouble();

        // Calcular consumo por 100 km y coste por kilómetro
        double litrosConsumidos = (totalPagado1 / precioLitro1) + (totalPagado2 / precioLitro2);//Cantidad total de litros de combustible consumidos en los dos primeros repostajes. Se divide el total pagado al llenar el depósito en cada repostaje por el precio por litro correspondiente y se suman estos valores para obtener la cantidad total de litros consumidos.
        double kmRecorridos = km3 - km1;//Calculamos la cantidad de kilómetros recorridos entre el primer y tercer repostaje. Se resta el número de kilómetros en el cuentakilómetros en el primer repostaje (km1) al número de kilómetros en el cuentakilómetros en el tercer repostaje (km3).
        double consumoPor100Km = (litrosConsumidos / kmRecorridos) * 100;//Este cálculo determina el consumo de combustible por cada 100 km. Se divide la cantidad total de litros consumidos por la cantidad de kilómetros recorridos y luego se multiplica por 100 para expresar el consumo en términos de 100 km.
        double costePorKilometro = (totalPagado1 + totalPagado2) / kmRecorridos;//Este cálculo determina el costo por kilómetro. Se suma el total pagado en el primer y segundo repostaje y luego se divide por la cantidad de kilómetros recorridos entre el primer y tercer repostaje para obtener el costo por kilómetro.

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Consumo por 100 km: " +consumoPor100Km+ " litros");
        System.out.println("Coste por kilómetro: " +costePorKilometro+" euros");

        // Cerrar el scanner
        teclado.close();
    }
}
