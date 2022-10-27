package model;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ManualDB {
	public static ArrayList<Bookings> bookings = new ArrayList<Bookings>();
	public static Queue<Bookings> rac = new PriorityQueue<Bookings>();
	public static Queue<Bookings> waitList = new PriorityQueue<Bookings>();
}