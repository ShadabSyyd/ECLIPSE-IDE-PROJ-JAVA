package m01FOPWeek1LiveClass;

public class L10LeapYearBooleans {
	int year;
	public L10LeapYearBooleans(int year){
		this.year=year;
	}
	public void check(){
		boolean leapYear=false;
		boolean divisibleBy4=false;
		boolean centuryYear=false;
		String centuryYearDivBy400="N/A";
		
		if (year%4==0) {
			divisibleBy4=true;
			if (year%100==0) {
				centuryYear=true;
				
				if(year%400==0) {
					centuryYearDivBy400="true";
					leapYear=true;
				}else {
					centuryYearDivBy400="false";
					leapYear=false;
				}
			}else {
				centuryYear=false;
				leapYear=true;
			} 
		}else {
			divisibleBy4=false;
			leapYear=false;
			
		}
		String messageTemplate="For Year %d [Divisible By 4: %b, Century Year: %b"+
		", Century Year Divisible by 400: %s] ->Leap Year %b";
		
		String message=String.format(messageTemplate,year,divisibleBy4,centuryYear,centuryYearDivBy400,leapYear);
		System.out.println(message);
		System.out.println();
		
	}
	public static void main(String[] args) {
		L10LeapYearBooleans checker1=new L10LeapYearBooleans(2000);
		checker1.check();
		
		L10LeapYearBooleans checker2;
		checker2=new L10LeapYearBooleans(2300);
		checker2.check(); 
	}
}

//By Shunmuga Raja GLR Week 1 ECIT Live class: 02:10:00