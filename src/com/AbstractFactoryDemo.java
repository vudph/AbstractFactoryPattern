package com;

import com.factories.AbstractMusicFactory;
import com.factories.AnalogMusicFactory;
import com.factories.DigitalMusicFactory;
import com.models.Media;
import com.models.Player;

public class AbstractFactoryDemo {

	private static void listenToMusic(AbstractMusicFactory factory) {
		Media media = factory.createMedia();
		Player player = factory.createPlayer();
		player.play(media);
	}
	
	public static void main(String[] args) {
		AbstractFactoryDemo.listenToMusic(new DigitalMusicFactory());
		AbstractFactoryDemo.listenToMusic(new AnalogMusicFactory());
	}

}
