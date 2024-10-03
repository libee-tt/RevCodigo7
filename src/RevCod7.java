import java.util.HashMap;
import java.util.Scanner;

public class RevCod7 {

	 	Scanner s = new Scanner(System.in);//se agrega System.in

	    HashMap<String, String> ca = new HashMap<>();//Cambio a Strings

	    public RevCod7() { //se agregó constructor 
	    	
	    ca.put("Canadá", "Ottawa");//se corrigió el nombre de Ottawa
	    ca.put("Estados Unidos", "Washington DC");
	    ca.put("México", "México DF");
	    ca.put("Belice", "Belmopán");
	    ca.put("Costa Rica", "San José"); //Corrección mayúscula
	    ca.put("El Salvador", "San Salvador"); //Se agregó la capital
	    ca.put("Guatemala", "Ciudad de Guatemala");
	    ca.put("Honduras", "Tegucigalpa");
	    ca.put("Nicaragua", "Managua");
	    ca.put("Panamá", "Panamá");
	    }//Codigo7
	   
	    public void run() { //se añade método run 
	    	
	    String c = ""; //corrección String
	    do {
	      System.out.println("Escribe el nombre de un país y te diré su capital: ");
	      c = s.nextLine(); //se cambia a nextLine para recibir un String 
	      
	      if (!c.equalsIgnoreCase("salir")) { //se mejoró a equalsIgnoreCase
	        if (ca.containsKey(c)) { //se busca por llave, no por valor
	          System.out.println("La capital de "+c+" es "+ca.get(c)); //se pone get, no put
	        } else {
	          System.out.print("No conozco la respuesta. ¿Cual es la capital de " +c+"?: ");
	   
	          String capital = s.nextLine(); //ca a capital por el HashMap
	          ca.put(c, capital);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }//else
	      }//if
	    } while (!c.equalsIgnoreCase("salir"));//se corrigió while y se añadio IngoreCase
	    }//run
	    
	    public static void main (String[]args) {
	    	RevCod7 app = new RevCod7(); //se crea una nueva para correr
	    	app.run();
	    }//main

}//class RevCod7
