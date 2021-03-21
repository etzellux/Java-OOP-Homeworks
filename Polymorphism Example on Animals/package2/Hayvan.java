
package package1;

/**
 *
 * @author etzellux
 */

public abstract class  Hayvan 
{
    protected String tur_adi;
    protected String solunum_turu; //Hayvan nasıl soluyor örn: iç solunum
    protected String hareket_sekli; // Hayvan yürüyor mu? yüzüyor mu? sürünüyor mu?
    protected String cinsiyet; // Dişi mi eril mi?
    protected int boy; //Hayvanın boyu cm cinsinden
    protected int agirlik; //Hayvanın ağırlığı
    protected boolean omurgali; // Hayvan omurgalı mı? omurgasız mı?
    
    public Hayvan(String solunum_turu,String hareket_sekli,String cinsiyet,int boy,int agirlik,boolean omurgali)
    {
        //Hayvan constructor'ı
        
        this.solunum_turu = solunum_turu;
        this.hareket_sekli = hareket_sekli;
        this.cinsiyet = cinsiyet;
        this.boy = boy;
        this.agirlik = agirlik;
        this.omurgali = omurgali;
    }
    
    public abstract void yemek_ye(); //Hayvanin yemek yemesiyle ilgili bilgiyi ekrana yazdirir.
    
    public abstract void hareket_et(); //Hayvanin hareket etmesiyle ilgili bilgiyi ekrana yazdirir.
    
    public abstract void ses_cikar(); // Hayvanin ozel sesini ekrana yazdirir.
    
    public abstract void AirBreathing(); // Hayvanin solunumuyla ilgili bilgiyi ekrana yazdirir.

    
    public String getSolunum_turu() 
    {
        return solunum_turu;
    }

    
    public void setSolunum_turu(String solunum_turu) 
    {
        this.solunum_turu = solunum_turu;
    }

    
    public String getHareket_sekli() 
    {
        return hareket_sekli;
    }

    
    public void setHareket_sekli(String hareket_sekli) 
    {
        this.hareket_sekli = hareket_sekli;
    }

    
    public String getCinsiyet() 
    {
        return cinsiyet;
    }

    
    
    public void setCinsiyet(String cinsiyet) 
    {
        this.cinsiyet = cinsiyet;
    }

   
    public int getBoy() 
    {
        return boy;
    }

    
    public void setBoy(int boy) 
    {
        this.boy = boy;
    }

    
    public int getAgirlik() 
    {
        return agirlik;
    }

   
    public void setAgirlik(int agirlik) 
    {
        this.agirlik = agirlik;
    }

   
    public boolean isOmurgali() 
    {
        return omurgali;
    }

   
    public void setOmurgali(boolean omurgali) 
    {
        this.omurgali = omurgali;
    }
    
    
}
