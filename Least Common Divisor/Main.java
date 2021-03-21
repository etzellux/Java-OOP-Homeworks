
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author etzellux
 */

public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("İlk sayıyı giriniz:");
        
        int a = input.nextInt();
        
        System.out.print("İkinci sayıyı giriniz:");
        
        int b = input.nextInt();
        
        int i = ((a<=b)? a:b);
        
        for(;i<=a*b;i++)
        {
            if(i%a == 0 && i%b == 0)
            {
                break;
            }
        }
        System.out.println("Ekok(a,b) = " + i);
    }
}
