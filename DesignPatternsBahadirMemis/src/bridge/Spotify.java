package bridge;

public class Spotify implements MuzikCalar {

	@Override
	public String muzikCal(Muzik muzik) {
		System.out.println("Spotify " + muzik + " sarkisini caliyor");
		return muzik.getSes();
	}

}
