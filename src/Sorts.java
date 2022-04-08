import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Sorts {

    //private final Duration timeElapsed;

    public Sorts(int size) {
//        Instant start = Instant.now();  // time capture -- start
//        // build an array
//        for (int i = 0; i < size; i++) {
//            array.add((int)(Math.random() * (size+1)));
//        }
//        // use Inheritance and Polymorphism to replace data.sort with your own algorithm
//        //array.sort(Comparator.naturalOrder());
//        Instant end = Instant.now();    // time capture -- end
//        this.timeElapsed = Duration.between(start, end);
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (end > start) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            gather(arr, start, mid, end);
        }
    }

    public static void gather(int[] arr, int start, int mid, int end){
        int lengthOne = mid - start + 1;
        int lengthTwo = end - mid;

        int L[] = new int[lengthOne];
        int R[] = new int[lengthTwo];

        for (int i = 0; i < lengthOne; ++i)
            L[i] = arr[start + i];
        for (int j = 0; j < lengthTwo; ++j)
            R[j] = arr[mid + 1 + j];


        int v = 0;
        int w = 0;
        int k = start;
        while (v < lengthOne && w < lengthTwo) {
            if (L[v] <= R[w]) {
                arr[k] = L[v];
                v++;
            }
            else {
                arr[k] = R[w];
                w++;
            }
            k++;
        }

        while (v < lengthOne) {
            arr[k] = L[v];
            v++;
            k++;
        }

        while (w < lengthTwo) {
            arr[k] = R[w];
            w++;
            k++;
        }

    }

    public static void bubbleSort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int mindex = i;
            for (int j = i+1; j < len; j++) {
                mindex = j;
            }
            int temp = arr[mindex];
            arr[mindex] = arr[i];
            arr[i] = temp;
        }
    }


    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

   static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int TIMES=12, SIZE=5000;
        int[] array = new int[SIZE];
        float time =0;

        int minTime = Integer.MAX_VALUE;
        int maxTime = 0;

        Duration timeElapsed;
        //CircleQueue list = new CircleQueue();
        int[] times = new int[TIMES];

        int count =0;
        for(int i=0; i< TIMES; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[j] = ((int)(Math.random() * (SIZE+1)));
            }
            Instant start = Instant.now();
            insertionSort(array);
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
            count++;
            time += timeElapsed.getNano();
        }

        for(int i=0; i< 12; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Insertion Sort Analysis with Arrays"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));
        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );
        System.out.println( );
        time =0;
        count =0;
        array = new int[SIZE];
        for(int i=0; i< TIMES; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[j] = ((int)(Math.random() * (SIZE+1)));
            }
            Instant start = Instant.now();
            bubbleSort(array);
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
            count++;
            time += timeElapsed.getNano();
        }

        minTime = Integer.MAX_VALUE;
        maxTime = 0;
        for(int i=0; i< TIMES; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Bubble Sort Analysis"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));

        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );
        System.out.println( );
        time =0;
        count =0;
        array = new int[SIZE];
        for(int i=0; i< TIMES; i++) {
            for (int j = 0; j < SIZE; j++) {
                    array[j] = ((int)(Math.random() * (SIZE+1)));
                }
          //  System.out.println("Unsorted Array " + times[count] );
          //  printArray(array);
            Instant start = Instant.now();
            selectionSort(array);
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
         //   System.out.println("Sorted Array ");
          //  printArray(array);

          //  System.out.println("Min Seconds: " );
            count++;
            time += timeElapsed.getNano();
        }

        minTime = Integer.MAX_VALUE;
        maxTime = 0;
        for(int i=0; i< 12; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Selection Sort Analysis"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));

        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );

        System.out.println( );
        time =0;
        count =0;
        array = new int[SIZE];
        for(int i=0; i< TIMES; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[j] = ((int)(Math.random() * (SIZE+1)));
            }
            Instant start = Instant.now();
            mergeSort(array, 0, array.length - 1);
            Instant end = Instant.now();
            timeElapsed = Duration.between(start, end);
            times[count] = timeElapsed.getNano();
            count++;
            time += timeElapsed.getNano();
        }

        minTime = Integer.MAX_VALUE;
        maxTime = 0;
        for(int i=0; i< 12; i++){
            minTime = Math.min(minTime, times[i]);
            maxTime = Math.max(maxTime, times[i]);
        }
        System.out.println("Merge Sort Analysis"  );
        System.out.println("Total Nanoseconds: " + time/1000000000.0 );
        System.out.println("Avg Total Seconds: " + time /(1000000000.0*12));

        System.out.println("Min Seconds: " + minTime/1000000000.0 );
        System.out.println("Max Seconds: " + maxTime/1000000000.0 );
    }



}