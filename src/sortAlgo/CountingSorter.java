package sortAlgo;
import java.util.Arrays;
public class CountingSorter {
    public void sort(Integer []data){
        int [] temp = new int[11];
        for(int i =0; i< data.length;i++){
            temp[data[i]] = temp[data[i]] +1;
        }
        int current =0;
        for (int i=0;i<temp.length;i++ ){
            for (int j=0; j<temp[i];j++){
                data[current] =i;
                current++;

            }
        }

    }



    public static void main(String[] args){
        CountingSorter sorter = new CountingSorter();
        Integer[] data = new Integer [] {3, 10, 2, 4, 2, 6, 9, 5, 7, 2, 8, 10, 3,9};
        sorter.sort(data);
        System.out.println(Arrays.deepToString(data));

    }
}
