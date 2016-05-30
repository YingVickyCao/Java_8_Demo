package lambda_expressions;

/**
 * Created by hades on 5/30/2016.
 */
public class ScopeExample {
  final static String salutation = "Hello! ";


  public static void main(String args[]) {
    java_7_test();
    java_8_test();
  }

  public static void java_8_test() {
    GreetingService greetService1 = message ->
        System.out.println(salutation + message);
    greetService1.sayMessage("Mahesh");
  }

  public static void java_7_test() {
    GreetingService greetService1 = new GreetingService() {
      @Override
      public void sayMessage(String message) {
        System.out.println(salutation + message);
      }
    };
    greetService1.sayMessage("Mahesh");

  }


  interface GreetingService {
    void sayMessage(String message);
  }


}
