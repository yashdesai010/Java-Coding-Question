import java.util.HashMap;
import java.util.Map;

public class nishit1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hp=new HashMap<>();
        hp.put(1,"Nishit");
        hp.put(2,"yash");
       hp.replace(1, "Nishit", "Soni");
       hp.remove(1);
       System.out.println(hp.get(1));
        for(Map.Entry<Integer,String> m:hp.entrySet()){
            System.out.println(m.getValue());
            System.out.println(m.getKey());
            

            
        }
    }
}
