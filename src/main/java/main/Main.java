package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("<-----------------------WELCOME TO HOTEL MANAGEMENT--------------------->");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		while(true)
		{
			System.out.print("<-------Tab(1) Login Admin Module\t");
			System.out.print("(2) User Module \t");
			System.out.println("(3) LogOut--------->");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				AdminModule.main();
			}
			else if(c==2)
			{
				User.main();
			}
			else if(c==3)
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Press currect tab");
			}
			
		}
	}
		catch(Exception e)
		{
			System.err.println("Please enter correct data");
			Main.main(null);
		}
	}
	

}
