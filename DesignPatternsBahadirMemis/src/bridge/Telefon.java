package bridge;

public class Telefon extends MuzikCalabilenCihaz {

	public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
		super(sesCihazi, muzikCalar);
	}
	
	@Override
	public void muzikCal(Muzik muzik) {
		
		System.out.println("Telefon muzik caliyor");
		super.muzikCal(muzik);
	}
}
