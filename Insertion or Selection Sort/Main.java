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
        int[] list1;
        list1 = createList();
        displayList(list1);
        System.out.println("Selection Sort için -->1\nInsertion Sort için -->2:");
        int x = input.nextInt();
        if(x==1)
        {
            selectionSort(list1);
            displayList(list1);
        }
        else if(x==2)
        {
            insertionSort(list1);
            displayList(list1);
        }
        else
        {
            System.out.println("Lütfen geçerli bir numara giriniz...");
        }
        
        
    }
    public static int[] createList()
    {
        int[] list = new int[100];
        
        for(int i=0;i<list.length;i++)
        {
            list[i] = (int)(Math.random() * 100);
        }
        return list;
    }
    public static void displayList(int[] list)
    {
        System.out.println("\n");
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");
    }
    public static void selectionSort(int[] list)
    {
        int temp,minIdx;
        for(int i=0;i<list.length-1;i++)
        {
            minIdx = i;
            for(int j=i+1;j<list.length;j++)
            {
                if(list[j]<list[minIdx])
                {
                    minIdx = j;
                }
            }
            temp = list[minIdx];
            list[minIdx] = list[i];
            list[i] = temp;
        }
    }
    public static void insertionSort(int[] list)
    {
        for(int i=1;i<list.length;i++)
        {
            int key = list[i];
            int j = i-1;
            while(j >= 0 && list[j] > key)
            {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }
}
