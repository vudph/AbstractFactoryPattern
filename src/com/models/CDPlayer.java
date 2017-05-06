package com.models;

public class CDPlayer implements Player {

	@Override
	public void play(Media m) {
		System.out.println("Playing " + m.getName() + " on a CD player");
	}

}
