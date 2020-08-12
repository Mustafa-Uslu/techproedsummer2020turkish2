package day11stringmethodsforloopdt;

public class StringMethods01 {

	public static void main(String[] args) {
		
// 11. startsWith() methodu ilk characteri kontrol eder.
				String a = "Hadi gidelim bu diyardan!"; 
				
				System.out.println(a.startsWith("H"));//true
				System.out.println(a.startsWith(""));//true
				System.out.println(a.startsWith("Hadi"));//true
				
				System.out.println(a.startsWith("g", 5));//true
				System.out.println(a.startsWith("i", 7));//false
				System.out.println(a.startsWith("", 6));//true
				
//12. indexOf() methodu ilk gorunumun indexini verir.
				// indexOf() methodunda hem String hem de char da kullanilabilir.
				System.out.println(a.indexOf("i"));//3
				System.out.println(a.indexOf('d'));//2
				//Birden fazla character kullanirsaniz Java ilk harfin index'ini return eder
				a.indexOf("deli");//7
				//Olmayan bir character icin indexOf() kullanirsaniz Java "-1" return eder
				System.out.println(a.indexOf("x"));//-1
				System.out.println(a.indexOf("diyer"));//-1
				System.out.println(a.indexOf('w'));//-1	
				
				System.out.println(a.indexOf("d", 4));//7
				System.out.println(a.indexOf("a", 9));//19
				System.out.println(a.indexOf('e', 8));//8
				
//13. lastIndexOf() methodu son gorunumun index'ini verir
				String b = "Java ah Java!";	
				System.out.println(b.lastIndexOf("v"));//10
				//Birden fazla character kullanirsaniz son gorunumu bulur onun icindeki
				//character'lerden ilkinin index'ini return eder.
				System.out.println(b.lastIndexOf("av"));//9
				
//14. substring() bir String'in belli bir bolumunu kesip almaya yarar (ONEMLI)
				String c = "Karakartal";
				//Sadece kartal kelimesini ekrana yazdirin
				System.out.println(c.substring(4));//kartal
				//Ekrana "arakartal" yazdirin
				System.out.println(c.substring(1));//arakartal
				//Ekrana "kar" yazdirin
				//substring() methodunda iki sayi kullanirsaniz ilk sayi dahil ikinci sayi haric olur
				System.out.println(c.substring(4, 7));//kar
				//substring() methodu ile ilk harfi almak icin substring(0, 1) yazariz
				System.out.println(c.substring(0, 1));//K
				//Baslangic ve bitis index'lerini ayni yaparsaniz hicbirsey almis olursunuz
				System.out.println(c.substring(2, 2));//""
				//subtring() methodunda baslangic index'i bitis index'inden buyuk olamaz.
				//Oyle yazarsaniz Run Time Error alirsiniz
				//System.out.println(c.substring(5, 3)); //RTError
				
//15. trim() methodu bir String'in bas ve son taraflarindaki space'leri siler. Dikkat
				//edin aradakileri degil sadece bas ve sondakileri siler.
				String d = "  Java iyidir   ";
				System.out.println(d.length());//16
				System.out.println(d.trim().length());//11
//Tekrar 
				String m="seni seviyorumm 1257 ?!@$_";
				String n="ask";
				String N="ASK";
				System.out.println(m.charAt(0)); //s
				System.out.println(m.charAt(5)); //s
				System.out.println(m.contains(m)); //T
				System.out.println(m.endsWith("@$_")); //T
				System.out.println(m.indexOf("y")); //9
				System.out.println(m.isEmpty()); //F
				System.out.println(m.lastIndexOf("sev")); //5
				System.out.println(m.length()); //26
				System.out.println(m.replace('s', 'b'));//beni beviyorumm 1257 ?!@$_
				System.out.println(m.startsWith("seni")); //T
				System.out.println(m.substring(0, 14)); //seni seviyorum
				System.out.println(m.toLowerCase());//seni seviyorumm 1257 ?!@$_
				System.out.println(m.toUpperCase());//SENI SEVIYORUMM 1257 ?!@$_
				System.out.println(m.trim());//seni seviyorumm 1257 ?!@$_
				System.out.println(m.valueOf('n'));//10
				System.out.println(m.split("m"));//[Ljava.lang.String;@15db9742
				System.out.println(m.valueOf(10));//10
				System.out.println(m.replace("eni", "ana"));//sana seviyorumm 1257 ?!@$_
				System.out.println(m.replaceAll("\\d", "*"));//seni seviyorumm **** ?!@$_
				System.out.println(m.replaceAll("\\D", "x"));//xxxxxxxxxxxxxxxx1257xxxxxx
				System.out.println(m.replaceAll("\\w", "*"));//**** ********** **** ?!@$*
				System.out.println(m.replaceAll("\\s", "@")); //seni@seviyorumm@1257@?!@$_
				System.out.println(m.replaceAll("\\S", "@")); //@@@@ @@@@@@@@@@ @@@@ @@@@@
				System.out.println(n.equals('N')); //F
				System.out.println(n.equalsIgnoreCase(N)); //T
				System.out.println(m.split(" ")); //[Ljava.lang.String;@6d06d69c
				System.out.println(n.concat(N));//askASK
				System.out.println(n.valueOf(N)); //ASK
	}

}
