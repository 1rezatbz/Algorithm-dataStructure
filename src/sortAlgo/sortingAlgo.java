package sortAlgo;
import java.util.Arrays;

public class sortingAlgo {


    public static void main(String[] args) {
        int[] data = {8,7,6,2,4};
        SelectionSort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void BubbleSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                // do the swap if required
                if (data[j] > data[j+1]) {
                    int tmp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = tmp;}
            }
        }
    }

    public static void InsertionSort(int[] data) {
        for (int i =0; i < data.length; i++) {
            int current = data[i];
            int j = i-1;
            while (j >=0 && data[j] >= current) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = current;
        }
    }

    public static void SelectionSort(int[] data) {
        for (int i=0; i < data.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < data[minIndex]) { minIndex = j;}
            }
            int tmp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = tmp;
        }

    }

}
