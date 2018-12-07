public class StringComparison{
  private String str1, str2;

  public StringComparison(String streng1, String streng2){
    this.str1 = streng1;
    this.str2 = streng2;
  }
  public Boolean checkStringsEqual(StringComparison inputObject){

    System.out.println("Str1 === "+inputObject.str1);
    System.out.println("Str2 === "+inputObject.str2);
    return inputObject.str1 == inputObject.str2;

  }

  public static void main(String args[]){
    StringComparison comparison  = new StringComparison("Adrian", "Hello");

    StringComparison test = new StringComparison("hello", "hello");

    System.out.println(comparison.checkStringsEqual(test));


  }
}
