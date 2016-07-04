package cn.ben.softinputtest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.ben.softinputtest.R;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        View button1 = findViewById(R.id.button1);
        if (button1 != null) {
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }
}
