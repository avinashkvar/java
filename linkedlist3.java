import java.util.*;

class linkedlist3{
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

        public void addFirst(int data){
             Node newNode = new Node(data);

             if(head==null){
                 head= newNode;
                 return;
             }
             newNode.next=head;
             head=newNode;
        }
        public void addLast(int data){
            Node newNode = new Node(data);

            if(head==null){
                head=newNode;
                return;
            }
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        public void addAt(int data,int pos){
             Node newNode = new Node(data);
             if(pos==0 && head!=null){
                newNode.next=head;
                head=newNode;
                return;
             }
             Node curr = head;
             while(pos-->1){
                curr=curr.next;
             }
             Node adding = curr.next;
               curr.next=newNode;
               newNode.next=adding;
        }
        public void deleteAt(int pos){
            if(pos==1){
                Node first = head.next;
                 head.next=null;
                 head=first;
                 return;
            }
             Node curr = head;
            Node prev = null;
            while(pos-->1){
                prev = curr;
                curr=curr.next;
            }
            prev.next=curr.next;
            curr.next=null;
        }
        public void reverseList(){
            Node left = null;
            Node curr = head;
            Node right = null;
            while(curr!=null){
                right = curr.next;
                curr.next=left;
                left = curr;
                curr = right;
            }
            head=left;
        }
        public void printList(){
             if(head==null){
                System.out.println("empty list");
                return;
             }
             Node curr = head;
             while(curr!=null){
                 System.out.print(curr.data+" ");
                 curr=curr.next;
             }
        }
     public static void main(String args[]){
          linkedlist3 list = new linkedlist3();
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          while(n-->0){
             list.addLast(sc.nextInt());
          }
          list.reverseList();
          list.printList();
     }
}