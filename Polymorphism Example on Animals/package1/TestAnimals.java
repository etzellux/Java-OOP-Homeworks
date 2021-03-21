package package1;

/**
 *
 * @author etzellux
 */
public class TestAnimals 
{
    public static void main(String args[])
    {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        
        /* ****** FISH ******* */
        
        Fish fish1 = new Fish("Bingo");
        fish1.Walk();
        fish1.eat();
        System.out.println("Isim:" + fish1.getName());
        fish1.setName("mahmut");
        fish1.play();
        
        Pet p1 = fish1;
        p1.play();
        
        /* ***** CAT *********** */
        
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Pamuk");
        System.out.println("İsim:" + cat2.getName());
        cat2.setName("Cingöz");
        cat2.Walk();
        cat2.eat();
        cat2.play();
        
        p1 = cat2;
        p1.play();
        
        /* ********* SPIDER ************ */
        
        Spider s1 = new Spider();
        s1.Walk();
        s1.eat();
        
        Animal a1 = s1;
        s1.Walk();
        
    }
}
