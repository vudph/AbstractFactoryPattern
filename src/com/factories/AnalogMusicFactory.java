package com.factories;

import com.models.CD;
import com.models.CDPlayer;
import com.models.Media;
import com.models.Player;

public class AnalogMusicFactory implements AbstractMusicFactory {

	@Override
	public Media createMedia() {
		return new CD();
	}

	@Override
	public Player createPlayer() {
		return new CDPlayer();
	}

}
