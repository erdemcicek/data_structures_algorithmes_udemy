package bridge;

public class App {
	
	
	public static void main(String[] args) {
		Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
		telefon.muzikCal(new Muzik("Sezen Aksu - Gulumse", "Gulumse hadi gulumse"));
		
		System.out.println("===========================");
		
		Bilgisayar bilgisayar = new Bilgisayar(new Hoparlor(), new Spotify());
		bilgisayar.muzikCal(new Muzik("Mabel Matiz - Ya Bu Isler Ne", "Beni bos ver de ya bu isler ne aman aman"));
	}
	
	

}
