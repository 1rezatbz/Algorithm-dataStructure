package sortAlgo;

import java.util.Arrays;

public class quickSorter {
        public  static void main(String[] args) {
            int[] data = {8,7,6,2,4};
            new quickSorter().QuickSort(data, 0,data.length-1);
            System.out.println(Arrays.toString(data));
        }


        public void QuickSort(int[] data, int start, int end){
            if (start < end) {
                int pivotIndex = partition(data, start, end);
                QuickSort(data, start, pivotIndex - 1);
                QuickSort(data, pivotIndex + 1, end);
            }
        }

    private int partition(int[] data, int start, int end) {
        int pivot = data[end];
        int i = start;
        for (int j = start; j <= end - 1; j++) {
            if (data[j] < pivot) {
                int tmp = data[j];
                data[j] = data[i];
                data[i] = tmp;
                i++;
            }
        }
        data[end] = data[i];
        data[i] = pivot;
        return i;
    }

}
