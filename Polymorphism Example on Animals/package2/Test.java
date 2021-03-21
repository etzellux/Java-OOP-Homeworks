/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import java.util.ArrayList;

/**
 *
 * @author etzellux
 */
public class Test 
{
    public static void main(String args[])
    {
        ArrayList<Memeli> Hayvanlar = new ArrayList<>();
        /****** KURT *******/
    
        Kurt kurt1 = new Kurt("eril",150,50);
        kurt1.ses_cikar();
        kurt1.AirBreathing();
        kurt1.avlan();
        kurt1.hareket_et();
        kurt1.yemek_ye();
        
        kurt1.setAgirlik(55);
        System.out.println(kurt1.getAgirlik());
        kurt1.setBoy(155);
        System.out.println(kurt1.getBoy());
        kurt1.setCinsiyet("disi");
        System.out.println(kurt1.getCinsiyet());
        kurt1.setHareket_sekli("kosuyor");
        System.out.println(kurt1.getHareket_sekli());
        kurt1.setOmurgali(true);
        System.out.println(kurt1.isOmurgali());
        kurt1.setSolunum_turu("ic solunum");
        System.out.println(kurt1.getSolunum_turu());
        
        Hayvanlar.add(kurt1);
        
        
        /******** INEK ************/
        
        Inek inek1 = new Inek("disi",180,500);
        inek1.ses_cikar();
        inek1.AirBreathing();
        inek1.hareket_et();
        inek1.yemek_ye();
        inek1.saklan();
        inek1.bitki_ara();
        
        Hayvanlar.add(inek1);
        
        /******* DENİZ AYISI **********/
        
        DenizAyisi ayi1 = new DenizAyisi("erkek",170,250);
        ayi1.AirBreathing();
        ayi1.avlan();
        ayi1.hareket_et();
        ayi1.saldir();
        ayi1.ses_cikar();
        ayi1.yemek_ye();
        
        Hayvanlar.add(ayi1);
        
        Memeli m1 = ayi1;
        System.out.println(m1.getCinsiyet());
        
        DenizAyisi ayi2 = (DenizAyisi)m1;
        
        ayi2.hareket_et();
    }
}
