class Main{

	public static void main(String[] args) {
    	(new Main()).init();
	}


	void init(){
		
		System.out.println("enter grade1");
		double grade1 = Input.readDouble();
		System.out.println("enter grade2");
		double grade2 = Input.readDouble();
		System.out.println("enter grade3");
		double grade3 = Input.readDouble();

		System.out.println("enter credits");
		int credits = Input.readInt();
		System.out.println("enter gradelevel");
		int gradelevel = Input.readInt();

		System.out.println("enter weight");
		double weight = Input.readDouble();
		System.out.println("enter height");
		double height = Input.readDouble();

		System.out.println("enter pounds");
		double pounds = Input.readDouble();

		System.out.println("enter THz");
		double THz = Input.readDouble();


	
	
	}
	
    double gradepointavg(double grade1, double grade2, double grade3){
		double gpa = (grade1+grade2+grade3) /3.0;
		if(gpa>=90)
			return gpa * 1.1;
		else
			return gpa;
		}
	

	boolean isgraduating(int credits, int gradelevel){
        if(gradelevel >= 12 && credits >= 44)
			return true;
		else
			return false;
		}

	String bmi(double weight, double height){
		double bmi = weight / (height * height);
		if(bmi <= 18.4)
			return "Underweight";
		else if(bmi >= 18.5 && bmi >= 24.9)
			return "Normal";
		else if(bmi >= 25.0 && bmi >= 39.9)
			return "Overweight";
		else if(bmi >= 40)
			return "Obese";
		else
			return "Underweight";
	}

	double shippingcost(double pounds){
		if(pounds <= 10)
			return 0.00;
		else if(pounds >=10 && pounds <= 15)
			return 5.00;
		else if(pounds >=15 && pounds <=25)
			return 10.00;
		else if(pounds >=25)
			return 10.02;
		else
			return 0.00;
	}

	String blueOrviolet(double THz){
		if(THz >= 600 && THz <= 670)
			return "blue Frequence";
		else if(THz >=700 && THz >=750)
			return  "purple Frequence";
		else
			return "false";

	}

}
	
		

  
