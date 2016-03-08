package com.sky.coordinatorlayoutbehavior.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * @创建者 yytian
 * @创建时间 2016/3/8 22:04
 * @描述
 * @更新人 yytian
 * @更新时间 2016/3/8 22:04
 * @更新描述
 */
public class TestScrollingBehavior extends CoordinatorLayout.Behavior {

    public TestScrollingBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        int offset = dependency.getTop() - child.getTop();
        ViewCompat.offsetTopAndBottom(child, offset);
        return true;
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof TextView;
    }
}
