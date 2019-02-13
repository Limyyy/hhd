package lqy.bwie.com.work2.butterknife;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * author lim
 * email:lim@123.com
 * date 2019/2/13
 * desc:
 */
public class Butterknife {
    public static void bind(Activity activity) {
        bindContentView(activity);
        try {
            bindViews(activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void bindViews(Activity activity) throws IllegalAccessException {
        Class<? extends Activity> aClass = activity.getClass();
        Field[] fields = aClass.getDeclaredFields();
        if (fields != null && fields.length > 0) {
            for (Field field : fields) {
                BindView annotation = field.getAnnotation(BindView.class);
                if(annotation != null){
                    View viewById = activity.findViewById(annotation.value());
                    field.setAccessible(true);
                    field.set(activity,viewById);
                }
            }
        }
    }

    private static void bindContentView(Activity activity) {

        try {
            Class<? extends Activity> aClass = activity.getClass();
            ContentView annotation = aClass.getAnnotation(ContentView.class);
            if (annotation != null) {
                int value = annotation.value();
                Method method = aClass.getMethod("setContentView", int.class);
                method.invoke(activity, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
