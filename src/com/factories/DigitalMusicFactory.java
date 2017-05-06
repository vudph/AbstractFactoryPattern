package com.factories;

import com.models.Album;
import com.models.Media;
import com.models.Player;
import com.models.RecordPlayer;

public class DigitalMusicFactory implements AbstractMusicFactory {

	@Override
	public Media createMedia() {
		return new Album();
	}

	@Override
	public Player createPlayer() {
		return new RecordPlayer();
	}

}
