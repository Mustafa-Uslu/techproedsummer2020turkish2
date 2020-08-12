package day25encapsulation;

public class E03 {


	private byte yas = 23;
	private float borc = 6500.0f;
	private String isim = "Kemal Dogru";
	private boolean zengin = true;

	public static void main(String[] args) {

	}

	public byte getYas() {
		return yas;
	}

	public void setYas(byte yas) {
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setBorc(float borc) {
		this.borc = borc;
	}

	//Java boolean'lar icin getter olustururken method ismini "is" ile baslatir.
	//Stter'larda set kullanmaya devam eder.
	public boolean isZengin() {
		return zengin;
	}

	public void setZengin(boolean zengin) {
		this.zengin = zengin;
		
		
		// TekrarHatirlatma: Encapsulation ile ilgili bilgiler
        /*
         * a) Encapsulation 'da private olan data'larin 
         degerlerini degistirmek icin setter methodu kullanilir.
         
         b) Encapsulation "data hiding"tir
         
         c) Encapsulation'da private olan data'lari okumak icin 
            getter methodlar kullanilir
            
         d) Encupsulation icin variable ve methodlar private olmalidir
         
         e) Getter ve Setter icin methodlar private olmalidir     
         */
//=======================================================
        //Getter Methodu ile ilgili bilgiler:
        
        /*
         a) Getter methodun Access Modifier'i "public" olmalidir.
         Cunku ona diger classlardan ulasilmasi gerekiyor
         
         b) Getter methodunun return type ile variable'in return type ayni olmalidir.
         
         c)Variable'in degerinin okunmasini  istemiyorsak getter method olusturmamaliyiz
         
          d)Getter method'unun ismi her zaman "get+variable ismi" seklinde yapilmalidir 
          ve CamelCase kuralina uymalidir. Sadece boolean larda variable'in ismini basina 
          "is" eklenir
          
          e) Getter methodlarda parametre kullanilmaz
          
          f)Getter method'larda method icerisinde "return" keyword kullanilmalidir
          
         */
        
//=======================================================
         //Setter Methodu ile ilgili bilgiler:
                
        /*
         a) Setter methodunun Access Modifier'i "public" olmalidir
         
         b) Setter methodunun return tyre her zaman void olmalidir
         
         c) Setter method'unun ismi her zaman "set+variable ismi" seklinde yapilmalidir 
          ve CamelCase kuralina uymalidir.
          
         d) Variable'in degerinin degistirilmasini istemiyorsak setter method olusturmamaliyiz 
         
         e) Setter methodlarda parametre kullanilir
         
         */

		}

}
