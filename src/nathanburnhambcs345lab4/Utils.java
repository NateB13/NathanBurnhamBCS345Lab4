/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nathanburnhambcs345lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author natha
 */
public class Utils
{
    public static int CubedInt(int x)
    {
        int num = x;
        num = (num * num * num);
        return num;
    }
    
    public static boolean PrimeCheck(int y)
    {
        int num = y;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)    {
                return false;        
            }
        }
        
        return true;
    
    }
    
    public int ReadFileNum(String fileName) throws FileNotFoundException {
        int num = 0;
        Scanner sc = new Scanner(new File(fileName));
        num = sc.nextInt();
        return num;
    }
    
}
