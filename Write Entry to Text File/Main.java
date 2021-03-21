

package package1;


import java.util.Scanner;
import java.io.*;

/**
 *
 * @author etzellux
 */
public class Main 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        File file = null;

        boolean control = true;
        
        try
        {
            file = new File("output.txt");
            if(!file.exists())
            {
                file.createNewFile();
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return;
        }
        
        
        while(true)
        {
            System.out.println("Dosyaya yazmak istiyor musunuz: [E/H]");
            control = input.next().toUpperCase().startsWith("E");
            if(!control)
            {
                break;
            }
            
            input.nextLine();
            
            try
            {
                System.out.println("ENTRY:");
                String str = input.nextLine();
                PrintWriter pw = new PrintWriter(file);
                pw.append(str);
                pw.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        
    }
}
