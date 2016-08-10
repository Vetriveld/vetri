import java.util.*;
import java.lang.*;
class Tre
{
public static void main(String []args)
{
int count=0;
Scanner s=new Scanner(System.in);
int a[]=new int[8];
for(int i=0;i<8;i++)
{
a[i]=s.nextInt();
}
for(int j=0;j<8;j+2){
if(a[j]==a[j+1])
{
int s=a[j];
int s1=a[j+1];
count++;
}
else if(s==a[j]||s1==a[j])
{
count++;
}
}
if(count==2)
System.out.println("it can form");
else
Sysetem.out.println("it cant form");
}
}

