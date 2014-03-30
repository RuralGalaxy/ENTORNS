package calculadora;

/**
 * Exercicis JUnit
 * 
 * Calculadora d'enters.
 * 
 * @author Rafel Sastre Mas
 */
public class CalculadoraEnters {

	/**
	 * Aquest mètode fa la divisió de dos números sencers.
	 * @param a
	 * @param b
	 * @return
	 */
	public int divisio(int a, int b) {
		int resultat;
		resultat = a / b;
		return resultat;
	}

	/**
	 * Aquest mètode fa la resta de dos números sencers.
	 * @param a
	 * @param b
	 * @return
	 */
	public int resta(int a, int b) {
		int resultat;
		resultat = a - b;
		return resultat;
	}

	/**
	 * Aquest mètode fa la multiplicació de números sencers.
	 * @param a
	 * @return
	 */
	public int multiplicacio(int... a) {
		int resultat = 1;
		for (int i = 0; i < a.length; i++) {
			resultat = resultat * a[i];
		}
		return resultat;
	}

	/**
	 * Aquest mètode fa la suma de números sencers.
	 * @param a
	 * @return
	 */
	public int suma(int... a) {
		int resultat = 0;
		for (int i = 0; i < a.length; i++) {
			resultat = resultat + a[i];
		}
		return resultat;
	}

}