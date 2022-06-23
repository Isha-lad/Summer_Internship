class Encapsulate 
{
	private String Name;
	private int Age;
	public int getAge() 
    { 
        return Age; 
    }
	public String getName() 
    { 
        return Name; 
    }

	public void setAge(int newAge) 
    { 
        Age = newAge; 
    }
	public void setName(String newName)
	{
		Name = newName;
	}
}

public class Encapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		obj.setName("ISHA");
		obj.setAge(21);
	
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());
	}
}
