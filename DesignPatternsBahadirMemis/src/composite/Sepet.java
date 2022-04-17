package composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Sepet {

	private String ad;
	private List<Fiyatlanabilir> fiyatlanabilirList;

	
	public Sepet(String ad) {
		this.ad = ad;
		this.fiyatlanabilirList = new ArrayList<>();
	}
	
	public BigDecimal toplamOdenecekTutar() {
		BigDecimal toplamTutar = BigDecimal.ZERO;
		
		for(Fiyatlanabilir fiyatlanabilir: fiyatlanabilirList) {
			toplamTutar = toplamTutar.add(fiyatlanabilir.getFiyat());
		}
		
		return toplamTutar;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<Fiyatlanabilir> getFiyatlanabilirList() {
		return fiyatlanabilirList;
	}

	public void setFiyatlanabilirList(List<Fiyatlanabilir> fiyatlanabilirList) {
		this.fiyatlanabilirList = fiyatlanabilirList;
	}

	
	
}
