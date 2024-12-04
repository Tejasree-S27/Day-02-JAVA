import java.util.Scanner;

public class XOREqualityCheck 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Accept a and b values
        int a=sc.nextInt();
        int b=sc.nextInt();
        // Check if a and b are equal using XOR
        if ((a^b)==0)
         {
            System.out.println("Equal");
        } else
         {
            System.out.println("not Equal.");
        }
        sc.close();
    }
}