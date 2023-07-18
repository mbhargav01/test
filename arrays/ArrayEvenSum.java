package arrays;

class ArrayEvenSum
{
public static void main(String arg[])
{
int a[]={2,4,3,5,10};
int sumEven=0,sumOdd=0;
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
sumEven=sumEven+a[i];
else
sumOdd=sumOdd+a[i];
}
System.out.println("Sum of Even: "+sumEven);   
System.out.println("Sum of Odd: "+sumOdd);
}
}