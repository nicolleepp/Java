import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----Inicializando----");
		List <Mensaje> mensajes = Mensaje.cargarUsuarios();
		System.out.println(mensajes);

	}

}
