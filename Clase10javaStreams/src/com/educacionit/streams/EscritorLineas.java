package com.educacionit.streams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorLineas {

	public static void main(String[] args) throws IOException {
		File outputFile = new File("archivosES" + File.separator + "salida" + File.separator + "output.txt");
		
		String linea1 = "mi mama me mima";
		String linea2 = "pronto estare en casa";
		String linea3 = "es la ultima clase no olvidarme de preguntar mis dudas";
		
		BufferedWriter writerCool = new BufferedWriter(new FileWriter(outputFile));
		
		writerCool.write(linea1 , 0 , linea1.length());
		writerCool.newLine();
		writerCool.write(linea2 , 0 , linea2.length());
		writerCool.newLine();
		writerCool.write(linea3 , 0 , linea3.length());
		writerCool.newLine();
		
		writerCool.close();
		
		
	}

}
