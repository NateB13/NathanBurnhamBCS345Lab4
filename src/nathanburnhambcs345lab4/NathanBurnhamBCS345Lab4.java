/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nathanburnhambcs345lab4;

import java.io.FileNotFoundException;



/**
 *
 * @author natha
 */
public class NathanBurnhamBCS345Lab4 {
    
    public static void main(String[] args) throws FileNotFoundException
    {
       
        Utils ut = new Utils();
        int number = 5;
        int newNum = 0;
        newNum = ut.CubedInt(number);
        boolean isPrime = false;
        isPrime = ut.PrimeCheck(number);
        System.out.println("Cubed of " + number + " is " + newNum);
        System.out.println("The number " + number + " is prime: " + isPrime);
        System.out.println("read from file numbers.txt value of: " + ut.ReadFileNum("c://d//numbers.txt"));

                    
    }
    
}
