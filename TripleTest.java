import java.util.*;
class Triple
{
public int countTriple(String str)
{
int flag=0,count=1;
for(int i=0;i<str.length()-1;i++)
{
if(str.charAt(i)==str.charAt(i+1))
count++;
else
count=1;
if(count>=3)
flag++;
}
return flag;
}
}
class TripleTest
{
public static void main(String args[])
{
Triple ob = new Triple();
System.out.println(ob.countTriple("abcXXXabc"));
System.out.println(ob.countTriple("xxxabyyyycd"));
System.out.println(ob.countTriple("a"));
}
}