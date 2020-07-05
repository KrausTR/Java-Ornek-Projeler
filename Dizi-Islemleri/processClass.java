import javax.swing.*;

public class processClass {
    public void rastgeleSayiDoldur(int[] inputArray)
    {
        System.out.print("Rastgele -> dize[10] = ");
        for(int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = (int)(Math.random() * 1500000 + 11);
            System.out.print(inputArray[i]+" ");
        }
        System.out.print("\n");
    }
    public void armStrongSayi(int[] inputArray)
    {
        System.out.println("Armstrong Sayilar ->");
        int armStrongSay = 0;
        for(int i = 0, tempBasamakSayi, islemToplami = 0; i < inputArray.length; i++)
        {
            islemToplami = 0;
            int basamakSay = 0, tempBasamak = inputArray[i];
            while(tempBasamak > 0)
            {
                tempBasamak = tempBasamak / 10;
                basamakSay++;
            }
            for(int n = inputArray[i]; n > 0;)
            {
                tempBasamakSayi = n % 10;
                n = n / 10;
                islemToplami = islemToplami + (int)Math.pow(tempBasamakSayi, basamakSay);
                if(inputArray[i] == islemToplami)
                {
                    armStrongSay++;
                    System.out.println("  dizi["+i+"] => "+islemToplami+ " ");
                }
            }
        }
        if(armStrongSay == 0)
            System.out.println("    Dizide armstrong sayı yok.");
    }
    public void palindromeSayi(int[] inputArray)
    {
        System.out.println("Palindrome Sayilar ->");
        int palindromSay = 0;
        for(int i = 0, tempBasSayi; i < inputArray.length; i++)
        {
            int basamakSay = 0, tempBasamak = inputArray[i];
            while(tempBasamak > 0)
            {
                tempBasamak = tempBasamak / 10;
                basamakSay++;
            }
            int[] sayininBasamaklar = new int[basamakSay];
            tempBasamak = inputArray[i];
            for(int x = basamakSay - 1; x >= 0; x--)
            {
                sayininBasamaklar[x] = tempBasamak % 10;
                tempBasamak = tempBasamak / 10;
            }
            boolean palindromeDurum = false;
            int baslangic = (basamakSay / 2) + 1;
            if(basamakSay % 2 == 0)
                baslangic = (basamakSay / 2);
            for(int b = baslangic; b < basamakSay; b++)
            {
                int simetrikIndex = basamakSay - b -1;
                if(sayininBasamaklar[simetrikIndex] == sayininBasamaklar[b])
                    palindromeDurum = true;
                else
                {
                    palindromeDurum = false;
                    break;
                }
            }
            if(palindromeDurum == true) {
                System.out.println("    array[" + i + "] => " + inputArray[i]);
                palindromSay++;
            }
        }
       if(palindromSay == 0)
            System.out.println("    Dizide palindrome sayı yok.");
    }
}
