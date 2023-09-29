package edu.uoc.ds.adt;

public class PR0GeometricProgressionArray {
    public int SIZE;
    public int A1;
    public int R;
    public double[] pr0Array;

    public PR0GeometricProgressionArray(int A1, int R, int SIZE) {
        this.A1 = A1;
        this.R = R;
        this.SIZE = SIZE;
        pr0Array = new double[SIZE];
        initializeGPArray();
    }

    private void initializeGPArray() {
        for (int i = 0; i < SIZE; i++) {
            pr0Array[i] = A1 * Math.pow(R, i);
        }
    }

    public double[] getGPArray() {
        return pr0Array;
    }

    public int getIndexOf(int element) {
        for (int i = 0; i < SIZE; i++) {
            if (pr0Array[i] == element) {
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
            if (pr0Array[mid] == element) {
                return mid;
            } else if (pr0Array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PR0GeometricProgressionArray pr0GeometricProgressionArray = new PR0GeometricProgressionArray(2,2,20);
        for (double num : pr0GeometricProgressionArray.getGPArray()) {
            System.out.print(num + " ");
        }
    }
}
