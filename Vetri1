import java.util.Scanner;

public class Ex {
	   public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		String in="25253";
		int r[]=new int[in.length()-1];
		for(int i=0;i<in.length()-1;i++)
		{
		char a=in.charAt(i);
		char b=in.charAt(i+1);
		String out=a+""+b;
		r[i]=Integer.parseInt(out);
		}
		int d=r[0];
		for(int j=0;j<r.length-1;j++)
		{
			//int a=r[j];
			int b=r[j+1];
			if(d>b)
				continue;
			else 
				d=b;
				}
		System.out.println(d);
	}
}
