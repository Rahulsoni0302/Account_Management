/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author Rahul
 */
public class Check {
    
    public static boolean
	onlyDigits(String str, int n)
	{
		// Traverse the string from
		// start to end
            
            int decimal=0;
            
		for (int i = 0; i < n; i++) {

			// Check if character is
			// not a digit between 0-9
			// then return false
                        if (str.charAt(i)=='.'){
                            decimal++;
                        }
			if (str.charAt(i) < '0'
				|| str.charAt(i) > '9' || (decimal != 0 && decimal != 1)) {
				return false;
			}
		}
		// If we reach here, that means
		// all characters were digits.
		return true;
	}
}
