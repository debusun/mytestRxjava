package com.mytestrxjava.activity.base;

/**
 * Created by Yomoo on 2017/8/29.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.ViewGroup;
import android.view.Window;

import com.mytestrxjava.utils.LogUtils;
import com.mytestrxjava.utils.SharePreferenceUtil;


public abstract class superActivity extends AppCompatActivity {

    protected boolean enableNightMode;
    private int width;
    private int height;
    private int statusBarHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableNightMode = SharePreferenceUtil.getBooleanSP("enableNightMode");
        if (!enableNightMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getContentViewId());
        LogUtils.eLog(this.getClass().getName() + "--->onCreate");
    }

    public abstract int getContentViewId();

    /**
     * If enabled night mode
     *
     * @return true or false
     */
    public boolean isEnableNightMode() {
        return enableNightMode;
    }

    /**
     * enable night mode or not
     *
     * @param enableNightMode true or false
     */
    public void setEnableNightMode(boolean enableNightMode, ViewGroup rootLayout) {
//        this.enableNightMode = enableNightMode;
//        if(enableNightMode) {
//            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//        } else {
//            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//        }
//        finish();
//        Intent mode = new Intent(this, SwitchModeActivity.class);
//        startActivity(mode);
//        overridePendingTransition( R.anim.switchmode_activity_in,R.anim.switchmode_activity_out);// 淡出淡入动画效果
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.eLog(this.getClass().getName() + "--->onDestroy");
    }
}