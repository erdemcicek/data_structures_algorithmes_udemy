package bridge;

public class Bilgisayar extends MuzikCalabilenCihaz {
	
	public Bilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
		super(sesCihazi, muzikCalar);
	}
	
	@Override
	public void muzikCal(Muzik muzik) {
		
		System.out.println("Bilgisayar muzik caliyor");
		super.muzikCal(muzik);
	}

}
