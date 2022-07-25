class LL{
    Node head;
    class Node{
         String data;
         Node next;

         Node (String data){
            this.data=data;
            this.next=null;
         }
    }
     // add first 
    public void addFrist(String data){
        Node newNode = new Node(data);
      
        if(head == null){
              head=newNode;
              return ;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last 

    public void addLast(String data){
         Node newNode = new Node(data);

         if(head==null){
             head = newNode;
             return;
         }

         Node currNode = head;
         while(currNode.next!=null){
              currNode = currNode.next;
         }
        currNode.next=newNode;
    }

    // print

     public void Print(){
        if(head == null){
             System.out.print("list is empty");
             return;
        }

         Node currNode = head;
         while(currNode!=null){
              System.out.print(currNode.data+" --> ");
              currNode = currNode.next;
         }
         System.out.println("Next");
    }

    // delete first 

     public void deleteFirst(){
         if(head == null){
             System.out.println("nothing to delete");
             return;
         }
         
         head = head.next;

     }

     // delete last

     public void deleteLast(){
         if(head == null){
             System.out.println("nothing to delete");
             return;
         }
         
         if(head.next == null){
             head=null;
         }

         Node secondLast = head;
         Node last = head.next;
         while(last.next != null){
             last = last.next;
             secondLast = secondLast.next;
         }
         secondLast.next=null;
     }
     public static void main(String args[]){
         LL list = new LL();
         list.addFrist("a");
         list.addFrist("is");
         list.addFrist("avi");
         list.Print();
         list.addLast("lion");
         list.Print();
         list.deleteLast();
         list.Print();
         list.deleteFirst();
         list.Print();
     }
}