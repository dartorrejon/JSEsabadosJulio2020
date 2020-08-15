package com.educacionit.erroresanidados;

public class TryAnidado {
	public static void main(String[] args) {

		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		try {// TRY EXTERNO
			for (int i = 0; i < nums.length; i++) {
				try {// TRY INTERNO ANIDADO

					System.out.println(nums[i] + " / " + denom[i] + "=" + nums[i] / denom[i]);

				} catch (ArithmeticException e) {
					// Capturamos la Exceptio de la superClase
					System.out.println("no se puede dividir po cero en lo numeros reales");
					System.out.println("mensaje: " + e.getMessage());
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// capturamos la exception de la sub clase
			System.out.println("No se encontro ningun elemento");
			System.out.println("ERRORRRRR: END APP");
		}
	}
}
