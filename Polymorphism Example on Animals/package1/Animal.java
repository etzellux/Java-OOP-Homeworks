
package package1;

/**
 *
 * @author etzellux
 */
public abstract class Animal 
{
    protected int legs;
    
    protected Animal(int legs)
    {
        this.legs = legs;
    }
    
    public abstract void eat();
    
    public void Walk()
    {
        System.out.println("Ayak Sayısı:" + legs + "\n Yürüyor...");
    }
}
