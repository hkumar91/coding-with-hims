import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveArrayDuplicates {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,50,50};
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int i=0; i< arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                list.add(arr[i]);
            }
        }
        System.out.println("Res: "+list);
    }
}
