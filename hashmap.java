import java.util.HashMap; // non syncronized
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,String> hp=new HashMap<>();
        hp.put("yash","India");

        hp.put("kahaan", "Germany");
        
        System.out.println(hp);

        System.out.println(hp.get("yash"));

        for(String i:hp.keySet()){
            System.out.print(i);
        }

        for(String j:hp.values()){
            System.out.println(j);
        }
        for(Map.Entry<String,String> me:hp.entrySet()){
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }

    }
}
