package com.models;

public class RecordPlayer implements Player {

	@Override
	public void play(Media m) {
		System.out.println("Playing " + m.getName() + " on a record player");
	}

}
