package day1;

public class student{
    String name;
    int age;
    boolean Ismmale;

    public student(String name, int age, boolean ismmale) {
        this.name = name;
        this.age = age;
        Ismmale = ismmale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsmmale() {
        return Ismmale;
    }

    public void setIsmmale(boolean ismmale) {
        Ismmale = ismmale;
    }
}
