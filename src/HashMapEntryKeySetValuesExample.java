
import java.util.*;

public class HashMapEntryKeySetValuesExample {
    public static void main(String[] args) {
        Map<String, String> countrySOCodeMapping = new HashMap<>();
        countrySOCodeMapping.put("India", "IN");
        countrySOCodeMapping.put("United States of America", "US");

        countrySOCodeMapping.put("Russia", "RU");
        countrySOCodeMapping.put("Russia", "RU");
        countrySOCodeMapping.put("Russia", "RU");

        countrySOCodeMapping.put("Japan", "JP");
        countrySOCodeMapping.put("China", "CN");

        //HashMap's entry set
        //Show only once: Russia
        Set<Map.Entry<String, String>> countryISOCodeEntries = countrySOCodeMapping.entrySet();
        System.out.println(countryISOCodeEntries);

        //HashMap's key set
        //Show only the first and key set
        Set<String> countries = countrySOCodeMapping.keySet();
        System.out.println("COuntries: "+countries);

        //HashMap's values
        //Show the second key
        Collection<String> isoCodes = countrySOCodeMapping.values();
        System.out.println("ISO Codes: "+isoCodes);
    }
}
