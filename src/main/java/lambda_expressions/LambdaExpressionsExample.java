package lambda_expressions;

/**
 * Created by hades on 5/30/2016.
 */
public class LambdaExpressionsExample {
  interface MathOperation {
    int operation(int a, int b);
  }

  interface GreetingService {
    void sayMessage(String message);
  }

  private int operate(int a, int b, MathOperation mathOperation) {
    return mathOperation.operation(a, b);
  }

  public static void main(String args[]) {
    java_7_test();
    java_8_test();
  }

  public static void java_8_test() {
    //with type declaration
    MathOperation addition = (int a, int b) -> a + b;

    //with out type declaration
    MathOperation subtraction = (a, b) -> a - b;

    //with return statement along with curly braces

    MathOperation multiplication = (int a, int b) -> {
      return (a * b);
    };

    //without return statement and without curly braces
    MathOperation division = (int a, int b) -> a / b;

    LambdaExpressionsExample example = new LambdaExpressionsExample();
    System.out.println("java7 test");
    System.out.println("10 + 5 = " + example.operate(10, 5, addition));
    System.out.println("10 - 5 = " + example.operate(10, 5, subtraction));
    System.out.println("10 * 5 = " + example.operate(10, 5, multiplication));
    System.out.println("10 / 5 = " + example.operate(10, 5, division));
    System.out.println();

  }

  public static void java_7_test() {

    LambdaExpressionsExample example = new LambdaExpressionsExample();
    MathOperation addition = new MathOperation() {
      @Override
      public int operation(int a, int b) {
        return a + b;
      }
    };

    MathOperation subtraction = new MathOperation() {
      @Override
      public int operation(int a, int b) {
        return a - b;
      }
    };

    MathOperation division = new MathOperation() {
      @Override
      public int operation(int a, int b) {
        return a / b;
      }
    };

    MathOperation multiplication = new MathOperation() {
      @Override
      public int operation(int a, int b) {
        return a * b;
      }
    };


    System.out.println("java7 test");
    System.out.println("10 + 5 = " + example.operate(10, 5, addition));
    System.out.println("10 - 5 = " + example.operate(10, 5, subtraction));
    System.out.println("10 * 5 = " + example.operate(10, 5, multiplication));
    System.out.println("10 / 5 = " + example.operate(10, 5, division));
    System.out.println();
  }


}
