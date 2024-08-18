public class LinkedList {

    NodeList head;
    NodeList temp;

    LinkedList(){
        this.head=null;
        System.out.println("List oluşturuldu..");
    }

    void add(NodeList p){
        if(head==null){
            head=p;
            System.out.println("Liste başına düğüm eklendi..");
        }
        else{
            temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=p;
            System.out.println("Listeye düğüm eklendi");
        }
    }

    void add(NodeList p,int indis){
        if(indis==0){
            p.next=head;
            head=p;
        }
        else{
            temp=head;

            for(int i=0;i<indis-1;i++)
                temp=temp.next;
            p.next=temp.next;
            temp.next=p;
        }

        System.out.println(indis+". indexe düğüm eklendi..");
    }

    void addHead(NodeList p){
        p.next=head;
        head=p;
        System.out.println("Liste başına düğüm eklendi..");
    }

    void remove(){
        temp=head;

        while(temp.next.next!=null)
            temp=temp.next;
        temp.next=null;

        System.out.println("Düğüm silindi..");
    }

    void remove(int indis){
        if(indis==0){
            head=head.next;
        }
        else{
            temp=head;

            for(int i=0;i<indis-1;i++)
                temp=temp.next;

            temp.next=temp.next.next;
        }

        System.out.println(indis+". index silindi..");
    }

    void print(){
        temp=head;

        System.out.print("List:");
        while(temp!=null){
            System.out.print(temp.key+" ");
            temp=temp.next;
        }

        System.out.println();
    }
}
