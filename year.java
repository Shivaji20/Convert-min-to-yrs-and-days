import java.util.*;
public class Convert {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int year,days;
		int cn=60*24*365;
		year=n/cn;
		System.out.print(year+" years ");
		n=n-(year*cn);
		int cm=60*24;
		days=n/cm;
		System.out.print("and "+days+" days.");
	}
}
