package exercises.hackerrank;

import exercises.ctci.ch1.PalindromePermutations;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSwaps2 {
static class Pair {
    int data, index;

    Pair(int d, int i) {
        this.data = d;
        this.index = i;
    }
}

static int minimumSwaps2(int[] arr) {
    int i,j;
    int answer = 0;
    ArrayList<Pair> pairArray = new ArrayList();

    for(i = 0; i < arr.length; i++) {
        pairArray.add(new Pair(arr[i], i));
    }

    pairArray.sort((o1, o2) -> {
        if(o1.data < o2.data) {
            return  -1;
        } else if (o1.data == o2.data) {
            return 0;
        } else {
            return 1;
        }
    });

    Boolean[] visited = new Boolean[arr.length];
    Arrays.fill(visited, false);
    for(i = 0; i < arr.length; i++) {
        if(visited[i] || pairArray.get(i).index == i) {
            continue;
        }
        j = i;
        int cycles = 0;
        while(!visited[j]) {
            visited[j] = true;

            j = pairArray.get(j).index;
            cycles++;
        }
        answer += (cycles - 1);
    }
    return answer;
}

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
