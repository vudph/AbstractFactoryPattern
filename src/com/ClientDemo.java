package com;

import com.factories.AbstractMusicFactory;
import com.factories.AnalogMusicFactory;
import com.factories.DigitalMusicFactory;
import com.models.Media;
import com.models.Player;

public class ClientDemo {

	private static void listenToMusic(AbstractMusicFactory factory) {
		Media media = factory.createMedia();
		Player player = factory.createPlayer();
		player.play(media);
	}
	
	public static void main(String[] args) {
		ClientDemo.listenToMusic(new DigitalMusicFactory());
		ClientDemo.listenToMusic(new AnalogMusicFactory());
	}

}
