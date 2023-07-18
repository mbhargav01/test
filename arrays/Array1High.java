package arrays;

class Array1High
{
public static void main(String args[])
{
int a[]={112,1,4,13,5,110};
int max=0;
for(int i=1;i<a.length;i++)
{
if(a[max]<a[i])
{
a[max]=a[i];
System.out.println(a[max]);
}
}
System.out.println("Final: "+a[max]);
}
}