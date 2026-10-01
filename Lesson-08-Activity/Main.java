class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	public static void print(String s){
	 	System.out.println(s);
  	}

	public static double FtoC(double fahrenheit) {
        return 5. / 9 * (fahrenheit - 32);
    }

	public static double sphereVolume(double radius) {
        return 4. / 3. * Math.PI * Math.pow(radius, 3);
    }

	public static double coneVolume(double radius, double height) {
        return 1. / 3. * Math.PI * Math.pow(radius, 2) * height;
    }

	public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
  void init(){
    
	System.out.println("Enter your name ");
	String name = Input.readString();
	print("Welcome "+name);

	System.out.println("Enter a temperature in fahrenheit");
	double F = Input.readDouble();
	print("Is "+FtoC(F)+" Celsius");

	System.out.println("Enter the Radius of the sphere");
	double rad = Input.readDouble();
	print("the volume of a sphere with a radius of "+rad+" has a volume of "+sphereVolume(rad));

	System.out.println("Enter the radius of the cone ");
	rad = Input.readDouble();
	System.out.println("Enter the height of the cone ");
	double height = Input.readDouble();
	print("The radius of the cone is "+rad+" the height of the cone is "+height);

	System.out.println("Enter the distance of x1 ");
	double x1 = Input.readDouble();
	System.out.println("Enter the distance of x2 ");
	double x2 = Input.readDouble();
	System.out.println("Enter the distance of y1 ");
	double y1 = Input.readDouble();	
	System.out.println("Enter the distance of y2 ");
	double y2 = Input.readDouble();
	print("The Distance of X & Y is ("+x1+" , "+x2+") & ("+y1+" , "+y2+")");
  }

  
 
}