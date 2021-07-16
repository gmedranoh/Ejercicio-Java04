import java.util.Scanner;
import javax.swing.JOptionPane;

/*public class ControlDeFlujo {
	
	/* aqui irian las variables globales*/

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
/*se le la edad del usuario por consola, si la edad es mayor a 18 mayor, se muestra
 * un mensaje al usuario que puede votar, en caso contrario se muestra un mensaje 
 * indicando que no puede votar
 * */		
	/*	Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = leerEdad.nextInt();
		String mensaje = votar(edad);
		
		System.out.println(mensaje);

	}
	
	public static String votar(int edad) {
		String mensaje = "";
		if(edad > 18) {
			mensaje ="Puedes votar";
		} else {
			mensaje = "No puedes votar";
		}
		return mensaje;
	}

}


/*
 * Escribir un programa que pida el nombre y la edad de un participante
		 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
		 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
		 el programa de generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que diga
		 "No cumples lo requisitos para el bootcamp Java Full Stack"

 * */

public class ControlDeFlujo {

	public static void main(String[] args) {
			
		Scanner leerEdad = new Scanner(System.in);
		Scanner leerNombre = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = leerEdad.nextInt();
		System.out.println("Ingresa tu nombre");
		String nombre = leerNombre.nextLine();
		
		String mensaje = votar(edad, nombre);
		
		System.out.println(mensaje);
	}
	
	public static String votar(int edad, String nombre) {
		String mensaje = "";
		if(edad >= 18 && edad <=29) {
			mensaje ="Felicidades " + nombre + " estas aceptado en \n"
					+ "el programa de generation Java Full Stack";
		} else {
			mensaje = nombre + " no cumples lo requisitos para el bootcamp Java Full Stack";
		}
		return mensaje;
	}

}






