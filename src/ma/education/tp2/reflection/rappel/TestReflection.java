package ma.education.tp2.reflection.rappel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ResourceBundle;

public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {

        ResourceBundle rb = ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param");
        String value = rb.getString("keyClass1");
        Class c = Class.forName(value);
        Constructor[] constructors = c.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        Object o = constructors[0].newInstance(null);

    }


}
