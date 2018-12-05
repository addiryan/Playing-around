public class Person {

  private String firstName, lastName;
  private int age, height, weight;
  private String origin;

  public static class Builder {

    private String firstName, lastName;
    private int age, height, weight;
    private String origin;

    public Builder(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public Builder withAge(int age){
      this.age = age;

      return this;
    }

    public Builder withHeight(int height){
      this.height = height;

      return this;
    }

    public Builder withWeight(int weight){
      this.weight = weight;

      return this;
    }
    public Builder withOrigin(String origin){
      this.origin = origin;

      return this;
    }

    public Person register(){
      Person person = new Person();
      person.age = this.age;
      person.firstName = this.firstName;
      person.lastName = this.lastName;
      person.height = this.height;
      person.weight = this.weight;
      person.origin = this.origin;

      return person;

    }

  }


  private Person() {
  }


  public static void main(String args[]) {
      //Register new person
      Person Adrian = new Person.Builder("Adrian", "Ribe")
                      .withAge(23)
                      .withHeight(178)
                      .withWeight(76)
                      .withOrigin("Norway")
                      .register();

      System.out.println(Adrian.age);
  }
      //Print stats about person
      //System.out.printf("%s %s: %d %d %d\n", Adrian.firstName, Adrian.lastName, Adrian.age, Adrian.height, Adrian.weight);







}
