package utilidades;

/**
 * 
 * @author Andrew
 *
 *Clase que define funciones para devolver número central
 *y para años bisiestos...
 *
 */

public class Funciones {
	
	/**
	 * Método parametrizado que devuelve el número central
	 * dados tres números
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return enMedio
	 */
	public int devuelveCentral(int num1, int num2, int num3) {
		
		int enMedio;
		
		if ( ((num1>num2) && (num1<num3)) || ((num1>num3) && (num1<num2))) {
			enMedio=num1;
		}  else if  ( ((num2>num1) && (num2<num3)) || ((num2>num3) && (num2<num1)) ){
			enMedio= num2;
		} else {
			enMedio = num3;
		}
		return enMedio;
	}
	

	/**
	 * Función que recibe un año y devuelve si es bisiesto o no
	 * 
	 * @param anyo
	 * @return bisiesto
	 */
	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El año debe estar entre 1700 y 2500");
		}
		if (anyo %4 == 0 ) {
			if (anyo%100==0 && anyo%400!=0) {
				bisiesto=false;
			} else {
				bisiesto=true;
			}
		} else  {
			bisiesto=false;
		}
		return bisiesto;
	}
	

	
	
	
}
