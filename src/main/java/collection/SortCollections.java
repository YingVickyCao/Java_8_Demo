package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hades on 5/30/2016.
 * Collections.sort(ascending order) in java8
 */
public class SortCollections {
  public static void main(String args[]) {
    List<String> stringList1 = getStringList();
    System.out.println("befor sort_7, stringList1 = " + stringList1);
    sort_7(stringList1);
    System.out.println("after sort_7, stringList1 = " + stringList1);


    List<String> stringList2 = getStringList();
    System.out.println("befor sort_8, stringList2 = " + stringList2);
    sort_8(stringList1);
    System.out.println("after sort_8, stringList2 = " + stringList2);
  }

  /**
   * Collections.sort(ascending order) in java7
   */
  public static void sort_7(List<String> list) {
    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
      }
    });
  }

  /**
   * Collections.sort(ascending order) in java8
   */
  public static void sort_8(List<String> list) {
    Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
  }

  public static List<String> getStringList() {
    List<String> stringArrayList = new ArrayList<String>();
    stringArrayList.add("Mahesh ");
    stringArrayList.add("Suresh ");
    stringArrayList.add("Ramesh ");
    stringArrayList.add("Naresh ");
    stringArrayList.add("Kalpesh ");
    return stringArrayList;
  }
}
