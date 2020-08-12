package day07ifelseifstatementdt;

import java.util.Scanner;

public class Odev07 {

	public static void main(String[] args) {
  //GUNUN ODULLU SORUSU :sonnenbrille://
		
		/*
		 kullanicidan bir yas aliniz
		 0 ve 0'dan kucuk ise "Boyle Bir Varlik Dunyada Yoktur" yazdirin.
		 0'dan buyuk 4'ten kucuk ise "Bebek"
		 4'ten buyul 15'ten kucuk ise "Cocuk"
		 15'ten buyuk 25'ten kucuk  ise "Genc" yazdirin
		 25'ten buyuk 40'tan kucuk ise  "Orta yasli" yazdirin
		 40'tan buyuk 55'ten kucuk ise  "Olgun"
		 55'ten buyuk 80'den kucuk ise  "Yasli"
		 80 ve sonrasi icin "bir Ayagi Cukurda" yazdirin
		 */
Scanner scan=new Scanner(System.in);
System.out.println("lutfen yasinizi giriniz");
int say = scan.nextInt();

if(say<=0)
	System.out.println("boyle bir varlik dunyada yoktur");
else if (say<4)
	System.out.println("yasiniz "+say+"\n"+"bebek"+" yastasiniz");

else if (say<15)
	System.out.println("yasiniz "+say+"\n"+"Cocuk"+" yastasiniz");
    
else if (say<25)
	System.out.println("yasiniz "+say+"\n"+" Genc"+" yastasiniz");
   
else if (say<40)
	System.out.println("yasiniz "+say+"\n"+"Orta Yasli"+" siniz");

else if (say<55)
	System.out.println("yasiniz "+say+"\n"+"olgun"+" yastasiniz");

else if (say<80)
	System.out.println("yasiniz "+say+"\n"+"Yasli"+" siniz");
		
else 
	System.out.println("yasiniz "+say+"\n"+"Cok Uzgunum "+"Bir ayaginiz cukurda");

scan.close();
		
	}

}
