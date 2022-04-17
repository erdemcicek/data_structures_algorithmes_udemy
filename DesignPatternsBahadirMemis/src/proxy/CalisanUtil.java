package proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CalisanUtil {
	
	public static List<Calisan> getCalisanList(){
		Calisan erdem = new Calisan("erdem", "123", false);
		Calisan fatih = new Calisan("fatih", "456", false);
		Calisan yusuf = new Calisan("yusuf", "789", true);
		
		return new ArrayList<>(List.of(erdem, fatih, yusuf));
	}
	
	public static Map<String, Calisan> getKullaniciAdiCalisanMap(){
		
		List<Calisan> calisanList = getCalisanList();
		
		Map<String, Calisan> map = new LinkedHashMap<>();
		
		for(Calisan calisan: calisanList) {
			map.put(calisan.getKullaniciAdi(), calisan);
		}
		
		return map;
	}
	
	public static Calisan getCalisanByKullaniciAdi(String kullaniciAdi) {
		
		Map<String, Calisan> map = getKullaniciAdiCalisanMap();
		
		Calisan calisan =  map.get(kullaniciAdi);
		
		return calisan;
	}

	public static boolean isKullaniciValid(String kullaniciAdi, String sifre) {
		
		boolean isKullaniciValid = false;
		Calisan calisan = getCalisanByKullaniciAdi(kullaniciAdi);
		
		if(calisan != null) {
			isKullaniciValid = calisan.getSifre().equals(sifre);
			
		}
		return isKullaniciValid;
	}

}
