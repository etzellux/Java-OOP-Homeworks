import java.util.Scanner;

/**
 *
 * @author etzellux
 */
public class Main 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Beşgenin merkezi ile kenarı arasındaki uzaklığı giriniz:");
        double x = input.nextDouble();
        
        double radian = Math.toRadians(72);
        double area = 0.5 * Math.sin(radian) * x * x * 5;
        
        System.out.println("Beşgenin alanı: " + area);
    }
}
