package actividad04;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Actividad04 {
	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);
		Map<String,String> agenda = new HashMap<> ();
		
		String telefono;
		String nombre;
		int opcion;
		boolean salir = false;
		
		
		while(salir != true) {
			
			System.out.println("");
			System.out.println("--------------MENU-------------------");
			System.out.println("1. Añadir contacto");
			System.out.println("2. Lista contacto");
			System.out.println("3. Comprobar si existe un contacto");
			System.out.println("4. Eliminar un contacto");
			System.out.println("5. Salir");
			
			
			try {
			
				System.out.println("Digite una opcion: ");
				opcion = teclado.nextInt();
				
				switch(opcion) {
				
				case 1:
					System.out.println("Digite su nombre: ");
					nombre = teclado.next();
					System.out.println("Digite su telefono: ");
					telefono = teclado.next();
					
					
                                        // agenda
                                        //KEY    VALUE
					if(!agenda.containsKey(nombre)) {
						
						agenda.put(nombre, telefono);
						System.out.println("El contacto ha sido añadido con éxito");
						
					}else {
						System.out.println("Ya existe un contacto con el mismo nombre");
					}
					break;
					
				case 2:
					if(agenda.entrySet().isEmpty()) {
						System.out.println("");
						System.out.println("No existen contactos en su registro");
						
					}else {
                                                System.out.println("LISTA DE CONTACTOS");
						for(Map.Entry<String,String> i : agenda.entrySet()) {
							System.out.println("");
							System.out.println("Nombre: " + i.getKey() + "|| Telefono: " + i.getValue());
						}
					}				
								
					break;
				case 3:
					System.out.println("");
					System.out.println("Digite el nombre del contacto que desea comprobar si existe");
					nombre = teclado.next();
					
					if(agenda.containsKey(nombre)) {
						System.out.println("Sí existe el contacto");
						
					}else {
						System.out.println("No existe el contacto");
					}
					
					break;
				case 4:
					System.out.println("");
					System.out.println("Digite el nombre del contacto que desea eliminar: ");
					nombre = teclado.next();
					
					if(agenda.containsKey(nombre)) {
						agenda.remove(nombre);
						System.out.println("Se ha eliminado correctamente el contacto");
					}else {
						System.out.println("No existe el contacto");
					}
					
					break;
				case 5:
					System.out.println("---------------------");
					System.out.println("SALIENDO...");
					System.exit(0);
					break;
						
				default:
					System.out.println("Escoja una opción válida");
					break;
				
				}//end switch
				
                        }/*end try*/catch(Exception e) {
			System.out.println("Error: " + e);
                        }//end catch
		}//end while
	}//end main
}//end class