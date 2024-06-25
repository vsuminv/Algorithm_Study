import java.util.*;

public class MapExam{
    public Map<String, Integer> makeMap(){
        Map<String, Integer> products = new HashMap<>();
        products.put("가위",2500);
        products.put("크레파스",5000);
        
        
        return products;
    }
    
    public static void main(String[] args){
        MapExam me = new MapExam();
        me.makeMap();
    }
}
