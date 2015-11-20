package calc;

/**
 * Class for Calcul.
 * @author kévin
 *
 */
public class Calcul {
	/**
	 * Method addition function.
	 * @param a first number
	 * @param b second number
	 * @return result of addition
	 */
	public float add (float a, float b) {
		return a + b;
	}
	
	/**
	 * Method minus function/
	 * @param a first number
	 * @param b second number
	 * @return result of minus
	 */
	public float minus (float a, float b) {
		return a - b;
	}
	
	/**
	 * Method multiplication function
	 * @param a first number
	 * @param b second number
	 * @return result of multiplication
	 */
	public float multiplication (float a, float b) {
		return a * b;
	}
	
	
	/**
	 * Method division function.
	 * @param a first number
	 * @param b second number
	 * @return result of division
	 */
	public float division (float a, float b) {
		while(b == 0){
			System.out.println("Impossible de diviser par 0");
			b = Tool.keyboarding();
		}
		return a / b;
		
	}
	/**
	 * Method premier function.
	 * @param a first number
	 * @return boolean (true id premier)
	 */
	public boolean premier (float a) {
		int number = (int)a;
		int compteur = 0;
		for(int i = 1; i <= number; i++){
			if((number % i)==0){
				compteur++;
			}
		}
		if(compteur == 2){
			return true;
		}else{
			return false;
		}
	}

}
