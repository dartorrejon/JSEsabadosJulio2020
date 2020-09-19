package com.educacionit.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamArchivoRemoto {

	public static void main(String[] args) throws IOException {
		try {
			URL url = new URL("https://raw.githubusercontent.com/alexdeassis7/IntroProgramacionUTNGutembergAgosto2019/master/clase5%20Vectores/main.c");

			BufferedReader elBuffer = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));

			boolean eof = false;
			String unaLinea;

			while (!eof) {
				unaLinea = elBuffer.readLine();

				if (unaLinea != null) {
					System.out.println(unaLinea);
				} else {
					eof = true;
				}
			}
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
			System.out.println("La url no esta disponible ");
		}

	}

}
