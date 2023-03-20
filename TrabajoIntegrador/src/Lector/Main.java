package Lector;

import java.nio.file.Paths;
import java.util.Arrays;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

	public static void main(String[] args) {
		
		String resultados = "D:\\Documentos\\Eclipse\\TrabajoIntegrador\\src\\Lector\\resultados.txt";
		
		String pronostico = "D:\\Documentos\\Eclipse\\TrabajoIntegrador\\src\\Lector\\pronosticos.txt";
		
		//ARCHIVO PRONOSTICOS
		try {
			for (String linea : Files.readAllLines(Paths.get(pronostico))) {
				
				//Vector que contiene cada palabra de la linea actual como elemento
				String vectorLinea[] = linea.split(",");
				//Asignamos cada dato a su valor:
				String equipo1 = vectorLinea[0];
				int goles1 = Integer.parseInt(vectorLinea[1]);
				int goles2 = Integer.parseInt(vectorLinea[2]);
				String equipo2 = vectorLinea[3];
				
				if (goles1 == goles2) {
					
				}
				
				
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		//ARCHIVO RESULTADOS
		try {
			for (String linea : Files.readAllLines(Paths.get(resultados))) {
				
				String vectorLinea[] = linea.split(" ");
				
				String equipo1 = vectorLinea[0];
				
				System.out.println(equipo1);
				System.out.println(Arrays.toString(vectorLinea));
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Error al leer el archivo");
		}

	}

}
