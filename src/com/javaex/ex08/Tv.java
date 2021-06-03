package com.javaex.ex08;

public class Tv {
	
	private int channel;
	private int volume;
	private boolean power;
	
		
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		
	}
	
	public Tv() {}
	
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on) {
		if(on==true) {
			this.power = true; 
		} else {
			this.power =false;
		}
		
	}
		
	public void channel(int channel) {
		if (channel<1) {
			this.channel =1;
		} else if(channel>255) {
			this.channel = 255;
		} else {
		this.channel=channel;
		}
	}
	
	public void channel(boolean up) {
		if(up==true) {
			this.channel = channel+1;
		} else {
			this.channel = channel-1;
		} 
	}
	
	
	public void volume(int volume ) {
		if(volume<0) {
			this.volume = 0;
		} else if(volume>100) {
			this.volume = 100;
		} else {
			this.volume = volume;
		}
	}
	
	public void volume(boolean up) {
		if(up==true) {
			this.volume = volume+1;
		} else {
			this.volume = volume-1;
		} 
	}
	
	public void status() {
		System.out.println("===============================================");
		System.out.print("TV CHANNEL :  "+ channel);
		System.out.print("\tTV VOLUME: "+ volume);
		System.out.println("\tTV POWER: "+ power);
		System.out.println("===============================================");
	}
	
	
	
	
}
