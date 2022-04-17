package proxy;

import java.math.BigDecimal;

public class App {
	
	public static void main(String[] args) {
		
		YoneticiProxy yoneticiProxy = new YoneticiProxy("erdem", "123");
		YoneticiProxy yoneticiYusuf = new YoneticiProxy("yusuf", "789");

		BigDecimal ciro;
		try {
			ciro = yoneticiProxy.getCiro();
			System.out.println("Sirket cirosu: " + ciro);
		} catch (IllegalAccessException e) {
			System.out.println("Hassas bilgilere erisiminiz yoktur");
		} 
		
		try {
			ciro = yoneticiYusuf.getCiro();
			System.out.println("Sirket cirosu: " + ciro);
		} catch (IllegalAccessException e) {
			System.out.println("Hassas bilgilere erisiminiz yoktur");
		} 
		
		
		
	}

}
