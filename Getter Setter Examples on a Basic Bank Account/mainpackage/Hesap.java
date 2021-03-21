package mainpackage;

import java.util.Date;
       
/**
 *
 * @author etzellux
 */

public class Hesap 
{
    private int id;
    private double bakiye;  // amount
    private double faizOraniYillik; // interest rate per year
    private Date hesapAcilmaTarihi;  // signing date
    
    Hesap()
    {
        id = 0;
        bakiye = 0;
        faizOraniYillik = 0; 
        hesapAcilmaTarihi = new Date();
    }
    Hesap(int id,double bakiye)
    {
        this.id = id;
        this.bakiye = bakiye;
        faizOraniYillik = 0;
        hesapAcilmaTarihi = new Date();
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public double getBakiye()
    {
        return bakiye;
    }
    public void setBakiye(double bakiye)
    {
        this.bakiye = bakiye;
    }
    public double getFaizOraniYillik()
    {
        return faizOraniYillik;
    }
    public void setFaizOraniYillik(double rate)
    {
        faizOraniYillik = rate;
    }
    public double getAylikFaizOrani()
    {
        return faizOraniYillik/12;
    }
    public double getAylikFaiz()
    {
        return getAylikFaizOrani() * getBakiye();
    }
    public void paraCekme(double miktar)
    {
        if(miktar > bakiye)
        {
            System.out.println("Bu miktarda bir para çekemezsiniz");
        }
        else
        {
            bakiye -= miktar;
        }
    }
    public void paraYatir(double miktar)
    {
        bakiye += miktar;
    }
    public void yazdir()
    {
        System.out.println("\nId: " + id +
                            "\nBakiye: " + bakiye +
                            "\nHesap Açılma Tarihi: " + hesapAcilmaTarihi);
    }
    
    
}
