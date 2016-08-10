class Demo
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
String sen=s.nextLine();
char c[]=sen.toCharArray();
String a="abcdefghijklmnopqrstuvwxyz";
char b[]=a.toCharArray();
int count=0;
for(int i=0;i<26;i++)
{
for(int j=0;j<c.length;j++)
{
if(b[i]==c[j]){
count++;
break;
}
}
}
if(count==26)
System.out.println("it is pangram");
else
System.out.println("it is not pangram");
}
}
