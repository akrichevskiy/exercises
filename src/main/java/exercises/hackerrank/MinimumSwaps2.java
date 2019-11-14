package exercises.hackerrank;

public class MinimumSwaps2 {

static int minimumSwaps(int[] arr) {
    int swaps = 0;
    for(int i = 0; i< arr.length; i++) {
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for(int j = 0; j < arr.length - i; j++) {
            if(arr[j] > max) {
                max = arr[j];
                maxIdx = j;
            }
        }
        int currentPos = arr.length -1 -i;
        if (maxIdx != currentPos) {
            swaps++;
            int tmp = arr[maxIdx];
            arr[maxIdx] = arr[currentPos];
            arr[currentPos] = tmp;
        }
    }
    return swaps;
}
}
