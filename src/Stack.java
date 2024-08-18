public class Stack {

    int[] dizi;
    int boyut;
    int top=-1;

    Stack(int boyut){
        this.boyut=boyut;
        dizi=new int[boyut];
        System.out.println("Stack oluşturuldu..");
    }

    void push(int sayi){
        if(top==boyut-1)
            System.out.println("Liste dolu eleman yüklenemez..");
        else{
            dizi[++top]=sayi;
        }
    }

    void pop(){
        if(top==-1)
            System.out.println("Liste boş eleman silinemez..");
        else
            top--;
    }

    void print(){
        for(int i=top;i>=0;i--)
            System.out.println(dizi[i]);
    }
}
