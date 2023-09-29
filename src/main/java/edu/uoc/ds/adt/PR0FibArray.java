package edu.uoc.ds.adt;

public class PR0FibArray {
    private static final int SIZE = 20;
    private int[] fibArray;

    public PR0FibArray() {
        fibArray = new int[SIZE];
        initializeFibArray();
    }

    private void initializeFibArray() {
        if (SIZE > 0) {
            fibArray[0] = 0;
        }

        if (SIZE > 1) {
            fibArray[1] = 1;
        }

        for (int i = 2; i < SIZE; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
    }

    public int[] getFibArray() {
        return fibArray;
    }

    //method to search for an element in the array based on index
    public int getIndexOf(int element) {
        for (int i = 0; i < SIZE; i++) {
            if (fibArray[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int element) {
        int low = 0;
        int high = SIZE - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (fibArray[mid] == element) {
                return mid;
            } else if (fibArray[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PR0FibArray pr0FibArray = new PR0FibArray();
        for (int num : pr0FibArray.getFibArray()) {
            System.out.print(num + " ");
        }
    }
}

