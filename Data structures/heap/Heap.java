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

public void heapify(int[] arr , int n , int i){
    int largest = i;
    int left = 2*i;
    int right = 2*i + 1;

    if(left < n && arr[largest] < arr[left]){
        largest = left;
    }

    if(right < n && arr[largest] < arr[right]){
        largest = right;
    }

    if(largest != i){
        arr[largest] = arr[largest] + arr[i];
                arr[i] = arr[largest] - arr[i];
                arr[largest] = arr[largest] - arr[i];

                heapify(arr, n, largest);
    }



}
 

    public void print() {
        for (int k=1 ; k<=size ;k++) {
            System.out.println(arr[k] + " ->");
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
       
    int[] arr = {-1 , 54 , 53, 55 ,52 ,50};
       int size = 5;
        for(int i= size/2 ; i> 0 ;i--) {
            h.heapify(arr, arr.length, i);
        }

        for(int j=1 ; j<arr.length;j++){
            System.out.println(arr[j]);
        }
       

    }

}
