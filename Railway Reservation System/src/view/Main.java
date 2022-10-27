package view;

import java.util.Scanner;

import controller.Validation;

public class Main {
	static Scanner sc = new Scanner(System.in);
	UserView user;
	Main(){
		 user = new UserView();
	}
	public void Initiate() {
		boolean quit = true;
		
		System.out.println("Enter your Choice:");
		while(quit) {
			user.printChoice();
			int choice = Validation.getInteger();
			
			if(choice ==1) {
				user.BookUserInput();
			}
			else if(choice ==2) {
				user.cancellation();
			}
			else if(choice == 3) {
				
			}
			else if(choice ==4 ){
				quit =false;
			}
			else {
				System.out.println("Please Enter correct Input 1,2,3,4:");
				continue;
			}
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.Initiate();
	}
}
