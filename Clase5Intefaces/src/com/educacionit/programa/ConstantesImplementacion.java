package com.educacionit.programa;

import com.educacionit.intefaces.IConstantes;

public class ConstantesImplementacion implements IConstantes {

	public static void main(String[] args) {
		int numeros[] = new int [MAX];
		
		for (int i = MIN ; i < 99; i++) {
			if(i >= MAX){
				System.out.println(MENSAJEERROR);
			}else {
				numeros[i] = i;
				System.out.println(numeros[i] + " ");
			}
		}
		
	}
	
}
