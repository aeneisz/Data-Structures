import java.util.ArrayList;

public class ListClass {
    ArrayList <Integer> sayilar=new ArrayList<>();

        void add(int k){
        sayilar.add(k);
        }

        void sayiTekrarSayisi(int k){
            int sayac=0;

            for(int i=0;i<sayilar.size();i++){
                if(sayilar.get(i)==k)
                    sayac++;
            }
            System.out.println(k+" sayisi "+sayac+" kez tekrar etmiştir..");
        }
        void tekrarSayisiYaz(){
            for(int i=0;i<20;i++){
                int say=0;
                for(int j=0;j<sayilar.size();j++){
                    if(sayilar.get(j)==i)
                        say++;
                }
                System.out.println(i+": "+say);
            }
        }

        void print(){
            System.out.println(sayilar);
        }


}
