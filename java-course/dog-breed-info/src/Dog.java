public class Dog {
    private String breed;
    private String size;
    private int age;
    private String color;

    public String getInfo() {
        return ("Breed is: "+breed+" Size is:" +size+" Age is:"+age+" color is: "+color);
    }

    public String getBreed() {
        return this.breed;
    }
    public String getSize() {
        return this.size;
    }
    public int getAge() {
        return this.age;
    }
    public String getColor() {
        return this.color;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Dog() {
        this.breed = "Unknown";
        this.size = "Unknown";
        this.age = 0;
        this.color = "Unknown";
    }

}