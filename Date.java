public class Date {

	int day;
	int month;
	int year;

	public void setYear (int year) {
		this.year =  year;
	}
	public int getYear(){
		return year;
	}
	public void setMonth(){
		this.month = month;
	}
	public int getMonth () {
		return month;
	}
	public void setDay () {
		this.day = day;
	}
	public int getDay() {
		return day;
	}

	public Date (int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean isSameYear(Date otherDate) {
		if(this.year == otherDate.getYear()){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSameMonth(Date otherDate) {
		if(this.month == otherDate.getMonth()){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isSameDay(Date otherDate) {
		if(this.day == otherDate.getDay()){
			return true;
		}
		else {
			return false;
		}
	}

	public void monthName () {

		switch (getMonth()) {
		case 1:
			System.out.println("Enero");	
			break;
	
		case 2:
			System.out.println("Febrero");
			break;	
	
		case 3:
			System.out.println("Marzo");
			break;

		case 4:
			System.out.println("Mayo");	
			break;
	
		case 5:
			System.out.println("Abril");
			break;	
	
		case 6:
			System.out.println("Junio");
			break;
	
		case 7:
			System.out.println("Julio");	
			break;
	
		case 8:
			System.out.println("Agosto");
			break;	
	
		case 9:
			System.out.println("Septiembre");
			break;
	
		case 10:
			System.out.println("Octubre");	
			break;
	
		case 11:
			System.out.println("Noviembre");
			break;	
	
		case 12:
			System.out.println("Deciembre");
			break;
		}	
	
	
}
	public void checkDay () {

		switch (getMonth()) {
			case 1:			
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("El mes " + getMonth() + " tiene 31 dias");
				break;
			case 2:
				System.out.println("El mes " + getMonth() + " tiene 28 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("El mes " + getMonth() + " tiene 30 dias");
				break;

		}
	}

	public void printSeason() {

		switch (getMonth()) {
			case 1:
			case 11:
			case 12:
				System.out.println("La temporada es invierno");
				break;
			case 2:
			case 3:
			case 4:
				System.out.println("La temporada es primavera");
				break;
			case 5:
			case 6:
			case 7:
				System.out.println("La temporada es verano");
				break;
			case 8:
			case 9:
			case 10:
				System.out.println("La temporada es otoño");
				break;
				
		}
	}


	public void remainingMonths() {
		for (int i = 0; i < getMonth(); i++){
			System.out.println(i);

		}
	}

	public void remainingDays() {

		for (int i = 0; i < getDay(); i++){
			System.out.println(i);

		}

	}
	public void daysInMonth() {
		
		for (int i =0; i < getMonth(); i ++){
			if (getMonth() == 31){
			}
				System.out.println("Los meses son Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");

			if (getMonth() == 30){
				System.out.println("Los meses son Abril, Junio, Septiembre y Octubre");

			}
			else {
				System.out.println ("El mes es Febrero");
			}

		}
	}

	public void printDate() {
		System.out.println("The date is: " + getDay() + "/" +  getMonth() + "/" + getYear());

	}

}