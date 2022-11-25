import java.util.HashMap;
import java.util.Map;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
        //String str="leetcode";//letcod
        String str="himanshu kumar";//letcod

        char[] chars=str.toCharArray();
        Map<Character, Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        for(char ch: chars){
            if(!map.containsKey(ch)){
                map.put(ch,map.getOrDefault(ch, 0)+1);
                sb.append(ch);
            }
        }
        System.out.println("Result: "+sb);
    }
}
