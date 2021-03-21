
package mainpackage;

/**
 *
 * @author etzellux
 */
public class Idari extends Personel 
{
    protected String birim;
    Idari(String adSoyad,String adres,String telNo,String email,String ofis,double maas,String birim)
    {
        super(adSoyad,adres,telNo,email,ofis,maas);
        this.birim = birim;
    }

    /**
     * @return the birim
     */
    public String getBirim() {
        return birim;
    }

    /**
     * @param birim the birim to set
     */
    public void setBirim(String birim) {
        this.birim = birim;
    }
    
    public String toString()
    {
        return "Idari@" + this.adSoyad;
    }
}
