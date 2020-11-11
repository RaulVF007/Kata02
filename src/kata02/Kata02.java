package kata02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata02 {

    public static void main(String[] args) {
        Integer[] data = {2, 4, 5, 2, 7, 4, 4, 8, 8, 5, 2, 6, 5, 7, 2};
        String [] data2 = {"Facundo","Ana","Pedro","Pepe","Maria","Pepe","Maria","Jesus","Pepe"};
        /*You can calculate a histogram with different types of data; Integer values,
        String values, etc. Depending on the parameters you pass to the Histogram's constructor.
        
        - If you want to use line 16, you must uncomment line 15 and vice versa*/
        Histogram meta_histogram = new Histogram(data);
        //Histogram meta_histogram = new Histogram(data2);
        
        Map<Integer,Integer> histogram =  meta_histogram.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<Integer,Integer> entry = entries.next();
            System.out.println("key: "+ entry.getKey() + ", value: " +entry.getValue());
        }
    }
}