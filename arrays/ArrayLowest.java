package arrays;

class ArrayLowest
{
public static void main(String args[])
{
int a[]={2,1,114,13,5,10};
int min=0;
for(int i=1;i<a.length;i++)
{
if(a[min]>a[i])
{
a[min]=a[i];
}
}
System.out.println("Lowest number: "+a[min]);
}
}