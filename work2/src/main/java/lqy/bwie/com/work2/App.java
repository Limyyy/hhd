package lqy.bwie.com.work2;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * author lim
 * email:lim@123.com
 * date 2019/2/13
 * desc:
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
