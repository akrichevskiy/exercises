package exercises.ctci.ch1;

public class ArrayList {
  private int[] storage;

  private int count;

  public ArrayList() {
    this.count = 0;
    this.storage = new int[4];
  }

  public int get(int index) {
    return storage[index];
  }

  public void add(int element) {
    if (count == storage.length) {
      int[] newStorage = new int[2 * storage.length];
      System.arraycopy(storage, 0, newStorage, 0, count);
      storage = newStorage;
    }
    storage[count++] = element;
  }
}
