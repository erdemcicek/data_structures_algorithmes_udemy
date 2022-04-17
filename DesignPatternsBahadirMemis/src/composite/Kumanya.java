package composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya implements Fiyatlanabilir {

	private String ad;
	private List<Urun> urunList;
	private List<Paket> paketList;
	
	public Kumanya(String ad) {
		this.ad = ad;
		this.urunList = new ArrayList<>();
		this.paketList = new ArrayList<>();
	}
	
	@Override
	public BigDecimal getFiyat() {
		
		BigDecimal toplamUrunFiyati = FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
		BigDecimal toplamPaketFiyati = FiyatHesaplamaUtil.getToplamPaketFiyati(paketList);
		
		BigDecimal nihaiToplam = toplamPaketFiyati.add(toplamUrunFiyati);
		
		return nihaiToplam;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public List<Urun> getUrunList() {
		return urunList;
	}

	public void setUrunList(List<Urun> urunList) {
		this.urunList = urunList;
	}

	public List<Paket> getPaketList() {
		return paketList;
	}

	public void setPaketList(List<Paket> paketList) {
		this.paketList = paketList;
	}
	
	
	
	
}
