package kata02;

import java.util.HashMap;
import java.util.Map;

public class Kata02 {

    public static void main(String[] args) {
        int[] data = {2, 4, 5, 2, 7, 4, 4, 8, 8, 5, 2, 6, 5, 7, 2};
        Map<Integer, Integer> histogram = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }
        }
        for(Integer key : histogram.keySet()){
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
}