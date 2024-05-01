package wk14.wed;
import java.util.*;
public class MoreSearch {

    public static void main(String[] args) {
        int [] a = {12, 17, 2, -9, 4, 1, -29, 6, 17};
//        Arrays.sort(a);
        int smallest = findSmallest(a);
        System.out.println("smallest: " + smallest);
        System.out.println("index of smallest: " + linearSearch(a, smallest));

        int smallestIndex = findSmallestIndex(a);

        System.out.println("index of smallest: " + a);
        System.out.println("smallest: " + a[smallestIndex]);
    }

    public static int binarySearch(int [] data, int value) {
        int low = 0;
        int high = data.length - 1;
        while(low <= high) {
            // if we have remaining search space
            int middle = (low+high)/2;
            if(data[middle] == value) {
                return middle;
            } else if(data[middle] > value) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }

        }
        return -1;
    }

    public static int linearSearch(int [] data, int value) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findSmallest(int [] data) {
        if(data.length == 0) {
            return -1;
        }
        int smallest = data[0];
        for(int i = 0; i < data.length; i++) {
            if(data[i] < smallest) {
                smallest = data[i];
//                return smallest;
            }
        }
        return smallest;
    }

    public static int findSmallestIndex(int [] data) {
        if(data.length == 0) {
            return -1;
        }
        int smallestIndex = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i] < data[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
