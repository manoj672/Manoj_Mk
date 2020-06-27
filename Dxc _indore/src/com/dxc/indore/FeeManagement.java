package com.dxc.indore;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class userClass<T> { 
	T obj;

	void create(T obj) { 
		this.obj = obj;
	}

	T getInstance() { 
		return obj;
	}
	
}

public class FeeManagement{
	
	InputStreamReader isr = null;
	BufferedReader buff = null;
	Admin mAdmin = null;
	Accountant mAccountant=null;
	
	String option;
	String clientchoice;

	public static void main(String[] args) throws Exception {

		FeeManagement mFM = new FeeManagement();

		mFM.isr = new InputStreamReader(System.in);
		mFM.buff = new BufferedReader(mFM.isr);
		String continueChoice;
		boolean transaction=true;
		boolean repeat=true;
		
			do {
				
			System.out.println("Welcome to FEE MANAGEMENT SYSTEM\n");
			System.out.println("Select your choice : \n1.Admin\n2.Accountant\n");
			String moption = mFM.buff.readLine();

			
			switch (Integer.parseInt(moption)) {
			case 1:
				userClass<Admin> obj = new userClass<Admin>();
				obj.create(new Admin());
				mFM.mAdmin = obj.getInstance();
				
				System.out.println(" Admin login PAGE\n");
				do{
					mFM.mAdmin.login(mFM.buff);
				System.out.println("ADMIN SECTION\n");
				System.out.println("select your option\n 1.ADD ACCOUNTANT \n 2.VIEW ACCOUNTANT \n 3.LOGOUT");
				String operationchoice=mFM.buff.readLine();
				
				switch(Integer.parseInt(operationchoice)) {
				case 1: mFM.mAdmin.addAccountant(mFM.buff);
				break;
				case 2: mFM.mAdmin.viewAccountant(mFM.buff);
				break;
				case 3: mFM.mAdmin.logout(mFM.buff);
				break;
				default:
					System.out.println("task is not performed");
				
				}System.out.println("Do you Want to Continue\nYes\nNo");
				continueChoice = mFM.buff.readLine();
				if (continueChoice.equalsIgnoreCase("No"))
					transaction = false;
				}while(transaction);
				break;
				
			case 2:
				userClass<Accountant> obj1=new userClass<Accountant>();
				obj1.create(new Accountant());
				mFM.mAccountant=obj1.getInstance();
				do {
				System.out.println("select your choice\n 1.ADDSTUDENT \n 2.VIEWSTUDENT \n 3.EDITSTUDENT \n 4.DUE \n 5.LOGOUT");
				String option1=mFM.buff.readLine();
				
				switch(Integer.parseInt(option1)) {
					case 1: mFM.mAccountant.addstudent(mFM.buff);
					break;
					case 2: mFM.mAccountant.viewstudent(mFM.buff);
					break;
					case 3: mFM.mAccountant.editstudent(mFM.buff);
					break;
					case 4: mFM.mAccountant.due(mFM.buff);
					break;
					case 5: mFM.mAccountant.logout(mFM.buff);
					break; 
					default: System.out.println("task not completed");
				}System.out.println("Do you Want to Continue\nYes\nNo");
				continueChoice = mFM.buff.readLine();
				if (continueChoice.equalsIgnoreCase("No"))
					transaction = false;
				}while(transaction);
				break;
				default: System.out.println("No option selected\n");
			}System.out.println("Do you Want to End feemanagement\nYes\nNo");
			 mFM.option = mFM.buff.readLine();
			if (mFM.option.equalsIgnoreCase("yes"))
				repeat = false;
			}while(repeat);
			System.out.println("you are suuccessfully ended the session !!  ");
	}
}
				



	
	


