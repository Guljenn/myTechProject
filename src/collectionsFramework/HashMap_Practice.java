package collectionsFramework;

import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_Practice {

    public static int countries(HashMap<String,String> map){
        int count = 0;
        TreeMap<String, String> uniques = new TreeMap<>(map);
        Set<String> keys = uniques.keySet();
        for(String key : keys){
            if(key.toLowerCase().startsWith("c")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> list = new HashMap<>();
        list.put("Melda", "beautiful");
        list.put("Cathy", "gorgeous");
        list.put("Alona", "pretty");
        list.put("Catalina", "precious");

        System.out.println(countries(list));
    }
}
