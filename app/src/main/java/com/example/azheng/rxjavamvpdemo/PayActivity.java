package com.example.azheng.rxjavamvpdemo;

import android.os.Bundle;

import com.example.azheng.rxjavamvpdemo.base.BaseMvpActivity;

public class PayActivity extends BaseMvpActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_pay;
    }

    @Override
    public void initView() {
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onError(Throwable throwable) {

    }
}
