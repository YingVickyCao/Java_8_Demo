package default_methods_in_interfaces;

/**
 * Created by hades on 5/30/2016.
 */
public class MultipleDefaults {
  public static void main(String args[]) {
    Vehicle vehicle = new Car();
    vehicle.print();
  }


  public interface Vehicle {
    default void print() {
      System.out.println("I am a Vehicle!");
    }

    static void blowHorn() {
      System.out.println("Blowing horn!!!");
    }
  }

  public interface FourWheeler {
    default void print() {
      System.out.println("I am a four wheeler!");
    }
  }

  static class Car implements Vehicle, FourWheeler {

    // First solution
//    @Override
//    public void print() {
//      System.out.println("I am a four wheeler car Vehicle!");
//    }

    /**
     * Second solution
     */
    @Override
    public void print() {
      Vehicle.super.print();
      FourWheeler.super.print();
      Vehicle.blowHorn();
      System.out.println("I am a car!");
    }
  }
}
