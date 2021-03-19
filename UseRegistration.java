package UserRegistration;
import java.util.Scanner;
import java.lang.*;
public class UseRegistration {
	private static final Scanner scan = new Scanner(System.in);
    public static  void main(String[] args) {
    	validateUserData();
}
    public static void validateUserData()
    {
        System.out.println("Enter Your First name");
        String name = scan.next();
        System.out.println("The first name is: " + name);
        String pattern = "^([A-Z]{1})([a-z]{2,})$";

        if( name.matches(pattern))
        {
            System.out.println("Name is Valid");
        }
        else
        {
            System.out.println("Name is Invalid");
        }
    }
public static void validateUserLastName()
{
    System.out.println("Enter Your Last name");
    String name = scan.next();
    System.out.println("The Last name is: " + name);
    String pattern = "^([A-Z]{1})([a-z]{2,})$";
    if( name.matches(pattern))
    {
        System.out.println("Name is Valid");
    }
    else
    {
        System.out.println("Name is Invalid");
    }
}
}