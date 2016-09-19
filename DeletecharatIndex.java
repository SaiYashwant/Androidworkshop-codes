import java.io.*;
import java.util.*;
class DeleteChar
{
public String missingChar(String str,int index)
{
StringBuffer sb = new StringBuffer(str);
return(sb.deleteCharAt(index).toString());
}
}
class DeletecharatIndex
{
public static void main(String args[])
{
DeleteChar ob = new DeleteChar();
System.out.println(ob.missingChar("Java", 1));
System.out.println(ob.missingChar("Android", 0));
}
}