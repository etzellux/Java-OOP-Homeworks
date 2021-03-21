
package mainpackage;
import java.util.*;
/**
 *
 * @author etzellux
 */
public class Main 
{
    public static void main(String args[])
    {
        Vector<Integer> v1 = new Vector<>();
        
        v1.add(5);
        v1.add(7);
        v1.add(11);
        
        System.out.println(v1);
        
        v1.remove(0);
        
        System.out.println(v1);
        
        System.out.println("0 indisli eleman:" + v1.get(0));
        
        
    }
}
