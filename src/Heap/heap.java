package Heap;
import java.util.Arrays;


public class heap {
    private Integer[] heapData;

    private int currentPosition = -1;

    public heap(int size){this.heapData = new Integer[size];}

    public void insert(int item){
        if(isFull()){throw new RuntimeException("Heap is full");}
        this.heapData[++currentPosition]=item;
        fixUp(currentPosition);
    }
    public int deleteRoot(){
        int result = heapData[0];
        heapData[0] = heapData[currentPosition--];
        heapData[currentPosition+1]=null;
        fixDown(0, -1);
        return  result;}

    private void fixDown(int index, int upto) {
        if (upto < 0) upto = currentPosition;
        while (index <= upto) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            if (leftChild <= upto) {
                int childToSwap;
                if (rightChild > upto)
                    childToSwap = leftChild;
                else
                    childToSwap = (heapData[leftChild] > heapData[rightChild]) ? leftChild : rightChild;

                if (heapData[index] < heapData[childToSwap]) {
                    int tmp = heapData[index];
                    heapData[index] = heapData[childToSwap];
                    heapData[childToSwap] = tmp;
                } else {
                    break;
                }
                index = childToSwap;
            } else {
                break;
            }

        }
    }

    private void fixUp(int index){
        int i = (index-1)/2;
        while (i>=0 && heapData[i]<heapData[index]){
            int tmp = heapData[i];
            heapData[i]= heapData[index];
            heapData[index] = tmp;
            index =i;
            i= (index-1)/2;
        }
    }

    private boolean isFull(){return currentPosition==heapData.length-1;}
    // Heap Sort could be called in a heap array, and then we call heapSort on it
    public void heapSort(){
        for(int i=0; i<currentPosition;i++){
            int tmp = heapData[0]; // max element
            heapData[0] = heapData[currentPosition-i]; // bring last element to the root
            heapData[currentPosition-i]= tmp; // put max at the last of unsorted part
            fixDown(0, currentPosition-i-1);
        }
    }

    @Override
    public String toString(){return Arrays.deepToString(this.heapData);}

    public static heap heapify(int[] data){
        heap h = new heap(data.length);
        for(int i =0; i< data.length;i++){h.insert(data[i]);};
        return h;}

    public static void main(String[] args) {
        heap h = new heap(10);
        h.insert(10);
        h.insert(15);
        h.insert(27);
        h.insert(5);
        h.insert(2);
        h.insert(21);
        h.insert(10);
        h.insert(90);
//        int a = h.deleteRoot();
//        int b = h.deleteRoot();
        h.heapSort();
        System.out.println(h);
        heap another = heap.heapify(new int[]{73,16,40,1,46,28,12,21,22,44,66,90,7});
        another.heapSort();
        System.out.println(another);

    }

}
