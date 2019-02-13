package lqy.bwie.com.work2;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import lqy.bwie.com.work2.antation.MyAntation;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_circle)
    Button btnCircle;
    @BindView(R.id.btn_round)
    Button btnRound;
    @BindView(R.id.btn_bili)
    Button btnBili;
    @BindView(R.id.btn_gif)
    Button btnGif;
    @BindView(R.id.simple)
    SimpleDraweeView simple;
    @BindView(R.id.btn_zhu)
    Button btnZhu;
    @BindView(R.id.btn_list)
    Button btnList;
    private Uri mUri1;
    private Uri mUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mUri1 = Uri.parse("http://www.zhaoapi.cn/images/girl.gif");
        mUri = Uri.parse("http://www.zhaoapi.cn/images/quarter/ad1.png");
    }

    @OnClick({R.id.btn_circle, R.id.btn_round, R.id.btn_bili, R.id.btn_gif, R.id.btn_zhu, R.id.btn_list})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_circle :
                GenericDraweeHierarchy hierarchy1 = GenericDraweeHierarchyBuilder.newInstance(getResources())
                        .setRoundingParams(RoundingParams.asCircle())
                        .build();
                simple.setHierarchy(hierarchy1);
                controller();
                break;
            case R.id.btn_round :
                GenericDraweeHierarchy hierarchy = GenericDraweeHierarchyBuilder.newInstance(getResources())
                        .setRoundingParams(RoundingParams.fromCornersRadius(20))
                        .build();
                simple.setHierarchy(hierarchy);
                controller();
                break;
            case R.id.btn_bili :
                GenericDraweeHierarchy hierarchy2 = GenericDraweeHierarchyBuilder.newInstance(getResources())
                        .setDesiredAspectRatio(2.71f)
                        .build();
                simple.setHierarchy(hierarchy2);
                controller();
                break;
            case R.id.btn_gif :
                DraweeController build = Fresco.newDraweeControllerBuilder()
                        .setUri(mUri1)
                        .setAutoPlayAnimations(true)
                        .build();
                simple.setController(build);
                break;
            case R.id.btn_zhu :
                Class<User> userClass = User.class;
                MyAntation annotation = userClass.getAnnotation(MyAntation.class);
                if(annotation!=null){
                    Toast.makeText(this,annotation.name(),Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn_list :

                break;
        }
    }

    private void controller() {
        DraweeController draweeController = Fresco.newDraweeControllerBuilder()
                .setUri(mUri)
                .build();
        simple.setController(draweeController);
    }
}
