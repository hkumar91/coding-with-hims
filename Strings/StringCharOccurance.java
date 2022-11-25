import java.util.HashMap;
import java.util.Map;

public class StringCharOccurance {

    public static void main(String[] args) {
        String str="leetcode";

        char[] chars=str.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();

        for(char ch: chars){
            map.put(ch, map.getOrDefault(ch, 0)+1);
//            if (map.containsKey(ch)){
//                map.put(ch, map.get(ch)+1);
//            }else{
//                map.put(ch, 1);
//            }
        }

        System.out.println(map);
    }

}
