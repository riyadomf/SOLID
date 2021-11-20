package Good;

abstract class SortAlgo{
    int arr[];

    void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }   

    abstract void sort();
}

class BubbleSort extends SortAlgo{
    @Override
    void sort(){
        System.out.println("Doing bubble sort");
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]) swap(i, j);
            }
        }
    }
}

class InsertionSort extends SortAlgo{
    @Override
    void sort(){
        System.out.println("Doing insertion sort");
        //insertion sort logic
    }
}

class QuickSort extends SortAlgo{
    @Override
    void sort(){
        System.out.println("Doing quick sort");
        //quick sort logic
    }
}


class SortManager{
    SortAlgo algo;

    SortManager(int[] arr, SortAlgo algo){
        this.algo = algo;
        this.algo.arr = arr;
    }
    SortManager(int[] arr){
        this(arr, new BubbleSort());
    }
    void sort(){
        algo.sort();
    }
}

class Open_closed{
    public static void main(String[] args){
        int[] arr = {4, -2, 5, 3, 10};
        
        SortManager sortManager1 = new SortManager(arr);
        sortManager1.sort();

        SortManager sortManager2 = new SortManager(arr, new InsertionSort());
        sortManager2.sort();
        
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
