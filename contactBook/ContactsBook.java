package contactBook;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactsBook {

	static HashMap<String, Contact> contacts;
	public static void main(String[] args) {
		
		contacts= new HashMap<String,Contact>();
		//a1 = addContacts();
		
		
	}

	public void addContacts(){
		
		Contact a1 = new Contact();
		a1.setNombre(ContactsBookUI.validarNombre());
		a1.setApellido(ContactsBookUI.validarApellido());
		
}
		
		
		
	}

