import java.util.Scanner;

public class Palindrome{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter a String: ");
        String original = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(original);
        reversed.reverse();

        if(original.equals(reversed.toString())) {
            System.out.println(original + "is a palindroome");
        }
        else {
            System.out.println(original + "is not a palindrome");
        }
        scanner.close();
        
    }
}