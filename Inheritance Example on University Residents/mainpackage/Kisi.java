
package mainpackage;

/**
 *
 * @author etzellux
 */
public class Kisi 
{
    protected String adSoyad;
    protected String adres;
    protected String telNo;
    protected String email;
    
    Kisi(String adSoyad,String adres,String telNo,String email)
    {
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.telNo = telNo;
        this.email = email;
    }

    /**
     * @return the adSoyad
     */
    public String getAdSoyad() 
    {
        return adSoyad;
    }

    /**
     * @param adSoyad the adSoyad to set
     */
    public void setAdSoyad(String adSoyad) 
    {
        this.adSoyad = adSoyad;
    }

    /**
     * @return the adres
     */
    public String getAdres() 
    {
        return adres;
    }

    /**
     * @param adres the adres to set
     */
    public void setAdres(String adres) 
    {
        this.adres = adres;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() 
    {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) 
    {
        this.telNo = telNo;
    }

    /**
     * @return the email
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public String toString()
    {
        return "Kisi@" + this.adSoyad;
    }
    
    public void display()
    {
        System.out.println("Ad Soyad:" + this.adSoyad + "\nTelefon Numarası:" + this.telNo + "\nE-mail:" + this.email);
    }
}
