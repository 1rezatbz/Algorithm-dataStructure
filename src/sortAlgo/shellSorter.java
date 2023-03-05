package sortAlgo;

import java.util.Arrays;

public class shellSorter {

    public static void main(String[] args){
//        Integer[] data={13,5,8,3,2,1,4,7,10,11,9,6,12,0};
//        new shellSorter().sort(data);
//        System.out.println(Arrays.deepToString(data));
        System.out.println(maxKnuthSeqNumber(1000));

    }

    public void sort(Integer[] data) {
        if (data == null || data.length == 0) {return;}
        int knuthNum = maxKnuthSeqNumber(data.length);
        while (knuthNum >= 1) {
            for (int i = 0; i < knuthNum; i++) {
                // insertion is used to sort  each pass
                insertionSortWithGap(data, i, knuthNum);
            }
            knuthNum = (knuthNum - 1) / 3; //decrease the gap
        }
    }

    public void insertionSortWithGap(Integer[] data, int startIndex, int gap) {
        int i = startIndex;
        while (i < data.length) {
            int current = data[i];
            int j = i - gap;
            while (j >= 0 && data[j] >= current) {
                data[j + gap] = data[j];
                j = j - gap;
            }
            data[j + gap] = current;
            i = i + gap;
        }
    }

    public static    int maxKnuthSeqNumber(int size){
        int h =1;
        while (h < size / 3) { h = 3 * h + 1; }
        return h;}

}
