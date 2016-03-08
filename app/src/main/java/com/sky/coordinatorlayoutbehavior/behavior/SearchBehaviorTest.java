package com.sky.coordinatorlayoutbehavior.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.sky.coordinatorlayoutbehavior.R;
import com.sky.coordinatorlayoutbehavior.utils.DensityUtil;

/**
 * @创建者 yytian
 * @创建时间 2016/3/8 23:35
 * @描述
 * @更新人 yytian
 * @更新时间 2016/3/8 23:35
 * @更新描述
 */
public class SearchBehaviorTest extends CoordinatorLayout.Behavior {
    private final Context mContext;

    public SearchBehaviorTest(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext=context;
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        return (nestedScrollAxes & ViewCompat.SCROLL_AXIS_VERTICAL) != 0 ;
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
        int bottomY = DensityUtil.px2dip(mContext, child.getBottom());

        if((bottomY>48 && dyConsumed>0 ) || (bottomY<180 && dyConsumed<0) ) {
            child.offsetTopAndBottom(-dyConsumed);
            target.offsetTopAndBottom(-dyConsumed);
            TextView search = (TextView) child.findViewById(R.id.search);
            search.setAlpha(0.1f);

            ImageView icon = (ImageView) child.findViewById(R.id.icon);
            icon.offsetTopAndBottom(dyConsumed);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(CoordinatorLayout parent, View child, MotionEvent ev) {

        return super.onInterceptTouchEvent(parent, child, ev);//默认是不拦截的

    }

}
