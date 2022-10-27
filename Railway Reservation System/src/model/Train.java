package model;

public class Train {
	public static Train trainObj;
	private int lower;
	private int getUpper;
	private int middle;
	private int rac;
	private int waitList;
	
	
	private Train() {
		lower=1;
		getUpper=1;
		middle=1;
		rac=1;
		waitList=1;
	}
	
	public static Train getInstance() {
		if(trainObj == null) {
			trainObj = new Train();
		}
		return trainObj;
	}
	
	public int getLower() {
		return lower;
	}
	public void setLower(int lower) {
		this.lower = lower;
	}
	public int getUpper() {
		return getUpper;
	}
	public void setUpper(int upper) {
		this.getUpper = upper;
	}
	public int getMiddle() {
		return middle;
	}
	public void setMiddle(int middle) {
		this.middle = middle;
	}
	public int getRac() {
		return rac;
	}
	public void setRac(int rac) {
		this.rac = rac;
	}
	public int getWaitList() {
		return waitList;
	}
	public void setWaitList(int waitList) {
		this.waitList = waitList;
	}
}