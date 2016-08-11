class Alpha
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       char a=s.next().charAt(0);
       String str=""+a;
       String b=str.replaceAll("[a-zA-Z]","true");
       if(b.equals("true"))
    	   System.out.println("yes");
       else
    	   System.out.println("no");
    }	   
	}
