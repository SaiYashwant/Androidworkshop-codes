import java.io.*;
class CheckE
{
public boolean containE(String str)
{
int count=0;
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)=='e')
count++;
}
return(count>=1&&count<=3);
}
}
public class CheckEtest
{
public static void main(String args[])
{
CheckE ob=new CheckE();
System.out.println(ob.containE("hello"));
System.out.println(ob.containE("helloeee"));
System.out.println(ob.containE("world"));
}
}