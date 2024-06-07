package object;

public class Main {
	public static void main(String[] args) {
		SoundPlayer sp = new SoundPlayer();
		sp.setSound(new Wav());
		sp.play();
		sp.setSound(new Mp3());
		sp.play();		
	}
}
