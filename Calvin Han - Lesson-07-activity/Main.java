
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
    System.out.println("Enter X");
    double x = Input.readDouble();
    double y = Math.pow(x,7);
    System.out.println(y);
/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
    System.out.println("Enter Z");
    double z = Input.readDouble();
    double q = Math.pow(z,3)+ 5;
    System.out.println(q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println("Enter T");
    System.out.println("Enter R");
    double t = Input.readDouble();
    double r = Input.readDouble();
    double s = Math.pow(t,5)*Math.pow((r + 2),4);
    System.out.println(s);
 

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println("Enter A");
    System.out.println("Enter B");
    double a = Input.readDouble();
    double b = Input.readDouble();
    double c = Math.sqrt(a + b);
    System.out.println(c);

/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    System.out.println("Enter x1");
    System.out.println("Enter x2");
    System.out.println("Enter y1");
    System.out.println("Enter y2");
    double x1 = Input.readDouble();
    double x2 = Input.readDouble();
    double y1 = Input.readDouble();
    double y2 = Input.readDouble();
    double d = Math.sqrt(Math.pow((x2 -  x1),2) + Math.pow((y2 - y1),2));
    System.out.println(d);



/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
    System.out.println("Enter deg");
    double deg = Input.readDouble();
    double g = Math.sin(deg);
    System.out.println(g);




/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
    System.out.println("Enter m");
    System.out.println("Enter n");
    double m = Input.readDouble();
    double n = Input.readDouble();
    double k = Math.pow(m,5) / Math.sqrt(n + 1);
    System.out.println(k);



/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/
    System.out.println("Enter a (w)");
    System.out.println("Enter b (e)");
    System.out.println("Enter c (p)");
    double w = Input.readDouble();
    double e = Input.readDouble();
    double p = Input.readDouble();
    double X = (-e + Math.sqrt(Math.pow(e,2)) - 4 * w * p) / (2 * w);
    double Y = (-e - Math.sqrt(Math.pow(e,2)) - 4 * w * p) / (2 * w);
    System.out.println(X);
    System.out.println(Y);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}