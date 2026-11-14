class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  String allowance(){
    double penny = 1;
    print("enter the Number of Days");
    int days = 0;
    int count = Input.readInt();
    String build = "";
    for (int i=0; i <= count; i++){
      build += Math.pow(penny , 2);
      build += days ++;
    }
    return build;
  } 

  
  String addTwoNumbers (){
    String build = "";
    int n1 = randInt(0,10);
    int n2 = randInt(0,10);
    int total1 = n1 + n2;
    print ("Enter your First Number");
    int firstnumber = Input.readInt();
    print ("Enter your Second Number");
    int secondnumber = Input.readInt();
    int total2 = firstnumber + secondnumber;
    if(total1 == total2){
      build += "Correct!";
    }else{
      build += "Incorrect Game over! The answer was"+ total1 +"Your Answer: "+ total2;
    }
    return build;
  }
  
  String GreatCommonFactor(){
    String build = "";
    print("Enter Value1");
    int value1 = Input.readInt();
    print("Enter Value2");
    int value2 = Input.readInt();
    int GCF = value1 - value2;

    build += "The Greatest Common Factor is " +GCF;
    return build;
  }
  


  void init(){
    
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}