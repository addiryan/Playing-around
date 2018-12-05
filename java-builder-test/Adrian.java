public class Person {
   String first_name, last_name, hair_color;
   int age, height, weight;




   public Adrian (int age) {
     //This constructor takes in the age of Adrian
     System.out.println("Age of Adrian is: " + age);
   }

   public void setName(String name) {
     last_name = name;
   }

   public void getName() {
     System.out.println("Adrian's name is: " + last_name);
   }

   public static void main(String[] args) {
      // Prints "Hello, World" in the terminal window.

      Adrian AdrianRibe = new Adrian(23);
      Adrian Adrian

      AdrianRibe.setName("Adrian Ribe");
      AdrianRibe.getName();

      //Prøver også med en print
      System.out.println(AdrianRibe.adrianName);
   }
}
