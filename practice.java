class practice{
    static Node head;

    public static void add(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static void printlist(){
         Node cur=head;
         while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
         }
    }

    public static void main(String args[]){
        practice LL = new practice();
         LL.add(1);
         LL.add(2);
         LL.printlist();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}