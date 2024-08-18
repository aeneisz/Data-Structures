public class BST {

    NodeBst root,temp;
    int sayac=0;

    BST(){
        this.root=null;
        System.out.println("BST oluşturuldu..");
    }

    void add(NodeBst n){
        if(root==null){
            root=n;
            sayac++;
        }
        else{
            sayac++;
            temp=root;
            boolean kontrol=true;

            while(kontrol){
                if(temp.key<=n.key){
                    if(temp.right==null){
                        temp.right=n;
                        kontrol=false;
                    }
                    else
                        temp=temp.right;
                }
                else{
                    if(temp.left==null){
                        temp.left=n;
                        kontrol=false;
                    }
                    else
                        temp=temp.left;
                }
            }
        }
    }

    void print(NodeBst n){
        if(n!=null){
            System.out.println(n.key);
            print(n.left);
            print(n.right);
        }
    }
}
