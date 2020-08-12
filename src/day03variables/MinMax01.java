package day03variables;

public class MinMax01 {

	public static void main(String[] args) {
		// Primitive data type'larin max ve min degerlerini bulmak
		
		//1. int min ve max deger bul
		int minValueInt = Integer.MIN_VALUE;
		System.out.println(minValueInt);//-2147483648
		
		int maxValueInt = Integer.MAX_VALUE;
		System.out.println(maxValueInt);//2147483647
		
		//2. byte min ve max degerlerini bul
		byte minValueByte = Byte.MIN_VALUE;
		System.out.println(minValueByte);//-128
		
		byte maxValueByte = Byte.MAX_VALUE;
		System.out.println(maxValueByte);//127
		
		//3. float min ve max degerlerini bul
		float minValueFloat = Float.MIN_VALUE;
		System.out.println(minValueFloat);//1.4E-45
		
		float maxValueFloat = Float.MAX_VALUE;
		System.out.println(maxValueFloat);//3.4028235E38
		
	//short, long, double in min ve max degerlerini bulunuz

		short minValueShort = Short.MIN_VALUE;
		System.out.println(minValueShort);// -32768
		
		short maxValueShort = Short.MAX_VALUE;
		System.out.println(maxValueShort);// 32767
		
		long minValueLong = Long.MIN_VALUE;
		System.out.println(minValueLong);// -9223372036854775808
		
		long maxValueLong = Long.MAX_VALUE;
		System.out.println(maxValueLong);//  9223372036854775807
		
		double minValueDouble = Double.MIN_VALUE;
		System.out.println(minValueDouble);// 4.9E-324
		
		double maxValueDouble = Double.MAX_VALUE;
		System.out.println(maxValueDouble);// 1.7976931348623157E308
		
		 
	}

}
