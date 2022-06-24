import java.util.*;
class treemap 
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Isha", 1);
        map.put("Rajvi", 3);
        map.put("Shiv", 2);
        for (Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " " + e.getValue());  
        }
    }
}