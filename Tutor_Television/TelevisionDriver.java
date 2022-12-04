package com.lemon.tutoringclasses;

import java.util.Scanner;

public class TelevisionDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		
		Television obj = new Television("Toshiba", 55);
		
	
		
		
		//showing size manufacture and switching power from off to on, while printing the result 
		System.out.println("A " + obj.getSCREEN_SIZE() + " inch " + obj.getMANUFACTURER() +" has been turned " + obj.setPowerOn() + ".");
		
		//showing channel and current volume 
		System.out.println("What channel do you want? ");
		obj.setChannel(input.nextInt());
		System.out.println("Channel:" +obj.getChannel() + " Volume:" + obj.getVolume());
		
		//decreasing the volume 
		System.out.println("Too loud! Decreasing the volume.");
		obj.decreaseVolume();
		obj.decreaseVolume();
		obj.decreaseVolume();
		obj.decreaseVolume();
		obj.decreaseVolume();
		
		//showing new values 
		System.out.println("Channel:" +obj.getChannel() + " Volume:" + obj.getVolume());
	
		
		
	
		//declaring new instance of television
		Television portable = new Television("Sharp", 19);
		
		
		System.out.println("A " + portable.getSCREEN_SIZE() + " inch " + portable.getMANUFACTURER() +" has been turned " + portable.setPowerOn() + ".");
		System.out.println("What channel do you want? "); 
		portable.setChannel(input.nextInt());
		
		///decreasing the volume 
		portable.decreaseVolume();
		portable.decreaseVolume();
		
		//showing new values 
				System.out.println("Channel:" +portable.getChannel() + " Volume:" + portable.getVolume());
		
		
	}
	
}
