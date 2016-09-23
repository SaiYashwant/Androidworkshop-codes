import java.util.*;
class Addarrays{
public static void main(String args[]){
ArrayList<String> ar1 = new ArrayList<String>();
ar1.add("yashwant");
ar1.add("revanth");
ar1.add("chaitanya");
ArrayList<String> ar2 = new ArrayList<String>();
ar2.add("dhruva");
ar2.add("vinay");
ar2.add("hemanth");
ar2.add("bharath");
ar1.addAll(ar2);
System.out.println(ar1);
}
}