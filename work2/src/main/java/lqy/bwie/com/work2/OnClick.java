package lqy.bwie.com.work2;

import android.support.annotation.IdRes;
import android.view.View;

/**
 * author lim
 * email:lim@123.com
 * date 2019/2/13
 * desc:
 */
public @interface OnClick {
    @IdRes int[] value() default { View.NO_ID };
}
