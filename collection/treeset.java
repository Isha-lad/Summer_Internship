import java.util.*;

class treeset
{
    public static void main(String args[])
    {
        TreeSet<String> t = new TreeSet<String>();
        t.add("Isha");
        t.add("Shiv");
        //hs.insert("Rajvi");
        Iterator<String> ir = t.iterator();
        while(ir.hasNext())
        {
            System.out.println(ir.next());
        }
    }
}