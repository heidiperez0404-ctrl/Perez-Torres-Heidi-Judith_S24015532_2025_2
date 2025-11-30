//Crea un programa en que simule un cajero automático para el pago del servicio de energía eléctrica.
//• El programa deberá mostrar un menú que incluya: 1. Consulta, 2, Pago del mes 3. Pago de adeudo y 4. Salir.
//• El programa debe mostrar el menú y el usuario hacer una de las 4 
//Permitir que el usuario elija una de las cuatro opciones y muestre el resultado correspondiente.
//• Considerar que en las opciones 1, 2 y 3, el usuario tiene un adeudo de $1000.00 que debe mostrarse en pantalla.
//• Después de realizar una operación, el programa debe preguntar si desea continuar con otro servicio.
//• Si el usuario elige “no”, el programa debe finalizar mostrando un mensaje de despedida.


import java.util.Scanner;

public class E3CajSwi 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
		int opcion;
	
	System.out.println("=== MENÚ DE SALUDOS ===");
	System.out.println("1. Saludar en español");
	System.out.println("2. Saludar en inglés");
	System.out.println("3. Saludar en francés");
	System.out.println("4. Saludar en francés");
	System.out.print("Elige una opción (1-3): ");
	opcion = sc.nextInt();

	switch (opcion) 
	{
	case 1:
			System.out.println("¡Hola! ¿Cómo estás?");
	break;
	case 2:
			System.out.println("Hello! How are you?");
	break;
	case 3:
			System.out.println("Bonjour! Comment ça va?");
	break;
	default:
			System.out.println("Opción no válida. Intenta con 1, 2 o 3.");
		
		}
	}
}