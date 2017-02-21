import java.util.HashMap;

public class CountriesHashMap{

public static void main(String[] args) {
    HashMap<String, Long> countries = new HashMap<String, Long>();

    countries.put("UK", 64100000L);
    countries.put("Germany", 80620000L);
    countries.put("France", 66030000L);
    countries.put("Japan", 12730000L);

    for(String country : countries.keySet()){
      System.out.println("The population of " + country + " is " + countries.get(country));
    }


  
}

}