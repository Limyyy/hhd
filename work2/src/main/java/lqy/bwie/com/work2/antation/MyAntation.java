package lqy.bwie.com.work2.antation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * author lim
 * email:lim@123.com
 * date 2019/2/13
 * desc:
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Documented
@Inherited
public @interface MyAntation {
   // String getName();
    String name() default "aa";
}
