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
                        
			if (str.charAt(i) < '0'
				|| str.charAt(i) > '9' ) {
                            
                            if (str.charAt(i)=='.'){
                          //  System.out.println("decimal count before :"+decimal);
                            decimal++;
                           // System.out.println("decimal count after :"+decimal);
                            
                            if(decimal != 0 && decimal != 1){
                                return false;
                            }
                        }
                        else{
                                return false;
                            }
                         	
			}
		}
		// If we reach here, that means
		// all characters were digits.
		return true;
	}
        
        /*spublic static void main(String [] args){
            
            String a = "56.5lhbj46";
            
           boolean result = onlyDigits(a,a.length());
           
           System.out.println(result);
        }*/
}
