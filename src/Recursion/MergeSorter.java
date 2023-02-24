package Recursion;

public class MergeSorter {
    public void merge(int[] arr,int l,int m, int r) {
        int n1 = m - l + 1; int n2 = r - m;  //sizes of two sub-arrays to be merged

        int L[] = new int[n1];//temp arrays
        int R[] = new int[n2];//temp arrays
        //Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;// Initial indexes of first and second subarrays

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {arr[k] = L[i]; i++;}
            else { arr[k] = R[j];j++;}
            k++;}
        while (i < n1) {arr[k] = L[i];i++;k++;} //Copy remaining elements of L[] if any */

        while (j < n2) {arr[k] = R[j];j++;k++;}  //Copy remaining elements of R[] if any

    }

    public void sort(int[] arr, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2; // middle sort point
            sort(arr, l, m);// sort first
            sort(arr, m + 1, r); // sort second
            merge(arr, l, m, r); // merge the sorted halves
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        MergeSorter ob = new MergeSorter();
        ob.sort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

