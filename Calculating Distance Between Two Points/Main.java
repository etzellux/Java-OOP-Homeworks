import java.util.Scanner;
/**
 *
 * @author etzellux
 */
public class Main 
{
    public static void main(String args[])
    {
        final double RADIUS = 6371.01;
        /* e1 = latitude1, e2 = latitude2, b1 = longitude1, b2 = longitude2 */
        double e1,b1,e2,b2;
        double distance; // Distance between two points
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Birinci konumun enlemi:");
        e1 = input.nextDouble();
        
        System.out.println("Birinci konumun boylamı:");
        b1 = input.nextDouble();
        
        System.out.println("İkinci konumun enlemi:");
        e2 = input.nextDouble();
        
        System.out.println("İkinci konumun boylamı:");
        b2 = input.nextDouble();
        
        e1 = Math.toRadians(e1);
        b1 = Math.toRadians(b1);
        
        e2 = Math.toRadians(e2);
        b2 = Math.toRadians(b2);
       
        distance = Math.asin(Math.sqrt(Math.pow(Math.sin((e2-e1)/2),2) + Math.cos(e1) * Math.cos(e2) * Math.pow(Math.sin((b2-b1)/2),2))) * 2 * RADIUS;
        
        System.out.println("İki konum arasındaki uzaklık:" + distance);
        
    }
}
