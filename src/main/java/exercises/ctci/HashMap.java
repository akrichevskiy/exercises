package exercises.ctci;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {

  private static class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }
  }

  private java.util.ArrayList<LinkedList<Entry<K, V>>> data;

  public HashMap() {
    this.data = new ArrayList<>(10);
    for (int i = 0; i < 10; i++) {
      data.add(new LinkedList<>());
    }
  }

  public void put(K key, V value) {
    int hashCode = key.hashCode() % 10;
    LinkedList chain = data.get(hashCode);
    chain.add(new HashMap.Entry(key, value));
  }

  public V get(K key) {
    int hashCode = key.hashCode() % 10;
    LinkedList<Entry<K, V>> chain = data.get(hashCode);
    for (HashMap.Entry<K, V> entry : chain) {
      if (entry.key.equals(key)) {
        return entry.value;
      }
    }
    return null;
  }
}
