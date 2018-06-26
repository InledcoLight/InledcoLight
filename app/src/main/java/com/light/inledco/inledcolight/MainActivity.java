package com.light.inledco.inledcolight;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.light.inledco.inledcolight.Activity.BaseActivity;
import com.light.inledco.inledcolight.Activity.ScanActivity;

public class MainActivity extends BaseActivity {
    private Toolbar mToolBar;
    private MenuItem mMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
        initEvent();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.scan_menu, menu);

        mMenuItem = menu.findItem(R.id.scan_button);
        mMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                StartScanActivity();

                return false;
            }
        });

        return true;
    }

    @Override
    protected void initView() {
        mToolBar = (Toolbar)findViewById(R.id.main_toolBar);

        setSupportActionBar(mToolBar);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData() {

    }

    private void StartScanActivity() {
        Intent intent = new Intent(this, ScanActivity.class);

        startActivity(intent);
    }
}
