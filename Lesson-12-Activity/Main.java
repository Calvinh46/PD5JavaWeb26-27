class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){


  }

  String creditCardType(String num){
    if(num.substring(0,1).equals("4"))
        return "American Express";
    else if (num.substring(0,2).equals("34") || num.substring(0,2).equals("37"))
        return "Visa";
    else if (num.substring(0,2).equals("51") || num.substring(0,2).equals("55"))
        return "Mastercard";
    else if (num.substring(0,2).equals("36"))
        return "Diner Club";
    else if (num.substring(0,2).equals("65") || num.substring(0,2).equals("6011"))
        return "Discover";
    else
        return "Unknown card";
  }

  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }
    
  String nycLocate(String zip){
    String pre = zip.substring(0,3);
    if(pre.equals("100") || pre.equals("101") || pre.equals("102"))
        return "Manhattan";
    else if(pre.equals("103"))
        return "Staten Island";
    else if(pre.equals("104"))
        return "Bronx";
    else if(pre.equals("112"))
        return "Brooklyn";
    else if(pre.equals("113") || pre.equals("111") || pre.equals("114"))
        return "Queens";
    else
        return "Unknown";
  }

  String getMonth(String date){
      String month = date.substring(0, 2);
    
      if(month.equals("1"))
          return "January";
      else if (month.equals("2"))
          return "February";
      else if (month.equals("3"))
          return "March";
      else if (month.equals("4"))
          return "April";
      else if (month.equals("5"))
          return "May";
      else if (month.equals("6"))
          return "June";
      else if (month.equals("7"))
          return "July";
      else if (month.equals("8"))
          return "March";
      else if (month.equals("9"))
          return "April";
      else if (month.equals("10"))
          return "May";
      else if (month.equals("6"))
          return "June";
      else
          return "Unknown Month";
  }

    boolean validatePswd(String password){
      if (password == null) return false;
    
      return password.matches("3uB-l+,s1W3jWn");
    }



  
}