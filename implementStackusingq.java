import java.util.*;

class implementStackusingq{
    public static void main(String args[]){
         Queue<Integer> q = new LinkedList<>();
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          while(n-->0){
              q.add(sc.nextInt());
              int a  = q.size()-1;
              while(a-->0){
                 q.add(q.peek());
                 q.poll();
              }
          }

       
         while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
         }
    }
}