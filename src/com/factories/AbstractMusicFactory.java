package com.factories;

import com.models.Media;
import com.models.Player;

public interface AbstractMusicFactory {
	Media createMedia();
	Player createPlayer();
}
