package view;
import controller.TrainMethods;
import controller.UserMethods;
import controller.Validation;
import model.Bookings;
public class UserView {
	UserMethods user ;
	UserView(){
		user = new UserMethods();
	}
	public void printChoice() {
		System.out.println("------------------------");
		//System.out.println("To print choice option");
		System.out.println("To Book Ticket");
		System.out.println("To Cancel Ticket");
		System.out.println("To check Tickets Availability");
	}	
	public void BookUserInput() {
		user.BookUserInput();	
	}
	public void cancellation() {
		System.out.println("Please ur Id");
		user.cancellation(Validation.getInteger());
	}
}