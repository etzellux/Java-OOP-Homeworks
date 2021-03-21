
package package1;

/**
 *
 * @author etzellux
 */
public class Cat extends Animal implements Pet
{
    private String name;
    
    public Cat()
    {
        super(4);
    }
    public Cat(String name)
    {
        super(4);
        this.name = name;
    }
    
    @Override
    public String getName()
    {
        return name;
    }
    
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public void play()
    {
        System.out.println("MEOOW...\n" + name + " TOP ILE OYNUYOR...\n");
    }
    
    @Override
    public void eat()
    {
        System.out.println("MEOWW MEOWW HARCH HURCCHH MMM...\n" + name + " YEMEK YIYOR\n");
    }
}
