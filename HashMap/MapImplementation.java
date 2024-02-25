package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapImplementation {
    public static void main(String[] args) {
        HashMap <String,Integer> map=new HashMap<>();
        // add 
        map.put("India", 130);
        map.put("China",140);
        map.put("America",80);
        System.out.println(map);
        System.out.println();


        // update 
        map.put("India",140);
         System.out.println("After Update"+map);
         System.out.println();
        // check whether key exist or not
        System.out.println("India Exists So its -->"+map.containsKey("India"));
        System.out.println("Pakistan doesnt exists so its -->"+map.containsKey("Pakistan"));
        System.out.println();

        // get value 
        System.out.println("key India exists so its value-->"+map.get("India"));
        System.out.println("key Pakistan dosen exist so its value-->"+map.get("Pakistan"));
        System.out.println(); 

        // Iterate
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }
        
        Set <String> keys=map.keySet();
        for(String key: keys){
            System.out.print("\n Values:"+map.get(key)+" ");
        }


    }
}
