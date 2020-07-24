package exercises.codility;

import java.util.LinkedList;

public class Perms {
  public void generate(int n) {
      gen(new LinkedList<>(), n);
  }

  private void gen(LinkedList<Integer> buffer, int n) {
    if (buffer.size() == n) {
      System.out.println(buffer.toString());
      return;
    }

    for(int k = 0; k < n; k++) {
        if(!buffer.contains(k)){
            buffer.add(k);
            gen(buffer, n);
            buffer.removeLast();
        }
    }
  }
}
