package arrays;

class ArrayAllSum
{
public static void main(String arg[])
{
int a[]={2,4,3,5,10};
int sum=0;
for(int i=0;i<a.length;i++)
{
	sum=sum+a[i];
}
System.out.println(sum);
}
}