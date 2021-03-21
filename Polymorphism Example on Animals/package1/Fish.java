/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author etzellux
 */
public class Fish extends Animal implements Pet
{
    private String name;
    
    public Fish()
    {
        super(0);
    }
    public Fish(String name)
    {
        super(0);
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
    public void eat()
    {
        System.out.println("MMMH...\n" + name + " YUZUYOR\n");
    }
    
    @Override
    public void Walk()
    {
        System.out.println("Ayak Sayısı:" + legs + "\nYüzüyor...\n");
    }
    
    @Override
    public void play()
    {
        System.out.println(name + " OYUN OYNUYOR....\n");
    }
}
