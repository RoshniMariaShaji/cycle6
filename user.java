import java.util.*;
class user
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the balance amount");
        int balance=sc.nextInt();
        try
        {
            if(balance<500)
                throw new Exception();
            else
            {
                System.out.println("Balance amount is "+balance);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}