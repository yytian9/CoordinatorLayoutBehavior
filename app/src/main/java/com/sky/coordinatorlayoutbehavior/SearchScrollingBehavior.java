package com.sky.coordinatorlayoutbehavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @创建者 yytian
 * @创建时间 2016/3/7 23:55
 * @描述   用于实现仿百度搜索栏的behavior
 */
public class SearchScrollingBehavior extends CoordinatorLayout.Behavior {
    public SearchScrollingBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int nestedScrollAxes) {
        return true;//这里返回true，才会接受到后续滑动事件。
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        //进行滑动事件处理
        //TODO 明天的逻辑在这处理
        //1.向上滑动时，下面的搜索栏要跟着动，留下48dp,用于显示
        //2.向下滑动时，搜索栏再动态变化；

    }

    @Override
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, View child, View target, float velocityX, float velocityY, boolean consumed) {
        //当进行快速滑动
        return super.onNestedFling(coordinatorLayout, child, target, velocityX, velocityY, consumed);
    }

    /**这2个回调与View中的事件分发是一样的。所有Behavior能在子View之前收到
     * CoordinatorLayout的所有触摸事件。可以进行拦截，如果拦截事件将不会流
     * 经子View。因为这2个方法都是在CoordinatorLayout的回调中*/
    @Override
    public boolean onInterceptTouchEvent(CoordinatorLayout parent, View child, MotionEvent ev) {
        //TODO 如果上滑到48dp时，就把事件干掉，留下首行

        return super.onInterceptTouchEvent(parent, child, ev);
    }

    @Override
    public boolean onTouchEvent(CoordinatorLayout parent, View child, MotionEvent ev) {
        return super.onTouchEvent(parent, child, ev);
    }

}
