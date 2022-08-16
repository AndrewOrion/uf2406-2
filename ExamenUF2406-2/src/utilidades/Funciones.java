package utilidades;

/**
 * 
 * @author Andrew
 *
 *Clase que define funciones para devolver n�mero central
 *y para a�os bisiestos...
 *
 */

public class Funciones {
	
	/**
	 * M�todo parametrizado que devuelve el n�mero central
	 * dados tres n�meros
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
	 * Funci�n que recibe un a�o y devuelve si es bisiesto o no
	 * 
	 * @param anyo
	 * @return bisiesto
	 */
	public boolean esBisiesto(int anyo) {
		boolean bisiesto = false;
		if (anyo <1700 || anyo >2500) {
			throw new ArithmeticException("El a�o debe estar entre 1700 y 2500");
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
