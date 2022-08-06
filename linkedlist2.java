import java.util.*;

public class linkedlist2 {
    Node head; 

    class Node{
         int data;
         Node next;

         Node(int data){
           this.data=data;
           this.next=null;
        }

    }
   

    public void addFrist(int data){
          Node newNode = new Node(data);
          if(head==null){
             head = newNode;
             return ;
          }
          newNode.next= head;
          head= newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
          if(head==null){
             head = newNode;
             return ;
          }
          Node currNode = head;
          while(currNode.next!=null){
             currNode=currNode.next;
          }
          currNode.next=newNode;
    }
    
    public void printList(){
         if(head==null){
            System.out.println("list is empty");
            return;
         }
         Node currNode = head;
         while(currNode!=null){
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
         }
         System.out.println();
    }
    public void deleteAt(int n){
         Node currNode = head;
         while(n-->1){
            currNode=currNode.next;
         }
         Node newNode = currNode.next;
              currNode.next=newNode.next;
          
    }

    public void removeDuplicate(){
       HashMap<Integer,Integer> map  = new HashMap<>();
      Node cur = null;
      Node temp;
      Node res=null;
      while(head!=null){
          if(!map.containsKey(head.data)){
              map.put(head.data,1);
              temp = new Node(head.data);
              if(res==null) res = temp;
              else cur.next=temp;
              cur=temp;
          }
          head=head.next;
      } 
       head = res;

    }

    public static void main(String args[]){
         linkedlist2 list = new linkedlist2();
         list.addLast(0);
         list.addLast(1);
         list.addLast(3);
         list.addLast(4);
         list.addLast(1);
         list.addLast(1);
         list.addLast(2);
         list.removeDuplicate();
         list.printList();
    }
}
