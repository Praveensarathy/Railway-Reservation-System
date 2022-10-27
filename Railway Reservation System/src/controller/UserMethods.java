package controller;

import model.Bookings;
import model.ManualDB;
import model.Train;

public class UserMethods {
	Validation validIn;
	TrainMethods trainMethod;
	public UserMethods(){
		validIn = new Validation();
		trainMethod = new TrainMethods();
	}
	public void BookUserInput() {
		Bookings book = new Bookings();
		System.out.print("Enter ur Name:");
		book.setName(Validation.getString());
		System.out.println("Enter Your age:");
		book.setAge(Validation.getInteger());
		System.out.println("Enter your Prefered Berth:");
		book.setPreferedBirth(Validation.getString().charAt(0));
		if(trainMethod.isAvail(book)) {
			System.out.println("Your Ticket is successfully Booked!!!");
			ManualDB.bookings.add(book);
		}
	}
	public Boolean cancellation(int id) {
		Train train = Train.getInstance();
		for(Bookings book : ManualDB.bookings) {
			if(Bookings.id == id) {
				if(book.getPreferedBirth() == 'l' ) 
					train.setLower(train.getLower()+1);
				
				else if(book.getPreferedBirth() == 'u' ) 
					train.setUpper(train.getUpper()+1);
				
				else if(book.getPreferedBirth() == 'm' ) 
					train.setMiddle(train.getMiddle()+1);
				
				ManualDB.bookings.remove(book);
				if(ManualDB.rac.size() !=0) {
					if(trainMethod.isAvail(ManualDB.rac.poll())) {
						System.out.println("Your Ticket is successfully Booked!!!");
						ManualDB.bookings.add(book);
					}
			
				}
				if(ManualDB.waitList.size() !=0) {
					ManualDB.rac.add(ManualDB.waitList.poll());
				}
			}
		}
		return false;
	}
}