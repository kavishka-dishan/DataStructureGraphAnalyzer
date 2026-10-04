package searching;

import java.util.Arrays;

public class SearchAlgorithms {

    private int linearSteps;
    private int binarySteps;

    // Linear Search
    public int linearSearch(int[] array, int target) {

        linearSteps = 0;

        for (int i = 0; i < array.length; i++) {

            linearSteps++;

            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    public int binarySearch(int[] array, int target) {

        binarySteps = 0;

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            binarySteps++;

            int middle = (low + high) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (array[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }

    // Create sorted copy for Binary Search
    public int[] getSortedArray(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);

        return sortedArray;
    }

    public int getLinearSteps() {
        return linearSteps;
    }

    public int getBinarySteps() {
        return binarySteps;
    }
}