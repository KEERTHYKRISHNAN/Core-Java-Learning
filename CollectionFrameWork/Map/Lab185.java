package CollectionFrameWork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab185 {
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("id1" ,02);
        map.put("id2" ,8);
        map.put("id1",05);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("Id1"));
        System.out.println(map.get("id2"));
        System.out.println(map.put("id3" , 10));
        System.out.println(map.keySet());

    }


}
