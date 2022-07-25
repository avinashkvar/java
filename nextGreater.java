// next greater element.

import java.util.*;

public class nextGreater {
     public static void main(String args[]){
          Scanner sc = new Scanner(System.in);

          int n = sc.nextInt();
          int[] arr = new int[n];

          for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
          }
          nextGreaterElement(n,arr);
     }
     public static void nextGreaterElement(int n,int[] arr){
         Stack<Integer> s = new Stack<>();
         
         int[] ans = new int[n];
         for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){ // if stack is not empty and if stack first element <= arr[i] then keep on poping the element from the stack.
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;    // if there is no greater element then print -1;
            }else if (s.peek()>arr[i]){
                ans[i]=s.peek();  // if it is greater the print and element;
            }
            s.push(arr[i]);
         }
         System.out.println(Arrays.toString(ans)); // display the ans 
     }
}
