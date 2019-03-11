import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

class TestObject {
    public String name;

    public TestObject() {
    }

    public TestObject(String name) {
        this.name = name;
    }
}

class Test extends TestObject {
    public int age;

    public Test(String name, int age) {
        super(name);
        this.age = age;
    }

    public String show() {
        return "Test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}


public class Main {

    public static strictfp void main(String[] args) throws Exception{
        ArrayList<Object> list = new ArrayList<>();
        list.ensureCapacity(10);
        Test test = new Test("wt", 22);
        TestObject testObject = test;
        Field[] fields = testObject.getClass().getFields();
        Method[] methods = testObject.getClass().getDeclaredMethods();
        Constructor[] constructors = testObject.getClass().getConstructors();
        Field field = testObject.getClass().getField("age");
        int age = field.getInt(testObject);
        System.out.println(age);
    }
}
