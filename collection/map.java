import java.util.*;  
class map 
{  
    public static void main(String[] args) 
    {  
        Map map=new HashMap();  
  
        map.put(1,"Isha");  
        map.put(2,"Shiv");  
         
        Set set=map.entrySet();
        Iterator itr=set.iterator();  
        while(itr.hasNext()){  

        Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
} 