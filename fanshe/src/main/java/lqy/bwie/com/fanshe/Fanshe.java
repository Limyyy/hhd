package lqy.bwie.com.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * author lim
 * email:lim@123.com
 * date 2019/2/13
 * desc:反射
 */
public class Fanshe {
    public static void main(String[] args){
       // Class.forName();

        try {
            Class<Presen> presenClass = Presen.class;
            Presen person = new Presen();
            Class<Presen> aClass1 = (Class<Presen>) person.getClass();

            Constructor<Presen> constructor2 = aClass1.getConstructor(String.class);
            constructor2.setAccessible(true);
            constructor2.newInstance("sfbsj");

            Constructor<Presen> constructor = presenClass.getConstructor(null);
            Presen presen = constructor.newInstance(null);
            presen.toString();

            Constructor<Presen> constructor1 = presenClass.getConstructor(String.class);
            Presen presen1 = constructor1.newInstance("呵呵哒");
            presen1.toString();

            Constructor<Presen> declaredConstructor = presenClass.getDeclaredConstructor(String.class,int.class);
            declaredConstructor.setAccessible(true);
            declaredConstructor.newInstance("总是",100);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
