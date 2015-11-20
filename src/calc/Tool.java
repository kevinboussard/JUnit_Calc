/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;
/**
 * Class for Tool.
 * @author kévin
 *
 */
public class Tool {
    /**
     * Save and return the User input.
     * @return double
     */
    public static float keyboarding () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        float str = sc.nextFloat();
        return str;
    }
    
    /**
     * Allows to choose a specific method
     */
    public static void navigation () {
    	
    	System.out.println("Méthodes proposées : ");
    	System.out.println(" 1 - Addition ");
    	System.out.println(" 2 - Soustraction");
    	System.out.println(" 3 - Multiplication ");
    	System.out.println(" 4 - Division ");
    	System.out.println(" 5 - Nombre Premier ");
    	int choice = (int)keyboarding();
    	System.out.println("Entrer le premier nombre : ");
    	float numberOne = keyboarding();
    	System.out.println("Entrer le deuxième nombre : ");
    	float numberTwo = keyboarding();
    	Calcul calcul = new Calcul();
    	float result = 0;
    	switch ( choice ) {
    	case 1 : 
    		result = calcul.add(numberOne, numberTwo);
        	System.out.println("Le résultat de l'addition est "+ result);
        	break;
    	case 2 :
    		result = calcul.minus(numberOne, numberTwo);
        	System.out.println("Le résultat de la soustraction est "+ result);
        	break;
    	case 3 :
    		result = calcul.multiplication(numberOne, numberTwo);
        	System.out.println("Le résultat de la multiplication est "+ result);
        	break;
    	case 4 :
    		result = calcul.division(numberOne, numberTwo);
        	System.out.println("Le résultat de la division est "+ result);
        	break;
    	case 5 :
    		calcul.premier(numberOne);
        	break;
        default :
        	break;
    	}
    	
    }
    
}
