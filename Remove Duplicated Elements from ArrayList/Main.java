
package mainpackage;

import java.util.ArrayList;
/**
 *
 * @author etzellux
 */
public class Main 
{
    public static void main(String args[])
    {
        int[] array = {1,2,7,23,1,5,2,3,9,12};
        ArrayList<Integer> liste = new ArrayList<>();
        assignList(array,liste);
        System.out.println(liste.toString());
        removeDuplicate(liste);
        System.out.println(liste.toString());
    }
    public static void assignList(int[] array,ArrayList<Integer> liste)
    {
        for(int e: array)
        {
            liste.add(e);
        }
    }
    public static void removeDuplicate(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.size();j++)
            {
                if(i == j)
                {
                    continue;
                }
                else
                {
                    if(list.get(i) == list.get(j))
                    {
                        list.remove(j);
                    }
                }
            }
        }
    }
}
