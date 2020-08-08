package com.educacionit.aerolinea;

//Clase Hija de Vuelo 
public class VueloCarga extends Vuelo {	
	public int asientos = 12 ;
	public float espacioMaximoDeCarga = 1000; //pies cubicos de espacio en bodega  
	public float espacioCargaUsado ; //usamos esta variable para ver el espacio usado 
	
	public void agregarPaquete(float altura, float ancho , float profundidad) {
		double size = altura * ancho * profundidad;
		if(espacioDeCargaDisponible(size)) {
			espacioCargaUsado += size ;
			System.out.println("se agrego tu paquete a la bodega del avion ");
		}else {
			faltaEspacio();
		}
	}
	private boolean espacioDeCargaDisponible(double tamanio) {		
		return espacioCargaUsado + tamanio <= espacioMaximoDeCarga ;
	}
	
	private void faltaEspacio() {
		System.out.println("no tenemos mas espacio en nuestra bodega , busquen otro avion de carga");
	}
	//quiero pisar el metodo del padre 
	@Override
	public int getAsiento() {
		return 12;
	}
}
