package contactBook;


import java.util.ArrayList;
import java.util.HashMap;


public class ContactsBook {

	
	static HashMap<String, Contact> contacts;
	public static void main(String[] args) {
		int n =0;
		ArrayList<Contact> con = new ArrayList<Contact>(); 
		boolean fin = false;
		while (!fin) {
			
			
		
		Contact c = new Contact();
		c = addContacts();
		con.add(new Contact(c.getNombre(),c.getApellido(),c.getCorreosElectronicos(),c.getFijo(),c.getCelular(),c.getDireccion()));
		contacts.put(con.get(n).getNombre(), con.get(n));
		
		
		contacts.forEach((k,v) -> System.out.println(v.toString()));
		
		fin = ContactsBookUI.salir(fin);
		n++;
		}
	}

	public static Contact addContacts(){
		
		Contact a1 = new Contact();
		a1.setNombre(ContactsBookUI.validarNombre());
		a1.setApellido(ContactsBookUI.validarApellido());
		a1.setCorreosElectronicos(ContactsBookUI.ValidarCorreos());
		a1.setFijo(ContactsBookUI.validarFijo());
		a1.setCelular(ContactsBookUI.validarCelular());
		a1.setDireccion(ContactsBookUI.ValidarDireccion());
		return a1;
}
		
		
		
	}

