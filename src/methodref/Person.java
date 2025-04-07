package methodref;

public class Person {
    private String name;
    public Person(){
        this("Unkown");
    }
    public Person(String name){
        this.name = name;
    }

    public static String greeting(){
        return "Hello";
    }

    public static String greetingWith(String name){
        return "Hello" + name;
    }

    public String getName() {
        return name;
    }
    public String introduce(){
        return "I am " + name;
    }

    public String introduceWithNumber(int number){
        return "I am " + name + ", my number is " + number;
    }
}
