package com.lemon.tutoringclasses;
//The purpose of this class is to model a Television
//Robert Tesoriero 12/3/2022
public class Television {

	//declaring class fields 
	 final String MANUFACTURER; 
	 final int SCREEN_SIZE;
	 boolean powerOn; 
	 int channel; 
	 int volume; 
	
	
	public Television(String manufacturer, int screenSize ) {
		
		//using a constructor to initialize the declared fields; 
		MANUFACTURER = manufacturer;
		SCREEN_SIZE = screenSize;
		powerOn = false; 
		channel = 56; 
		volume = 20; 
		
	}

//Getters and setters
	
	public boolean isPowerOn() {
		return powerOn;
	}

//swapping between on and off for power 
	public String setPowerOn() {
		this.powerOn = !powerOn;
		if (powerOn = true) {
			return "On";
		} else
		return "Off";
	}


	public int getChannel() {
		return channel;
	}


	public int setChannel(int channel) {
		this.channel = channel;
		
		return channel; 
	}


	public int getVolume() {
		return volume;
	}

//increasing the volume 
	public int increaseVolume() {
		this.volume = volume +1;
		return volume;
	}

	//decreasing the volume 
	public int decreaseVolume() {
		this.volume = volume -1;
		return volume;
	}
	

	public String getMANUFACTURER() {
		return MANUFACTURER;
	}


	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}
	
	
	
	
	
	
	
}
