package exercises.leetcode;

import java.util.LinkedList;
import java.util.List;

// #43 LC
class MultiplyStrings {

  public String multiply2(String num1, String num2) {
    int m = num1.length();
    int n = num2.length();

    int[] res = new int[m + n];
    for (int i = m - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int p1 = i + j;
        int p2 = i + j + 1;
        int sum = mul + res[p2];

        res[p1] +=  (sum / 10); // carry
        res[p2] = (sum) % 10;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int digit : res) {
      if (!(sb.length() == 0 && digit == 0)) {
        sb.append(digit);
      }
    }
    return sb.length() == 0 ? "0" : sb.toString();
  }

  public String multiply(String num1, String num2) {
    int i, j;

    if (num1.equals("0") || num2.equals("0")) {
      return "0";
    }

    List<Integer> first = new LinkedList();
    for (i = num1.length() - 1; i >= 0; i--) {
      first.add(Character.getNumericValue(num1.charAt(i)));
    }

    List<Integer> mulPrev = new LinkedList();
    for (j = 0; j < num1.length(); j++) {
      mulPrev.add(0);
    }

    List<Integer> sum = new LinkedList();

    for (i = num2.length() - 1; i >= 0; i--) {
      List<Integer> mul = multiply(first, num2.charAt(i) - '0');
      List<Integer> shifted = shift(mul, num2.length() - 1 - i);
      sum = add(mulPrev, shifted);

      mulPrev = new LinkedList(sum);
    }

    StringBuilder sb = new StringBuilder();
    for (Integer k : sum) {
      sb.append(k);
    }

    return sb.reverse().toString();
  }

  List<Integer> multiply(List<Integer> mul1, int mul2) {
    int carry = 0;
    List<Integer> result = new LinkedList();

    for (Integer n : mul1) {
      int product = n * mul2 + carry;
      carry = product / 10;
      result.add(product % 10);
    }
    if (carry != 0) {
      result.add(carry);
    }
    return result;
  }

  List<Integer> add(List<Integer> a, List<Integer> b) {
    List<Integer> result = new LinkedList();
    int i = 0, j = 0;

    int carry = 0;
    while (i < a.size() && j < b.size()) {
      int sum = a.get(i) + b.get(j) + carry;
      carry = sum / 10;
      result.add(sum % 10);
      i++;
      j++;
    }

    while (i < a.size()) {
      int sum = a.get(i) + carry;
      carry = sum / 10;
      result.add(sum % 10);
      i++;
    }

    while (j < b.size()) {
      int sum = b.get(j) + carry;
      result.add(sum % 10);
      carry = sum / 10;
      j++;
    }

    if (carry > 0) {
      result.add(carry);
    }
    return result;
  }

  List<Integer> shift(List<Integer> a, int size) {
    List<Integer> result = new LinkedList();
    for (int i = 0; i < size; i++) {
      result.add(0);
    }
    result.addAll(a);
    return result;
  }
}
