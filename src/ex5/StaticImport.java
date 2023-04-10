package ex5;

import java.util.Arrays;
import java.util.Calendar;

import static java.util.Arrays.sort;

public class StaticImport {
  public static void main(String[] args) {
    int[] arr = {3,5,2,6};
    char[] cArr = {'d', 'b', 'c', 'd'};
    sort(arr);
    sort(cArr);
  }
}
