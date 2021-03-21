
package package1;

/**
 *
 * @author etzellux
 */
public abstract class Memeli extends Hayvan
{
    public Memeli(String hareket_sekli,String cinsiyet,int boy,int agirlik)
    {
        super("iç solunum",hareket_sekli,cinsiyet,boy,agirlik,true);
    }
    
    @Override
    public void AirBreathing() //Override edilmis fonksiyon. Solunumla ilgili bilgileri ekrana basar.
    {
        System.out.println(tur_adi + " " + getSolunum_turu() + "yapiyor...\n");
    }
    
}
