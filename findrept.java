class Demo
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int size=s.nextInt();
int a[]=new int[size];
for(int i=0;i<a.length-1;i++)
{
for(int j=i+1;j<a.length)
{
if(a[i]==a[j])
System.out.println(a[i]);
}}
}}
