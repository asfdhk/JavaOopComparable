import java.util.Objects;

public class Cat implements Comparable<Cat> {
    private String name;
    private int age;

    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Cat o) {
        if(name.length()>o.getName().length()){
            return -1;
        }else if(name.length()<o.getName().length()){
            return 1;
        }
        return 0;
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

}
