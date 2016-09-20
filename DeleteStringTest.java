class DeleteString
{
public String withoutString(String base, String remove)
{
String removedString = base.replaceAll(remove,"");
 return removedString;
}
}
public class DeleteStringTest
{
public static void main(String args[])
{
DeleteString ob=new DeleteString();
System.out.println(ob.withoutString("Hello there", "llo"));
System.out.println(ob.withoutString("Hello there", "e"));
System.out.println(ob.withoutString("Hello there", "x"));
}
}