class Demo
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int a[]=new int[m];
for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
System.out.println(a[i]);
}
}
}}
