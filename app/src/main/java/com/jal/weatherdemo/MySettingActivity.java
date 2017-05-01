package com.jal.weatherdemo;


import com.jal.base.BaseActivity;

/**
 * Created by Administrator on 2017/4/30.
 */
public class MySettingActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting;
    }

    @Override
    public boolean isOpenStatus() {
        return false;
    }
}
