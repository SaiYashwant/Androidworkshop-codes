class CalculateLeapYears
{
public int countLeapYear(int begin,int finish)
{
int count=0;
for(int i=begin;i<=finish;i++)
if((i%4==0&&i%100!=0)||i%400==0)
count++;
return count;
}
}
class LeapYears
{
public static void main(String args[])
{
CalculateLeapYears ob = new CalculateLeapYears();
System.out.println(ob.countLeapYear(2000,2016));
}
}