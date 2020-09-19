package com.educacionit.streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

	public static void main(String[] args) throws IOException {
		
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "destino.txt");
		
		FileWriter out = new FileWriter(outputFile);
		
		String texto = "soy un mensaje escribime en tu archivo";
		
		for (int i = 0; i < texto.length(); i++) {
			out.write(texto.charAt(i));
		}
		out.close();
		System.out.println("ya termine de escrbir el texto en tu archivo ");
	
	}
}
