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
   public void addOne(){
         head = reverseList();
         Node cur=head;
         while(cur!=null){
            if(cur.data==9 && cur.next==null){
                Node temp = new Node(0);
                cur.data=1;
                temp.next=head;
                head=temp;
                cur=cur.next;
            }
            else if(cur.data==9){
                cur.data=0;
                cur=cur.next;
            }else{
                cur.data=cur.data+1;
                break;
            }
         }    
         head = reverseList();
   }
   public Node reverseList(){
       Node left = null;
       Node cur = head;
       Node right = null;
       while(cur!=null){
            right=cur.next;
            cur.next=left;
            left=cur;
            cur=right;
       }
       head=left;
       return head;
   }

    public static void main(String args[]){
         linkedlist2 list = new linkedlist2();
         list.addLast(9);
         list.addLast(9);
         list.addLast(9);
         list.addLast(9);
         list.addLast(9);
         list.addLast(9);
         list.addLast(9);
         list.printList();
         list.reverseList();
         list.printList();
         list.addOne();
         list.printList();
    }
}
