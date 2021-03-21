
package mainpackage;

/**
 *
 * @author etzellux
 */
public class Akademik extends Personel 
{
    protected String ofisSaati;
    protected String unvan;
    
    Akademik(String adSoyad,String adres,String telNo,String email,String ofis,double maas,String ofisSaati,String unvan)
    {
        super(adSoyad,adres,telNo,email,ofis,maas);
        this.ofisSaati = ofisSaati;
        this.unvan = unvan;
    }

    /**
     * @return the ofisSaati
     */
    public String getOfisSaati() {
        return ofisSaati;
    }

    /**
     * @param ofisSaati the ofisSaati to set
     */
    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    /**
     * @return the unvan
     */
    public String getUnvan() {
        return unvan;
    }

    /**
     * @param unvan the unvan to set
     */
    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    
    public String toString()
    {
        return "Akademik@" + this.adSoyad;
    }
}
