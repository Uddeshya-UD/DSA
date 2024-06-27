package heap;

public class Heap {

    private int arr[];
    private int size;

    Heap() {
        arr = new int[100];
        arr[0] = -1;
        size = 0;
    }

    public void insert(int val) {
        size = size + 1;
        int index = size;
        arr[index] = val;
        while (index > 1) {

            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                arr[parent] = arr[parent] + arr[index];
                arr[index] = arr[parent] - arr[index];
                arr[parent] = arr[parent] - arr[index];

                index = parent;
            } else {
                break;
            }

        }
    }

    public void delete(){

        if(size == 0 ){
            System.out.println("Not element to delete");
        }
        arr[1] = arr[size];
        size = size - 1 ;

        int i = 1;

        while(i <= size/2){
            int leftIndex = 2*i;
            int rightIndex = 2*i+1;
            int largerIndex = leftIndex;

            if(rightIndex <= size && arr[rightIndex] > arr[leftIndex]){
                largerIndex = rightIndex;
            } 

            if(arr[i] >= arr[largerIndex]){
                break;
            }

            int temp = arr[i];
            arr[i] = arr[largerIndex];
            arr[largerIndex] = temp;

            i = largerIndex;


        
    }
}


    public void print() {
        for (int k=1 ; k<=size ;k++) {
            System.out.println(arr[k] + " ->");
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.insert(5);
        h.insert(3);
        h.insert(8);
        h.insert(6);
        h.insert(2);
        
        h.delete();
        h.print();

    }

}
