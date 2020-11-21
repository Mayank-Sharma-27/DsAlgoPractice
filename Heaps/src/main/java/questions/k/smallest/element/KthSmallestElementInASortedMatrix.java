package questions.k.smallest.element;

import java.util.Collections;
import java.util.PriorityQueue;

// problem link : https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
public class KthSmallestElementInASortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int columns = matrix[0].length;
        int rows = matrix.length;
        for(int i = 0; i < rows; i++){
            for(int j =0; j<columns; j++){

                int element = matrix[i][j];
                maxHeap.offer(element);

                if(maxHeap.size() > k){

                    maxHeap.poll();
                }
            }
        }


        return maxHeap.poll();
    }

}
