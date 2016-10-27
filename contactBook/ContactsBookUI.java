package contactBook;

import java.util.Scanner;

public class ContactsBookUI {

	private static String temporal;
	static Scanner s = new Scanner(System.in);
	static int y;
	static String correos[];
	static Long movil;

	public static String validarNombre() {

		boolean isNumeric;

		isNumeric = true;
		while (isNumeric == true) {
			System.out.println("nombre: ");
			temporal = s.next();
			try {
				y = Integer.parseInt(temporal);
				isNumeric = true;
				System.out.println("\n ingrese el nombre corretamente");
			} catch (NumberFormatException err) {
				isNumeric = false;

			}
			if (temporal.length() < 3 || temporal.length() > 10) {
				isNumeric = true;
				System.out.println("\n el nombre debe contener minimo 3 letras y maximo 10");
			}

		}
		return temporal;
	}

	public static String validarApellido() {

		boolean isNumeric;

		isNumeric = true;
		while (isNumeric == true) {
			System.out.println("apellido: ");
			temporal = s.next();
			try {
				y = Integer.parseInt(temporal);
				isNumeric = true;
				System.out.println("\ningrese le nombre corretamente");
			} catch (NumberFormatException err) {
				isNumeric = false;

			}
			if (temporal.length() < 3 || temporal.length() > 10) {
				isNumeric = true;
				System.out
						.println("\nel apellido debe contener minimo 3 letras y maximo 10 y no debe contener numeros");
			}

		}
		return temporal;
	}

	public static String ValidarDireccion() {
		System.out.println("direccion: ");
		temporal = s.next();
		return temporal;

	}

	public static String[] ValidarCorreos() {

		correos = new String[2];
		System.out.println("correo 1: ");
		temporal = s.next();
		correos[0] = temporal;
		System.out.println("correo 2: ");
		temporal = s.next();
		correos[1] = temporal;

		return correos;

	}

	public static int validarFijo() {

		boolean isNumeric;
		isNumeric = false;

		System.out.println("telefono fijo");
		while (isNumeric == false) {

			temporal = s.next();

			try {
				y = Integer.parseInt(temporal);
				isNumeric = true;
			} catch (NumberFormatException e) {
				System.out.println("por favor ingrese valores validos, sin letras");
				isNumeric = false;

			}

			if (temporal.length() != 7) {
				isNumeric = false;
				System.out.println("el telefono fijo debe tener 7 digitos");
			}

		}
		return y;

	}

	public static Long validarCelular() {

		boolean isNumeric;
		isNumeric = false;

		System.out.println("telefono calular");
		while (isNumeric == false) {

			temporal = s.next();

			try {
				movil = Long.parseLong(temporal);
				isNumeric = true;
			} catch (NumberFormatException e) {
				System.out.println("por favor ingrese valores validos, sin letras");
				isNumeric = false;

			}

			if (temporal.length() != 10) {
				isNumeric = false;
				System.out.println("el telefono fijo debe tener 10 digitos");
			}

		}
		return movil;

	}
	
	
	public static boolean salir(boolean fin) {

		s = new Scanner(System.in);
		boolean temp = true;
		System.out.println("\t 1. salir\t 2. continuar \n");
		int i;
		while (temp) {
			i = s.nextInt();

			if (i == 1) {
				fin = true;
				temp = false;
				System.out.println("HASTA LUEGO");
			}

			else if (i == 2) {
				fin = false;
				temp = false;
			} else if (i < 1 || i > 2) {
				System.out.println("elija una opcion correcta");
				temp = true;
			}
		}
		
		temp = true;
		return fin;
		
	}
}