package composite;

import java.math.BigDecimal;

public class Urun implements Fiyatlanabilir {
	
	private String ad;
	private BigDecimal fiyat;

	@Override
	public BigDecimal getFiyat() {
		// TODO Auto-generated method stub
		return fiyat;
	}

	public Urun(String ad, BigDecimal fiyat) {
		this.ad = ad;
		this.fiyat = fiyat;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
	}

}
