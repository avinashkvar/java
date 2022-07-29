import java.util.*;

public class stack{
    static class MyStack{
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static  boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int peek(){
            if(list.size()==0){
                return -1;
            } else {
                int x = list.get(list.size()-1);
                return x;
            }
        }
        public static void pop(){
            if(list.size()!=0){
                list.remove(list.size()-1);
            } 
        }
    }


    public static void main(String args[]){
        
        }
}

