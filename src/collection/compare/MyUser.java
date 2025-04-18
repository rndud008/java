package collection.compare;

public class MyUser implements Comparable<MyUser>{
    private String id;
    private int age;

    public MyUser(String id,int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(MyUser o) {
        System.out.println(this + " vs " + o);
        // 오름차순
        return this.age < o.age ? -1 : (this.age == o.age ? 0 :1);
        // 내림차순
//        return (this.age < o.age ? -1 : (this.age == o.age ? 0 :1)) * -1;
    }
}
