
package package1;

/**
 *
 * @author etzellux
 */
public class Inek extends Memeli implements Otcul
{
    public Inek(String cinsiyet,int boy,int agirlik)
    {
        super("kosuyor",cinsiyet,boy,agirlik);
        this.tur_adi = "Inek";
    }
    
    public void ses_cikar()
    {
        System.out.println("MOOOOOOOO\n");
    }
    
    public void saklan()
    {
        System.out.println(tur_adi + " calilardan bir ses duydu,saklaniyor\n");
    }
    public void hareket_et()
    {
        System.out.println(tur_adi + " " + hareket_sekli + "\n");
    }
    
    public void yemek_ye()
    {
        this.bitki_ara();
        System.out.println(tur_adi + " ot yiyor...\n");
    }
    
    public void bitki_ara()
    {
        System.out.println(tur_adi + "yiyebilmek icin ot ariyor...\n");
    }
    
}
