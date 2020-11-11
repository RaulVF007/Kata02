package kata02;

import java.util.HashMap;
import java.util.Map;

public class Kata02 {

    public static void main(String[] args) {
        Integer[] data = {2, 4, 5, 2, 7, 4, 4, 8, 8, 5, 2, 6, 5, 7, 2};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer > histogr = histo.getHistogram();
        
        for(Integer key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}