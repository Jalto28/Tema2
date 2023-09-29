import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Pedimos datos de la primera parada.
		System.out.println("PRIMERA PARADA:");
		System.out.println("---------------");
		System.out.println("Introduce el precio del litro del combustible:");
		double precioLitro = teclado.nextDouble();
		System.out.println("Introduce el total pagado para llenar el deposito:");
		double llenarDeposito = teclado.nextDouble();
		System.out.println("Introduce el número de kilómetros que marca el cuentakilometros:");
		double cuentaKilometros = teclado.nextDouble();
		
		//Pedimos datos de la segunda parada.
		System.out.println("SEGUNDA PARADA:");
		System.out.println("---------------");
		System.out.println("Introduce el precio del litro del combustible:");
		double precioLitro2 = teclado.nextDouble();
		System.out.println("Introduce el total pagado para llenar el deposito:");
		double llenarDeposito2 = teclado.nextDouble();
		
		//Pedimos datos de la tercera parada.
		System.out.println("TERCERA PARADA:");
		System.out.println("---------------");
		System.out.println("Introduce el número de kilómetros que marca el cuentakilometros:");
		double cuentaKilometros2 = teclado.nextDouble();
		teclado.close();
		
		//Creamos otras 3 variables para guardar los totales.
		double totalPrecioLitro = precioLitro + precioLitro2;
		double totalLlenarDeposito = llenarDeposito + llenarDeposito2;
		double totalCuentaKilometros = cuentaKilometros + cuentaKilometros2;
		
		//La formula para calcular el consumo medio es (Litros consumidos x 100) /km recorridos = consumo medio.
		double litrosConsumidos = totalLlenarDeposito / totalPrecioLitro; 
		double consumoMedio = (litrosConsumidos * 100) / totalCuentaKilometros;
		
		//Mostramos resultado por pantalla
		System.out.println("El consumo medio del automóvil ha sido  " +consumoMedio);		
		
	} 

}