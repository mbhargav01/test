package arrays;

class ArrayEvenCount
{
public static void main(String arg[])
{
int a[]={2,4,3,5,10};
int countEven=0,countOdd=0;

for(int j=0;j<a.length;j++)
{
if(a[j]%2==0)
countEven++;
else
countOdd++;
}

int evenArr[]=new int[countEven];
int oddArr[]=new int[countOdd];
int oddIndex=0,evenIndex=0;
for(int i=0;i<a.length;i++)
{
if(a[i]%2==0)
{
evenArr[evenIndex]=a[i];
evenIndex++;
countEven++;
}
else
{
oddArr[oddIndex]=a[i];
oddIndex++;
countOdd++;
}
}
System.out.println("Even numbers: "+evenArr.length);
for(int k=0;k<evenArr.length;k++)
{
System.out.println("Even: "+evenArr[k]);
}
System.out.println("Odd numbers: "+oddArr.length);
for(int k=0;k<oddArr.length;k++)
{
System.out.println("Odd: "+oddArr[k]);
}
}
}