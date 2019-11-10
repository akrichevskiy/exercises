package exercises.ctci;

import java.util.LinkedList;

public class StringBuilder {
  private LinkedList<String> list;

  public StringBuilder() {
    this.list = new LinkedList<>();
  }

  public StringBuilder append(String s) {
    list.add(s);
    return this;
  }

  public String toString() {
    String result = "";

    for(String s : list) {
      result += s;
    }
    return  result;
  }
}
