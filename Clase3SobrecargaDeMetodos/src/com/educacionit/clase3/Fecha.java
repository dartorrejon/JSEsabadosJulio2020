package com.educacionit.clase3;

import java.util.Calendar;

public class Fecha {
	private int dia, mes, anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

		if (!fechaCorrecta()) {
			// obtenemos mediante la clase Calendar las fecha de SO
			Calendar fechaSitema = Calendar.getInstance();
			setDia(fechaSitema.get(Calendar.DAY_OF_MONTH));
			setMes(fechaSitema.get(Calendar.MONTH) + 1);
			setAnio(fechaSitema.get(Calendar.YEAR));

		}

	}

	// SOBRECARGA
	// metodo 1
	public void asignarFecha() {
		// este metodo asigna la fecha del sistema
		Calendar fechaSitema = Calendar.getInstance();
		setDia(fechaSitema.get(Calendar.DAY_OF_MONTH));
		setMes(fechaSitema.get(Calendar.MONTH) + 1);
		setAnio(fechaSitema.get(Calendar.YEAR));

	}
	// metodo 2
	public void asignarFecha(int d) {
		// este metodo asigna solo mes y anio del sistema
		Calendar fechaSitema = Calendar.getInstance();
		setDia(d);
		setMes(fechaSitema.get(Calendar.MONTH) + 1);
		setAnio(fechaSitema.get(Calendar.YEAR));

	}
	// metodo 3
	public void asignarFecha(int d , int m ) {
		// este metodo asigna solo el anio del sistema
		Calendar fechaSitema = Calendar.getInstance();
		setDia(d);
		setMes(m);
		setAnio(fechaSitema.get(Calendar.YEAR));

	}

	private boolean esBisiesto() {
		return (((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))));
	}

	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = (anio > 0);
		mesCorrecto = ((mes >= 1) && (mes <= 12));

		switch (mes) {
		case 2:
			if (esBisiesto())
				diaCorrecto = (dia >= 1 && dia <= 29);
			else
				diaCorrecto = (dia >= 1 && dia <= 28);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = (dia >= 1 && dia <= 30);
			break;

		default:
			diaCorrecto = (dia >= 1 && dia <= 31);
			break;
		}

		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

}
