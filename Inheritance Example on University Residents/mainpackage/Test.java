
package mainpackage;

/**
 *
 * @author etzellux
 */
public class Test 
{
    public static void main(String args[])
    {
        
        Kisi kisi1 = new Kisi("Furkan Er","Bakırköy/İst","7697821","furki1234@gmail.com");
        Ogrenci o1 = new Ogrenci("Mehmet Gürkan","Fatih/İst","021321321","mehemt890@gmail.com",2);
        Personel p1 = new Personel("Fatma Dila","Atasehir/İst","0289734","fartma120@gmail.com","Akyakalar",2500.0);
        Idari i1 = new Idari("Hasan Kılıç","Güngören/İst","0213987998","hasanklc890@gmail.com","Pınarbasi",2700.0,"Temizlik");
        Akademik a1 = new Akademik("Zeynep Kırca","Esenler/İst","023534681","zeynep2220@gmail.com","Laleli",5000,"17.00-19.00","Prof");
        /* POLYMORPHISM */
        /* UPCASTING */
        Personel pP = a1;
        System.out.println(pP.toString());
        System.out.println(pP.ofis);
        /* .unvan degiskenine erisilemiyor */
        
        /* DOWNCASTING */
        Akademik aP = (Akademik)pP;
        System.out.println(pP.toString());
        System.out.println(aP.unvan);
        
        o1.display();
    }
}
