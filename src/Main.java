import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ListClass liste=new ListClass();
        Random rand=new Random();

        for(int i=0;i<100;i++)
            liste.add(1+rand.nextInt(20));

        liste.print();

        liste.sayiTekrarSayisi(10);
        liste.tekrarSayisiYaz();
    }
}