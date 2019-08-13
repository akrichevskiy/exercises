package exercises.cs106x;

import java.util.*;

public class RecursionCh8 {

    //inclusion/exclusion pattern
    public boolean subsetSumExists(Set<Integer> set, int target) {
        System.out.println("set " + set + ", target " + target);
        if (set.isEmpty()) {
            return target == 0;
        } else {
            Integer el = set.iterator().next();

            Set<Integer> clone = new HashSet<>(set);
            clone.remove(el);

            return (subsetSumExists(clone, target) || subsetSumExists(clone, target - el));
        }
    }

    public void listAllSubsets(String s) {
        listSubsets("", s);
    }

    public void listSubsets(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
        } else {
            listSubsets(prefix + remaining.charAt(0), remaining.substring(1));
            listSubsets(prefix, remaining.substring(1));
        }
    }

    public void listSubsets3(String prefix, String remaining) {
        if (remaining.isEmpty())
            return;
        for (int i = 0; i < remaining.length(); i++) {
            listSubsets(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }

    public int countMoveHanoiTowers(int n) {
        if (n <= 1) {
            return n;
        } else {
            return 1 + (2 * countMoveHanoiTowers(n - 1));
        }
    }

    public void moveTower(int n, char start, char end, char tmp) {
        if (n == 0) {
            return;
        } else {
            moveTower(n - 1, start, tmp, end);
            moveDisk(start, end);
            moveTower(n - 1, tmp, end, start);

        }
    }

    public void moveTower2(int n, char start, char end, char tmp) {
        if (n == 1) {
            moveDisk(start, end);
            return;
        } else {
            moveTower(n - 1, start, tmp, end);
            moveDisk(start, end);
            moveTower(n - 1, tmp, end, start);

        }
    }

    public void moveTowerIterative(int n, char start, char end, char tmp) {
        class MoveTask {
            public MoveTask(int n, char start, char end, char tmp) {
                this.n = n;
                this.start = start;
                this.end = end;
                this.tmp = tmp;
            }

            private int n;
            private char start;
            private char end;
            private char tmp;

        }
        Stack<MoveTask> stack = new Stack<>();
        stack.push(new MoveTask(n, start, end, tmp));
        while (!stack.empty()) {
            MoveTask task = stack.pop();
            if (task.n == 1) {
                moveDisk(task.start, task.end);
            } else {
                //move back n -1
                stack.push(new MoveTask(task.n - 1, task.tmp, task.end, task.start));

                // move 1
                stack.push(new MoveTask(1, task.start, task.end, task.tmp));

                // move n - 1 to tmp
                stack.push(new MoveTask(task.n - 1, task.start, task.tmp, task.end));
            }
        }
    }

    private void moveDisk(char start, char finish) {
        System.out.println(start + " -> " + finish);
    }

    public int countSubsetSumWays(Set<Integer> s, int target) {
        if (s.isEmpty()) {
            if (target == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            Set<Integer> copy = new HashSet<>(s);
            Integer element = copy.iterator().next();
            copy.remove(element);
            int sumWith = countSubsetSumWays(copy, target);
            int sumWithout = countSubsetSumWays(copy, target - element);
            return sumWith + sumWithout;
        }
    }

    public boolean isMeasurable(int target, List<Integer> weights) {
        if (weights.isEmpty()) {
            return target == 0;
        } else {
            int element = weights.get(0);
            List<Integer> copy = new LinkedList<>(weights);
            copy.remove(0);
            return isMeasurable(target + element, copy)
                    || isMeasurable(target - element, copy);
        }
    }

}
