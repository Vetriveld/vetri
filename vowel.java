class Demo
{
public static void main(String []args)
{
int count=0;
Scanner s=new Scanner(System.in);
char a=s.next.charAt(0);
char b[]={'a','e','i','o','u'};
for(int i=0;i<b.length;i++)
{
if(b[i]==a){
System.out.println("vowel");
count++;}
}
if(count==0)
System.out.println("constant");
}
}
}
