package kata02;

import java.util.HashMap;
import java.util.Map;

public class Kata02 {

    public static void main(String[] args) {
        int[] data = {2, 4, 5, 2, 7, 4, 4, 8, 8, 5, 2, 6, 5, 7, 2};
        Map<Integer, Integer> histogram = new HashMap<>();

        for(int key : data){
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+1 : 1); //Using a ternary conditional operator
        }
        for(Integer key : histogram.keySet()){
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
}