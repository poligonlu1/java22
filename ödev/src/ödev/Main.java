package ödev;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 *  
		System.out.println("Merhaba Java");

		// variables
		int ogrenciSayisi = 12;
		String mesaj = "Öğrenci Sayısı : ";
		System.out.println(mesaj + ogrenciSayisi);

		// datatypes
		int sayi = 12;
		sayi = 13111;

		char karakter = 'A';

		boolean dogruMU = false;

		// condinations
		int sayi1 = 24;
		if (sayi1 < 20) {
			System.out.println("Sayı 20'den küçüktür");

		} else if (sayi1 == 20) {
			System.out.println("Sayı 20'ye eşittir");

		} else {
			System.out.println("Sayı 20'den büyüktür");
		}

		// recapDemo1
		int sayi_1 = 20;
		int sayi_2 = 25;
		int sayi_3 = 2;
		int enBuyuk = sayi_1;

		if (enBuyuk < sayi_2) {
			enBuyuk = sayi_2;

		}
		if (enBuyuk < sayi_3) {
			enBuyuk = sayi_3;

		}

		System.out.println("En büyük = :" + enBuyuk);

		// switch blokları
		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel : Geçitiniz");

			break;

		case 'B':
			System.out.println("Çok Güzel : Geçitiniz");

			break;

		case 'C':
			System.out.println("İyi  : Geçitiniz");

			break;

		case 'D':
			System.out.println("Fena Değil  : Geçitiniz");

			break;

		case 'F':
			System.out.println("Malesef Kaldınız");

			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}

		// loopDemo
		// For
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}
		System.out.println("For Döngüsü bitti");

		// While
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i += 2;

		}
		System.out.println("While Döngüsü Bitti");

		// Do-While Döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While Döngüsü Bitti");

		// array

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";

		for (int k = 0; k < ogrenciler.length; k++) {
			System.out.println(ogrenciler[k]);
		}

		System.out.println("----------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// recap Demo2
		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam : " + total);
		System.out.println("En büyük = " + max);

		// multi dimensional array demo
		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";

		for (int a = 0; a <= 2; a++) {
			System.out.println("----------");
			for (int b = 0; b <= 2; b++) {
				System.out.println(sehirler[a][b]);
			}
		}

		// String ifadeler
		String mesaj1 = "Bugün hava çok güzel.";
		System.out.println(mesaj1);

		System.out.println("Eleman sayısı : " + mesaj1.length());
		System.out.println("5. eleman : " + mesaj1.charAt(4));
		System.out.println(mesaj1.concat(" Yaşasın !"));
		System.out.println(mesaj1.startsWith("B"));
		System.out.println(mesaj1.startsWith("."));
		char[] karakterler = new char[5];
		mesaj1.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj1.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));

		System.out.println(mesaj1.replace(' ', '-'));
		System.out.println(mesaj1.substring(2, 5));

		for (String kelime : mesaj1.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj1.toLowerCase());
		System.out.println(mesaj1.toUpperCase());
		System.out.println(mesaj1.trim());
		
		*/
		
		
		//mini proje asal sayı hesaplama
		
		int number = 2;
		int remainder = number % 2;
		System.out.println(remainder);
		
		if (number == 1) {
			System.out.println("sayı asal değildir");
		}
		
		if (number < 1) {
			System.out.println("geçersiz sayı");
		}
		
		for (int i = 2 ; i <= number ; i++) {
			int kalan = number % i;
			if (kalan == 0) {
				System.out.println("sayı asal");
			
			}
			
		}
		
		// mini proje2 kalın sesli ve ince sesli harfler
		char harf = 'A';
		
		switch (harf) {
		
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
			default:
				System.out.println("İnce sesli haf");
				
		}
		
		//mini proje3 mükemmel sayı bulma
		int sayi = 27;
		int mük = 0;
		for (int i = 1 ; i <= sayi ; i++) {
			int kalan = sayi % i;
			if (kalan == 0) {
				mük = mük + i;
				
			}
		}
		if (mük == sayi) {
			System.out.println("sayı mükemmel sayıdır");
		}
		else {
			System.out.println("sayı mükemmel sayı değildir");
		}
		
		
		// mini proje4 arkadaş sayılar
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for (int i = 1; i < sayi1; i++) {
			if(sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		
		for (int i = 1; i < sayi2; i++) {
			if(sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}
		
		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Sayılar kardeş sayılardır");
		}
		
		// mini proje5 sayı bulma
		int [] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMı = false;
		
		for(int sayix : sayilar) {
			if(sayix == aranacak) {
				varMı = true;
				break;
			}
		}
		if (varMı) {
			System.out.println("sayı mevcuttur");
		}
		else {
			System.out.println("sayı mevcut değildir");
		}
		
		
		
		

	}

}
