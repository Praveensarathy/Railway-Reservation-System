package controller;

import model.Bookings;
import model.ManualDB;
import model.Train;

public class TrainMethods{

public boolean isAvail(Bookings book) {
		Train train = Train.getInstance();
		if(book.getPreferedBirth() == 'l') {
			if(train.getLower()!= 0) {
				train.setLower(train.getLower()-1);
				System.out.println("You got a Preferred Berth");
				return true;
			}
			else if(train.getUpper() !=0) {
				train.setUpper(train.getUpper()-1);
				System.out.println("Preffered berth not Available \n Upper berth allocated");
				return true;
			}
			else if(train.getMiddle() !=0) {
				System.out.println("Preffered berth not Available \n Middle berth allocated");
				train.setMiddle(train.getMiddle() - 1);
				
				return true;
				}
		}
		else if(book.getPreferedBirth() == 'm') {
			if(train.getMiddle()!= 0) {
				System.out.println("You got a Preferred Berth");
				train.setMiddle(train.getMiddle() - 1);
				return true;
			}
			else if(train.getUpper() !=0) {
				train.setUpper(train.getUpper()-1);
				System.out.println("Preffered berth not Available \n Upper berth allocated");
					return true;
			}
			else if(train.getLower() !=0) {
				System.out.println("Preffered berth not Available \n Middle berth allocated");
				train.setLower(train.getLower() - 1);
				return true;
				}
		}
		else if(book.getPreferedBirth() == 'u') {
			if(train.getUpper()!= 0) {
				System.out.println("You got a Preferred Berth");
				train.setUpper(train.getUpper()-1);
				return true;
			}
			else if(train.getMiddle() !=0) {
				train.setMiddle(train.getMiddle() - 1);
				System.out.println("Preffered berth not Available \n Upper berth allocated");
				return true;
			}
			else if(train.getLower() !=0) {
				System.out.println("Preffered berth not Available \n Middle berth allocated");
				train.setLower(train.getLower() - 1);
				return true;
				}
		}
		if(train.getRac() !=0) {
			train.setRac(train.getRac()-1);
			System.out.println("Your are in RAC please for further update");
			ManualDB.rac.add(book);
			return false;
		}
		if(train.getWaitList() !=0) {
			train.setWaitList(train.getWaitList()-1);
			System.out.println("Your are in Waiting List please for further update");
			ManualDB.waitList.add(book);
			return false;
		}
		return false;
	}
}