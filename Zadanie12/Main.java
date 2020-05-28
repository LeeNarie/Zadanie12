class Main {

static String convertArab(int number){
  if (number > 1000 || number<0)
  {return "неверное число";}
  else{
  int last = 2000;
  int numbers[]  = {1, 4, 5, 9, 10, 50, 100, 500, 1000 };
  String letters[]  = { "I", "IV", "V", "IX", "X", "L", "C", "D", "M"};
        String romanValue = "";
        int N = number;
        while ( N > 0 ){
        for (int i = 0; i < numbers.length; i++){
        if ( N < numbers[i] ){
        N -= numbers[i-1];
        romanValue += letters[i-1];
        break;
        }
        }
        }

        return romanValue;
    }
}

public static Boolean Palindrom(Integer c) {
  if (c > 999999 || c<1)
  {
    System.out.println("неверное число");
    return false;
  }
  else{
        String s = c.toString();
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}
  public static void main(String[] args) {
    System.out.println(convertArab(37));
    System.out.println(Palindrom(1221).toString());
  }
}