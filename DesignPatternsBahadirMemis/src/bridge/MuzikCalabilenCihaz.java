package bridge;

public abstract class MuzikCalabilenCihaz {
	
	protected SesCihazi sesCihazi;
	protected MuzikCalar muzikCalar;
	
	public MuzikCalabilenCihaz(){
	}
	
	public MuzikCalabilenCihaz(SesCihazi sesCihazi, MuzikCalar muzikCalar ) {
		this.sesCihazi = sesCihazi;
		this.muzikCalar = muzikCalar;
	}
	
	public void muzikCal(Muzik muzik) {
		String ses = muzikCalar.muzikCal(muzik);
		sesCihazi.sesiCal(ses);
	}
	
	
	

}
