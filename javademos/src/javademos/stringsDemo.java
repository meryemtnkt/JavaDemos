package javademos;

public class stringsDemo {

	public static void main(String[] args) {

		String mesaj="Bug?n Hava Ya???l? ...";		
		System.out.println(mesaj);
		
		System.out.println("Eleman say?s? :"+mesaj.length());
		
		System.out.println("5. Eleman : "+ mesaj.charAt(4));
		
		//mesaj sonuna kelime ekleme
		System.out.println(mesaj.concat("?z?c?"));
		
		// a ile mi  ba?l?yor
		System.out.println(mesaj.startsWith("a"));
		//. ile mi bitiyor
		System.out.println(mesaj.endsWith("."));
		
		//karakter aktarma
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
	
		//ilk buldu?u a da aramay? bitirir
		System.out.println(mesaj.indexOf('a'));
		
		//sondan aramaya ba?lar
		System.out.println(mesaj.lastIndexOf('a'));
		
		//karaktere de?i?tirme
		System.out.println(mesaj.replace(' ', '-'));
		
		//metinden par?a almak
		System.out.println(mesaj.substring(3,7));
		
		//bir metini belli bir karakter dizisine g?re ay?rmak
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		//b?t?n harfler k???k
		System.out.println(mesaj.toLowerCase());
		
		//b?t?n harfler b?y?k
		System.out.println(mesaj.toUpperCase());
		
		//ba??nda ve sonundaki  bo?luklar? atma
		System.out.println(mesaj.trim());
	}

}
