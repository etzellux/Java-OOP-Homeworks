
package mainpackage;

/**
 *
 * @author etzellux
 */
public class Ogrenci extends Kisi
{
    protected final String statu;
    private String[] status = new String[]{"1.sınıf","2.sınıf","3.sınıf","4.sınıf"};
    
    Ogrenci(String adSoyad,String adres,String telNo,String email,int statuNum)
    {
        super(adSoyad,adres,telNo,email);
        statu = status[statuNum];
    }
    
    public String toString()
    {
        return "Ogrenci@" + this.adSoyad;
    }
}
