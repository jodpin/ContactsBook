package contactBook;

import java.util.Scanner;

public class ContactsBookUI {
	
	private static String temporal;
	static Scanner s;
	static int y;
	public static String validarNombre(){
		
		s = new Scanner(System.in);
		boolean isNumeric;
		
		System.out.println("por favor ingrese los datos del nuevo contacto");
		isNumeric = true;
		while(isNumeric == true){
		System.out.println("nombre: ");
		temporal = s.next();
			try {
				y = Integer.parseInt(temporal);
				isNumeric = true;
				System.out.println("ingrese le nombre corretamente");
			} catch (NumberFormatException err) {
				isNumeric = false;
				
			}
		
	}
		return temporal;
}
	
public static String validarApellido(){
		
		s = new Scanner(System.in);
		boolean isNumeric;
		
		System.out.println("por favor ingrese los datos del nuevo contacto");
		isNumeric = true;
		while(isNumeric == true){
		System.out.println("nombre: ");
		temporal = s.next();
			try {
				y = Integer.parseInt(temporal);
				isNumeric = true;
				System.out.println("ingrese le nombre corretamente");
			} catch (NumberFormatException err) {
				isNumeric = false;
				
			}
		
	}
		return temporal;
}
}