
/**
 *
 * @author etzellux
 */

public class Main 
{
    public static void main(String args[])
    {
        int[][] list1;
        list1 = createList();
        displayList(list1);  
        minDistance(list1);
    }
    
    public static int[][] createList()
    {
        int[][] list = new int[5][5];
        for(int i=0;i<5;i++)
        {
            list[0][i] = (int)(Math.random() * 20);
            list[1][i] = (int)(Math.random() * 20);
        }
        return list;
    }
    public static void displayList(int[][] list)
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("(" + list[0][i] + "," + list[1][i] + ")" );
        }
    }
    public static double distance(int x1,int y1,int x2,int y2)
    {
        double dis = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        return dis;
    }
    public static void minDistance(int[][] list)
    {
        double dis,minD = 1000;
        int p1=0,p2=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==j)
                {
                    continue;
                }
                dis = distance(list[0][i],list[1][i],list[0][j],list[1][j]);
                if(dis<minD)
                {
                    p1 = i;
                    p2 = j;
                    minD = dis;
                }
            }
        }
        System.out.println("En kısa uzaklık:");
        System.out.println("(" + list[0][p1] + "," + list[1][p1] + ")" + "ve" + "(" + list[0][p2] + "," + list[1][p2] + ")" + "noktaları arasında:" + minD);
    }
}
