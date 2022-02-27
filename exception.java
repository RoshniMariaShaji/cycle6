import java.io.*;
class exception
{
    public static void main(String args[])throws Exception
    {
        try
        {
            int a=50/0;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        try
        {
            int a[]=new int[5];
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        try
        {
            FileInputStream fin=new FileInputStream("abc.txt");
            int i;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
            }
            fin.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}