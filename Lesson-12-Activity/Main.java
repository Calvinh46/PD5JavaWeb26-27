class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("enter Credit Card Number");
    String CreditCardType = Input.readString();
    System.out.println(CreditCardType);

    System.out.println("enter thd Word for Latin Root");
    String pigLatin = Input.readString();
    System.out.println(pigLatin);

    System.out.println("enter nyclocation number");
    String nyclocation = Input.readString();
    System.out.println(nyclocation);

    System.out.println("enter the Number of the Month ");
    String getMonth = Input.readString();
    System.out.println(getMonth);

    System.out.println("Enter Password");
    String ispasswordcorrect = Input.readString();
    System.out.println(ispasswordcorrect);


  }

  String CreditCardType(String cardNumber){
    if (cardNumber == null) return "Unknown";
    
    if (cardNumber.startsWith("4")) {
        return "Visa";
    } else if (cardNumber.startsWith("34") || cardNumber.startsWith("37")) {
        return "American Express";
    } else if (cardNumber.startsWith("36")) {
        return "Diners Club";
    } else if (cardNumber.startsWith("51") || cardNumber.startsWith("55")) {
        return "Mastercard";
    } else if (cardNumber.startsWith("6011") || cardNumber.startsWith("65")) {
        return "Discover";
    }
    
    return "Unknown";

  }

    String pigLatin(String word){
    if (word == null || word.isEmpty()) return word;
    
    return word.substring(1) + word.charAt(0) + "ay";
    }
    
    String nycLocate(String zipCode){
    if (zipCode == null || zipCode.length() < 3) return "Unknown";
    
    String prefix = zipCode.substring(0, 3);
    
    switch (prefix) {
        case "100": case "101": case "102":
            return "Manhattan";
        case "103":
            return "Staten Island";
        case "104":
            return "Bronx";
        case "112":
            return "Brooklyn";
        case "113": case "114": case "111":
            return "Queens";
        default:
            return "Unknown";
            
    }

  }

    String getMonth(String date){
    if (date == null || date.length() < 2) return "Unknown";
    
    String monthPart = date.substring(0, 2);
    
    switch (monthPart){
        case "01": return "January";
        case "02": return "February";
        case "03": return "March";
        case "04": return "April";
        case "05": return "May";
        case "06": return "June";
        case "07": return "July";
        case "08": return "August";
        case "09": return "September";
        case "10": return "October";
        case "11": return "November";
        case "12": return "December";
        default: return "Unknown";
    }
  }

    boolean validatePswd(String password){
      if (password == null) return false;
    
      return password.matches("3uB-l+,s1W3jWn");
    }



  
}