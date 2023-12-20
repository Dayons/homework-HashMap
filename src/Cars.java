import java.util.HashMap;

public class Cars {
    public static void main(String[] args) {
        HashMap<String, Integer> carMap = new HashMap<>();
        carMap.put("Toyota", 2019);
        carMap.put("Tesla", 2022);
        carMap.put("Mercedes-Benz", 2018);
        carMap.put("Honda", 2007);
        carMap.put("BMW", 2023);


        System.out.println("Keys:");
        for (String key : carMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nValues:");
        for (Integer value : carMap.values()) {
            System.out.println(value);
        }
    }
}