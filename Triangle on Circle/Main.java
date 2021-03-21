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
        
        double angleA,angleB,angleC;
        double a,b,c;
        
        double angle = rand.nextInt(361);
        double radian = Math.toRadians(angle);        
        double Ax = (40 * Math.cos(radian));
        double Ay = (40 * Math.sin(radian));
        
        angle = rand.nextInt(361);
        radian = Math.toRadians(angle);
        double Bx = (40 * Math.cos(radian));
        double By = (40 * Math.sin(radian));
        
        angle = rand.nextInt(361);
        radian = Math.toRadians(angle);
        double Cx = (40 * Math.cos(radian));
        double Cy = (40 * Math.sin(radian));
        
        System.out.println("A = "+ "(" + Ax + "," + Ay + ")");
        System.out.println("B = "+ "(" + Bx + "," + By + ")");
        System.out.println("C = "+ "(" + Cx + "," + Cy + ")");
        
        a = Math.sqrt((Bx-Cx)*(Bx-Cx) + (By-Cy)*(By-Cy));
        
        b = Math.sqrt((Ax-Cx)*(Ax-Cx) + (Ay-Cy)*(Ay-Cy));
        
        c = Math.sqrt((Ax-Bx)*(Ax-Bx) + (Ay-By)*(Ay-By));
        
        angleA = Math.acos((a*a - b*b - c*c) / (-2*b*c));
        angleA = Math.toDegrees(angleA);
        
        angleB = Math.acos((b*b - a*a - c*c) / (-2*a*c));
        angleB = Math.toDegrees(angleB);
        
        angleC = Math.acos((c*c - a*a - b*b) / (-2*a*b));
        angleC = Math.toDegrees(angleC);
        
        System.out.println("A açısı:" + angleA);
        System.out.println("B açısı:" + angleB);
        System.out.println("C açısı:" + angleC);
        
        
        
        
        
        
        
        
        
        
        
      
        
        
        
        
    }
}
