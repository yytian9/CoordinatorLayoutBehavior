package com.sky.coordinatorlayoutbehavior;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * @创建者 yytian
 * @创建时间 2016/3/8 0:18
 * @描述
 * @更新人 yytian
 * @更新时间 2016/3/8 0:18
 * @更新描述
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // No Titlebar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.acitvity_main);
    }
}
