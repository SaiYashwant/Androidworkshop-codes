import java.io.*;
class Solution1
{
public boolean sameLast(int a,int b)
{
return(a%10==b%10);
}
}
public class Solution1Test
{
public static void main(String args[])
{
Solution1 ob = new Solution1();
System.out.println(ob.sameLast(25,35));
System.out.println(ob.sameLast(21,39));
System.out.println(ob.sameLast(77,7));    
}
}
