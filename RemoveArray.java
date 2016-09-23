import java.util.*;
class RemoveArray{
public static void main(String args[]){
ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(6);
arr.add(8);
arr.add(9);
for (Integer number : arr) {
   System.out.println(number);
}
arr.remove(1);
System.out.println("Afer removal the updated list is");
for (Integer number : arr) {
   System.out.println(number);
}
}
}
