import java.util.*;
class BackAround
{
public String backAround(String str)
{
int length=str.length();
return(str.charAt(length-1)+str+str.charAt(length-1));
}
}
class BackAroundTest
{
public static void main(String args[])
{
BackAround ob = new BackAround();
System.out.println(ob.backAround("Hello"));
}
}