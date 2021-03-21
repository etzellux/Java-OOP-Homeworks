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
        selectionSort(list1);
        displayList(list1);
        System.out.println("\nAramak istediğiniz değeri giriniz:");
        int x = input.nextInt();
        System.out.println("Linear Search için -->1\nBinary Search için-->2:");
        int y = input.nextInt();
        if(y==1)
        {
            linearSearch(list1,x);
        }
        else if(y==2)
        {
            binarySearch(list1,x);
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
        for(int i=0;i<list.length;i++)
        {
            System.out.print(list[i] + " ");
        }
    }
    public static void linearSearch(int[] list,int x)
    {
        int i = 0;
        for(;i<list.length;i++)
        {
            if(x == list[i])
            {
                System.out.println(x + " değerli elemanın indisi:" + i);
                break;
            }
        }
        if(i==100)
        {
            System.out.println("\nAradığınız değerde eleman bulunamadı...");
        }
    }
    public static void binarySearch(int[] list,int x)
    {
        int startP = 0;
        int endP = list.length - 1;
        int midP = (startP + endP) / 2;
        while(startP <= endP)
        {
            midP = (startP + endP) / 2;
            if(list[midP] == x)
            {
                break;
            }
            if(x >= list[midP])
            {
                startP = midP + 1;
            }
            else
            {
                endP = midP - 1;
            }
        }
        if(startP > endP)
        {
            System.out.println("\nAradığınız değerde eleman bulunamadı...");
        }
        else
        {
            System.out.println(x + " değerli elemanın indisi:" + midP);
        }
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
}
