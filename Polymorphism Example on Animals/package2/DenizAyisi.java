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
public class DenizAyisi extends Memeli implements Etcil
{
    public DenizAyisi(String cinsiyet,int boy,int agirlik)
    {
        super("yüzüyor",cinsiyet,boy,agirlik);
        this.tur_adi = "Deniz ayisi";
    }
    
    public void ses_cikar()
    {
        System.out.println("OURK OURK OURKK \n");
    }  
    
    public void yemek_ye()
    {
        System.out.println(tur_adi + " balik yiyor...\n");
    }
    
    public void hareket_et()
    {
        System.out.println(tur_adi + " " + hareket_sekli + "\n");
    }
    
    public void saldir()
    {
        System.out.println(tur_adi + " avina saldiriyor...\n");
    }
    
    public void avlan()
    {
        System.out.println(tur_adi + "'un karni acikti, balik bulmaya cikti...\n");
    }
    
}
