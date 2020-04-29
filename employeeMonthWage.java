	
	public static void main(String[] args){
		int IS_PRESENT=1;
		double wagePerHour=20;
		double fullDay=8;
		double halfDay=4;	
		double empWage;
		double monthDays=20;
		
		double rand=Math.floor(Math.random() * 10 ) %2;
		System.out.println("Welcome to the Employee Use Case problem");
		
		switch ((int) rand){
		case 1:
			int IS_FULLTIME=1;
			double fullTime=Math.floor(Math.random()*10)%2;
			double totalMonthWage;
			System.out.println("Employee is present");

			switch ((int) fullTime){
			case 1: empWage=wagePerHour*fullDay;
				totalMonthWage=empWage*monthDays;
				System.out.println("Employee works fulltime and Employee wage is: "+ empWage);
				System.out.println("Employee wage for a month is: "+ totalMonthWage);

			break;

			case 2: empWage=wagePerHour*halfDay;
				totalMonthWage=empWage*monthDays;
                                System.out.println("Employee works parttime and Employee wage is: "+ empWage);
				System.out.println("Employee wage for a month is: "+ totalMonthWage);
			break;
			}
		break;

		case 2:
			System.out.println("Employee is absent");
		}

	}
}
