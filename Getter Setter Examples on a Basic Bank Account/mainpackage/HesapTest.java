
package mainpackage;

/**
 *
 * @author etzellux
 */
public class HesapTest 
{
    public static void main(String args[])
    {
        Hesap hesap1 = new Hesap(112233,20000.0);
        hesap1.setFaizOraniYillik(4.5/100);
        hesap1.paraCekme(1000);
        hesap1.paraYatir(2000);
        hesap1.yazdir();
    }
}
