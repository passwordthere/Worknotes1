package Java.ThinkinJava;
import java.util.*;

public class Property {
  public static void main(Stringp[] args) {
    System.out.println(new Date());
    Properties p = System.getProperty();
    p.list(System.out);
    System.out.println("--- Memory Usage:");
    Runtime rt = Runtime.getRuntime();
    System.out.println("Total Memory = " + rt.totalMemory() + " Free Memory = " + rt.freeMemory());
  }
}