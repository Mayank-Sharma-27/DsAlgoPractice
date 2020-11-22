package questions.slices;

public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        int n = A.length;
        if(n <3){
            return 0;
        }
        if(n==3){
            if(A[1]- A[0] == A[2]- A[1]){
                return 1;
            }
            return 0;
        }

        int[] t = new int[n];


        for(int i =0 ; i< n; i++){
            t[i] = 0;
        }

        int count =0;
        boolean isEqual = false;
        for(int i =2; i<n ; i++){
            if (A[i]-A[i-1]==A[i-1]-A[i-2]){
                t[i]= t[i-1]+1;

            }
            count = count + t[i];

        }
        return count;

    }

}
