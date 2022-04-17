package memento;

import java.util.ArrayList;
import java.util.List;

public class Hafiza {

	private List<NotePadMemento> listNotePadMemento;
	
	public Hafiza() {
		listNotePadMemento = new ArrayList<>();
	}
	
	public void ekle(NotePadMemento notePadMemento) {
		listNotePadMemento.add(notePadMemento);
	}
	
	public NotePadMemento sonVersiyonuGetir() {
		if(!listNotePadMemento.isEmpty()) {
			int lastIndex = listNotePadMemento.size()-1;
			NotePadMemento sonVersiyon = listNotePadMemento.get(lastIndex);
			
			listNotePadMemento.remove(sonVersiyon);
			return sonVersiyon;
		} else {
			throw new ArrayIndexOutOfBoundsException("Yuklu versiyon bulunamadi");
		}
	}
}
