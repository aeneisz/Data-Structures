public class Hash {

    int[] tablo;
    int boyut;

    Hash(int k){
        this.boyut=k;
        tablo=new int[boyut];

        for(int i=0;i<tablo.length;i++)
            tablo[i]=-1;
    }


    void add(int n){
        int indis=n%boyut;

        if(tablo[indis]==-1)
            tablo[indis]=n;
        else{
            while(tablo[++indis]!=-1){
                if(indis==boyut-1)
                    indis=-1;
            }
            tablo[indis]=n;
        }
    }

    
    boolean sayiVarMi(int k){
        int indis=k%boyut;
        int indis2=indis;

        if(tablo[indis]==k)
            return true;
        else{
            while(tablo[++indis]!=k){
                if(indis==boyut-1)
                    indis=-1;
                if(indis==indis2)
                    break;
            }
            if(tablo[indis]==k)
                return true;
        }
        return false;
    }

    void yazdir(){
        System.out.print("Hash:");
        for(int i=0;i<tablo.length;i++)
            System.out.print(tablo[i]+" ");
    }


}
