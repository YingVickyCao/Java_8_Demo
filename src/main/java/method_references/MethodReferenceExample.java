package method_references;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hades on 5/30/2016.
 */
public class MethodReferenceExample {
  public static void main(String args[]) {

    MethodReferenceExample example = new MethodReferenceExample();
    List<String> list = example.getStringList();
    example.forEach_java8(list);
    System.out.println();

    example.forEach_java7(list);
  }

  private void forEach_java8(List<String> list) {
    list.forEach(System.out::println);
  }

  private void forEach_java7(List<String> list) {
    for (String str : list) {
      System.out.println("str = " + str);
    }
  }

  private List<String> getStringList() {
    List<String> names = new ArrayList();

    names.add("Mahesh");
    names.add("Suresh");
    names.add("Ramesh");
    names.add("Naresh");
    names.add("Kalpesh");
    return names;
  }
}


