class child
{  
    float income=4000;  


class Parent extends child
{  
    int bonus=1000;  
    public static void main(String args[])
    {  
      Parent a = new Parent();  
      System.out.println("salary is:"+a.income);  
      System.out.println("Bonus is:"+a.bonus);  
    }  
}
}