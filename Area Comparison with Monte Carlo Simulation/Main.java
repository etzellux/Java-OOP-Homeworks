import java.util.Random;

/**
 *
 * @author etzellux
 */

public class Main 
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int area1 = 100;
        int area1Hits = 0; /* area1 (10,10) --> (20,20) */
        int area2Hits = 0; /* area2 (0,0) --> (30,30), area1 < area2  */
        int x,y;
        
        // Area1 = 100, Area2 = 300
        
        int denemeSayisi = 50;
        
        for(int i=0;i<denemeSayisi;i++)
        {
            for(int j=0;j<10;j++)
            {
                x = rand.nextInt(31);
                y = rand.nextInt(31);
            
                if((x>=10 && x<=20) && (y>=10 && x<=20))
                {
                    area1Hits++;
                }
                else
                {
                    area2Hits++;
                } 
            }
            double ratio = area2Hits / area1Hits;
            
            System.out.println("Area1'in Area2'ye oranı: " + ratio);
            
            System.out.println("Area2'nin tahmini alanı (300'e yakınsıyor): " + (ratio * area1));
        }
     
    }
}
