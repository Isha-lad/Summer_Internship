import java.security.Key;
import java.util.*;
class updelement
{
    public static void main(String args[])
    {
        Map<Integer, String> a1 = new HashMap<Integer, String>();
        a1.put(Integer(1), "Isha");
        a1.put(Integer(2), "Nilesh");
        a1.put(Integer(3), "Lad");
        System.out.println("Original:" + a1);
        a1.put(new Integer(2),"N");
        System.out.println("Updated:" + a1);
    }
}