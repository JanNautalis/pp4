package homework1;

import java.io.*;

public class Dopisywanie{

   public static void main(String[] args) {
      String fileName = "nazwa_pliku.txt";
      String textToAdd = "To jest nowa linijka tekstu.";
      
      dopisz(fileName, textToAdd);
   }

   public static void dopisz(String fileName, String textToAdd) {
      try {
         FileWriter writer = new FileWriter(fileName, true);
         writer.write("\n" + textToAdd);
         writer.close();
         System.out.println("Tekst został dodany do pliku.");
      } catch (IOException e) {
         System.out.println("Wystąpił błąd podczas dodawania tekstu do pliku.");
         e.printStackTrace();
      }
   }
}
