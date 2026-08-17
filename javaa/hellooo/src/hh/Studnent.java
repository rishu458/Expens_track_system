package hh;

public class Studnent {

    String name;
    int age;
    String course;

    Studnent(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void displayDetails(){
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Course: " + course);
    }

}
