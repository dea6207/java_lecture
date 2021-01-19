package com.urdomain.ch08;

public class SmartTelevision {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			if(volume<RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			} else if(volume<RemoteControl.MIN_VOLUME)
		}
	}
}
