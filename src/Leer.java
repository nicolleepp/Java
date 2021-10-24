import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Leer {
	

	// Método que lee líneas de un archivo y retorna una lista de strings con cada línea
	public static List<String> readFile(String path) throws IOException, FileNotFoundException {
		
		System.out.println(String.format("Leyendo el archivo %s", path));
		String linea;
		List<String> contenidos = new ArrayList<String>();
				
		File file = new File(path);
		Scanner sc = new Scanner(file);
				
		while(sc.hasNextLine()) {
			
			linea = sc.nextLine();
			contenidos.add(linea);
			//System.out.println(String.format("linea: %s", linea));
		}
					
		sc.close();
		return contenidos;
	}

	

}
