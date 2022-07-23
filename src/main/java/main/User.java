package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import DAO.TarrifDao;

public class User {

	public static void main() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("<-----------------------WELCOME TO USER  MODULE--------------------->");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		while(true)
		{
		System.out.print("<--------TAB (1) Show Room Price\t ");
		System.out.print("(2) GO BACK\t");
		System.out.println("(3) Exit-------->");
		int c=Integer.parseInt(br.readLine());
		if(c==1)
		{
			 TarrifDao.showTarrifRecords();
		}
		else if(c==2)
		{
			break;
		}
		else if(c==3)
		{
			System.out.println("Thank you for using our Application.........");
			System.exit(0);
		}
		else
		{
			System.out.println("Enter Correct Info...........");
		}

	}
		}
		catch(Exception e)
		{
			System.err.println("Some Error Occured........");
			Main.main(null);
		}
		}
}
