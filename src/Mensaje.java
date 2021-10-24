import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Mensaje {
	
	private static String comentario;
	private int likes;
	private int dislikes;
	/*private int idUsuario;
	private String sentimiento;*/
	  
	//Constructor por parametros
	public Mensaje(String comentario, int likes, int dislikes) {
			
		this.comentario = comentario;
		//this.idUsuario = idUsuario;
		//this.sentimiento = sentimiento;
	    this.likes = likes;
	    this.dislikes = dislikes;
	}
	


	static List<Mensaje> cargarUsuarios() {
		
		List<Mensaje> Mensaje = new ArrayList<Mensaje>();
		List<String> lineas = new ArrayList<String>();
		
		try {
			lineas = Leer.readFile("C:\\Users\\nicol\\OneDrive\\Escritorio\\JAVA\\Parcial 1\\src\\Nomad Stories");
			System.out.println(lineas);

			for (String linea:lineas) {
				System.out.println(linea);
				String[] contenidos;
				contenidos = linea.split(",");
				Mensaje usuario = new Mensaje( contenidos[0].trim(), Integer.parseInt(contenidos[1].trim()), Integer.parseInt(contenidos[2].trim()));
				Mensaje.add(usuario);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Mensaje;
	}
	  
	

}
