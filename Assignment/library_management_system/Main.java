import java.util.Scanner;
public class Library {
    void constructor(name, author)
    {
        this.book = book;
        this.author = author;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int choice=0;

        while(choice!=3){
            choice =obj.nextInt();

            if(choice ==1){
                book obj1=new book();

                obj1.religious();
                obj1.educational();
                obj1.romantic();
                obj1.comic();
                obj1.thriller();
                obj1.self_help();
            }
            else(choice ==2){
                author obj2=new author();

                obj2.author();
            }
        }
    }
}
