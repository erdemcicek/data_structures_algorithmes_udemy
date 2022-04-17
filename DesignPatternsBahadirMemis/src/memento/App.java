package memento;

public class App {
	
	public static void main(String[] args) {
		
		Hafiza hafiza = new Hafiza();
		
		NotePad notePad = new NotePad();
		notePad.ekle("erdem");
		
		versionKaydet(hafiza, notePad);
		
		
		notePad.ekle(" cicek");
		versionKaydet(hafiza, notePad);
		
		hataliNoktaKoy(notePad);
		
		geriAlipYazdir(hafiza, notePad);
		
		versionKaydet(hafiza, notePad);
		
		notePad.ekle(" paris");
		versionKaydet(hafiza, notePad);
		
		hataliNoktaKoy(notePad);
		
		geriAlipYazdir(hafiza, notePad);
		
		geriAlipYazdir(hafiza, notePad);

		geriAlipYazdir(hafiza, notePad);
		//geriAlipYazdir(hafiza, notePad);
		//geriAlipYazdir(hafiza, notePad);
		
	}

	private static void hataliNoktaKoy(NotePad notePad) {
		notePad.ekle(".");
		notePad.yazdir();
	}

	private static void geriAlipYazdir(Hafiza hafiza, NotePad notePad) {
		notePad.geriDon(hafiza.sonVersiyonuGetir());
		notePad.yazdir();
	}

	private static void versionKaydet(Hafiza hafiza, NotePad notePad) {
		NotePadMemento notePadMemento = notePad.kaydet();
		hafiza.ekle(notePadMemento);
		notePad.yazdir();
	}

}
