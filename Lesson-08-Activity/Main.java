class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	public static void print(String s){
	 	System.out.println(s);
  	}

	public static double FtoC(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

	public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

	public static double coneVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

	public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
  void init(){
    
	print("Testing print function");



  }

  
 
}