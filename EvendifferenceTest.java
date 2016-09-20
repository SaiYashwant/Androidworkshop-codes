import java.io.*;
class Evendifference
{
public boolean evenlySpaced(int a,int b,int c)
{
if(((a+b)%2)==0 && ((b+c)%2==0))
return true;
else
return false;
}
}
public class EvendifferenceTest
{
public static void main(String args[])
{
Evendifference ob =new Evendifference();
System.out.println(ob.evenlySpaced(2,4,6));
System.out.println(ob.evenlySpaced(4,6,2));
System.out.println(ob.evenlySpaced(4,6,3));
}
}