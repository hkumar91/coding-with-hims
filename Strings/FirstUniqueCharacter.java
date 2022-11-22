import java.util.LinkedHashMap;
import java.util.Map;

class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str="loveleetcode";

        System.out.println("Result Index: "+fun(str));
    }

    public static int fun(String s){
        char[] word = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(char c: word)
            map.put(c, map.getOrDefault(c, 0)+1);
        for(int i=0;i<word.length;i++)
            if(map.get(word[i])==1)
                return i ;
        return -1;
    }
}
