package lqy.bwie.com.work2.antation;

import java.lang.annotation.ElementType;
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
@Target(ElementType.PARAMETER)
public @interface Query {
    String value();
}
