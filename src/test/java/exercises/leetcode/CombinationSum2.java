package exercises.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//LC #40
public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList();
        List<Integer> chosen = new LinkedList();
        combination(candidates, target, 0, result, chosen);
        // System.out.println(result.toString());
        return result;
    }

    private void combination(int[] candidates, int target, int start,  List<List<Integer>> result, List<Integer> chosen) {
        System.out.println(String.format("start %d, chosen %s", start, chosen.toString()) );
        if (target == 0)  {
            List<Integer> copy = new LinkedList(chosen);
            Collections.sort(copy);
            // System.out.println(copy.toString());
            if (!result.contains(copy)){
                result.add(copy);

            }
            return;
        }
        if  (target < 0) {
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            // System.out.println("chosen before adding " + chosen.toString());
            chosen.add(candidates[i]);
            // System.out.println("chosen after adding " + chosen.toString());
            combination(candidates, target - candidates[i], i + 1, result, chosen);
            chosen.remove(chosen.size() - 1);
            // System.out.println("chosen after removing " + chosen.toString());
        }
    }
}
