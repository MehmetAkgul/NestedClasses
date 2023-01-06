package finalSorulari.nestedClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("İsminizi Giriniz");

        String userName = myObj.nextLine();

        Astrolog.analiz(userName);

    }

    static class Astrolog {

        static void analiz(String userName) {
            Map<Character, Double> lettersMap = new HashMap<>();


            double vowel = 20;
            double consonant = 10;
            double tr = 9;
            double en = 7;

            for (int i = 0; i < userName.length(); i++) {
                double letter = 0;
                char ch = userName.charAt(i);


                if (lettersMap.containsKey(ch))
                    letter = lettersMap.get(ch);


                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o')
                    letter += vowel;
                else
                    letter += consonant;

                if (ch == 'ğ' || ch == 'ü' || ch == 'ı' || ch == 'ç')
                    letter += letter * tr / 100;


                if (ch == 'q' || ch == 'w')
                    letter -= letter * en / 100;

                lettersMap.put(ch, letter);


            }
            System.out.println(lettersMap);
            double total = 0;
            for (Double v : lettersMap.values())
                total += v;
            System.out.println("Toplam deger : " + total);
        }


    }

}
