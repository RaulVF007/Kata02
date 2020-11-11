package kata02;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    public final int[] data;
    
    public Histogram(int[] data){
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {	        
            if(histogram.containsKey(data[i])){	            
                histogram.put(data[i], histogram.get(data[i])+1);	
            }else{	
                histogram.put(data[i], 1);	
            }	
        }
        return histogram;
    } 
}
