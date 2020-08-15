package com.educacionit.erroresPersonalizados;

public class MiPropiaException extends Exception{
	
	@Override
	public String getMessage() {
		return "Soy mi propio mensaje de error ";
	}

}
