abstract class teacher
    {  
    abstract void main();   
    } 

class student extends teacher
{  
    void main()
    {
        System.out.println("student::result");
    }
}
class Main
{
    public static void main(String args[])
    {  
        teacher obj = new student();    
        obj.main();          
    }   
}

