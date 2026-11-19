class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}


  void init(){
    //challenge1
      String[] friend = {"Akash","Alfred","Jeremiah","Jonathan","Levin","Ryan"};
      print(friend.length);
      print(friend[friend.length-1]);

      
    //challenge2
      Double[] c = {21.9, 32.1, 31.3, 28.7, 29.2};
      print(c[c.length-1]);

    }
  
  void Friendvalue(String[] friend){
    for(int x=0; x<=friend.length-1; x++){
      print(friend[x]);
    }
  }
  


  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}