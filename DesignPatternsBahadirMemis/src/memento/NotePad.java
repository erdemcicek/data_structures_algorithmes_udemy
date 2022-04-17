package memento;

public class NotePad {
	
	private String metin;
	
	public NotePad() {
		this.metin = "";
	}
	
	public NotePad(String metin) {
		this.metin = metin;
	}
	
	public void ekle(String eklenecekMetin) {
		metin = metin + eklenecekMetin;
	}
	
	// -------------------------------------------------------------------------
	// relation with NotePadMemento
	public NotePadMemento kaydet() {      // kaydederken
		return new NotePadMemento(metin);
	}
	
	// relation with NotePadMemento
	public void geriDon(NotePadMemento notePadMemento) { // eski haline donerken, son kaydi aliyor
		metin = notePadMemento.getMetin();
	}
	
	// -------------------------------------------------------------------------

	public void yazdir() {
		System.out.println(metin);
	}

}
