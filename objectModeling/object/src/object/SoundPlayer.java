package object;

public class SoundPlayer {
	private Sound sound;
	
	void setSound(Sound sound) {
		this.sound = sound;
	}
	
	void play() {
		sound.play();
	}
}
