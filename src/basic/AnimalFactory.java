package basic;

public class AnimalFactory {
    public static Object getClass(Class<? extends Animal> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}
