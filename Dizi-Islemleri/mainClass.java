/*
====================================================
    CODER => Alperen ÇETİN
====================================================
    SORU => "Array", "Random, Armstrong, Palindrome Sayılar" Projesi (Dizilerle ilgili çeşitli işlemler)
====================================================
*/
public class mainClass {
    public static void main(String[] args) {
        //int[] kralDize = {153, 8208, 54748, 50211, 5151}; // ARMSTRONG_DENEME
        //int[] kralDize = {121,555,333,9559,154451,5000}; // PALINDROME_DENEME
        int[] kralDize = new int[10]; // DEFAULT
        processClass kralProcess = new processClass();
        kralProcess.rastgeleSayiDoldur(kralDize);
        kralProcess.armStrongSayi(kralDize);
        kralProcess.palindromeSayi(kralDize);
    }
}
