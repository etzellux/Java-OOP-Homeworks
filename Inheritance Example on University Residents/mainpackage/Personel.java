
package mainpackage;
import java.util.Date;
/**
 *
 * @author etzellux
 */
public class Personel extends Kisi
{
    protected String ofis;
    protected double maas;
    protected Date iseAlim;
    
    Personel(String adSoyad,String adres,String telNo,String email,String ofis,int maas)
    {
        super(adSoyad,adres,telNo,email);
        this.ofis = ofis;
        this.maas = maas;
        iseAlim = new Date();
    }
    
    Personel(String adSoyad,String adres,String telNo,String email,String ofis,double maas)
    {
        super(adSoyad,adres,telNo,email);
        this.ofis = ofis;
        this.maas = maas;
        iseAlim = new Date();
    }

    /**
     * @return the ofis
     */
    public String getOfis() 
    {
        return ofis;
    }

    /**
     * @param ofis the ofis to set
     */
    public void setOfis(String ofis) 
    {
        this.ofis = ofis;
    }

    /**
     * @return the maas
     */
    public double getMaas() 
    {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(double maas) 
    {
        this.maas = maas;
    }
    
    public void setMaas(int maas) 
    {
        this.maas = maas;
    }

    /**
     * @return the iseAlim
     */
    public Date getIseAlim() 
    {
        return iseAlim;
    }

    /**
     * @param iseAlim the iseAlim to set
     */
    public void setIseAlim(Date iseAlim) 
    {
        this.iseAlim = iseAlim;
    }
    
    public String toString()
    {
        return "Personel@" + this.adSoyad;
    }
}
