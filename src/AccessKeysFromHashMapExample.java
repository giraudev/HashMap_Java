import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {
    public static void main(String[] args) {
        Map<String, String> userCityMapping = new HashMap<>();

        //Check if HashMap is empty
        System.out.println("is userCityMspping empty? :"+ userCityMapping.isEmpty());

        userCityMapping.put("Jonh", "New york");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");

        //find the size of Hashmap
        System.out.println("We have the city information of "+ userCityMapping.size());

        String userName = "Steve";

        //Check if a key exists in the HashMap
        if(userCityMapping.containsKey(userName)){
            //Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            System.out.println(userName+" lives in "+city);
        }else{
            System.out.println("City details not found for user "+userName);
        }

        //Modify the value assigned to an existing key
        userCityMapping.put(userName, "California");
        System.out.println(userName+" moved to a new city "+userCityMapping.get(userName));

        //The get() method returns 'null' if the specified key was not found in the HashMap
        System.out.println("Lisa's city: "+userCityMapping.get("Lisa"));

    }
}
