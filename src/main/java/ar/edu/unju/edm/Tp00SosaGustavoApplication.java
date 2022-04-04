package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Estudiante;



@SpringBootApplication
public class Tp00SosaGustavoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00SosaGustavoApplication.class, args);
		
		String nombre = "Gustavo";
		System.out.println("HOLA EDM, dice "+ nombre+ " " + darNombre());
		
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("44000000");
		unEstudiante.setNombre("Nuevo Nombre");
		
		System.out.println("El Estudiante "+ unEstudiante.getNombre() + " dice HOLA!");
		
	}

	public static String darNombre() {
		String nuevoNombre = "Sebastian";
		return nuevoNombre;
	}
}
