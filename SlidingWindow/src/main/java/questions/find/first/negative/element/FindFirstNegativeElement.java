package questions.find.first.negative.element;

import java.util.*;

//problem link : https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k/0#
public class FindFirstNegativeElement {
    public static void main (String[] args) {
        {
            // TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- >0){
                int n = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                int k = sc.nextInt();
                int i =0;
                int j =0;
                List<Integer> list = new ArrayList<>();
                Queue<Integer> q = new LinkedList<>();
                while(j < n){
                    if(arr[j] < 0){
                        q.add(arr[j]);
                    }
                    if(j-i+1 < k){
                        j++;
                    }
                    else if(j-i+1==k){
                        if(q.isEmpty()){
                            list.add(0);
                        }
                        else{
                            list.add(q.peek());
                        }
                        if(arr[i]<0){
                            q.poll();
                        }
                        i++;
                        j++;

                    }
                }
                for(int m : list){
                    System.out.print(m+ " ");
                }
                System.out.println();

            }
        }
    }
}
