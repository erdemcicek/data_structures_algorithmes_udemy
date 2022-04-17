package memento;

public class NotePadMemento {

	private String metin;
	
	public NotePadMemento() {
		this.metin = "";
	}
	
	public NotePadMemento(String metin) {
		this.metin = metin;
	}
	
	public String getMetin() {
		return metin;
	}
}
