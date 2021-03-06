package com.wufq.discmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wufq.discmenu.service.StartDiscMenuService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button startBtn,stopBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        startBtn = (Button) findViewById(R.id.btn_start_pieMenu);
        stopBtn = (Button) findViewById(R.id.btn_stop_pieMenu);
        startBtn.setOnClickListener(this);
        stopBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_start_pieMenu:
                Intent intent = new Intent(this, StartDiscMenuService.class);
                startService(intent);
                break;
            case R.id.btn_stop_pieMenu:
                Intent it = new Intent(this, StartDiscMenuService.class);
                stopService(it);
                break;
        }
    }
}
