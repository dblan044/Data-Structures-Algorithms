import java.util.*;

public class Main {
    public static void main(String[] args) {
          HashMap<String, String> table = new HashMap<>();
          table.put("Diana", "Dayanna15");
          table.put("Lester", "b3tt3r");
          table.put("Jose", "password");
          table.put("Lena", "lena123");
          System.out.println("HashMap: " + table);
          
          table.remove("Lena");
          System.out.println(table.containsValue("lena123"));
          System.out.println(table.containsValue("password"));
          System.out.println(table.containsKey("Diana"));
          
          System.out.println("HashMap: " + table);
          System.out.println(table.size());
          System.out.println(table.get("Diana"));
    }
}