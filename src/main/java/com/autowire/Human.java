package com.autowire;

public class Human {

	private Heart heart;

	public Human() {
	}

	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Calling Human construtor");
	}

	public void startPumping() {
		if (heart == null) {
			System.out.println("ÿou are dead");
		} else {
			heart.pump();
		}
	}

	public void setHeart(Heart heart) {
		System.out.println("Setter of Heart is calling.");
		this.heart = heart;
	}

}
