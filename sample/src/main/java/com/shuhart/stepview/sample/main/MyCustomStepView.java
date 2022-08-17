package com.shuhart.stepview.sample.main;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.shuhart.stepview.StepView;
import com.shuhart.stepview.sample.R;

public class MyCustomStepView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_custom_step_view);
        final StepView stepView = findViewById(R.id.step_view_2);
        stepView.getState().nextStepCircleEnabled(true);
        findViewById(R.id.next_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stepView.go(4,true);
            }
        });
    }
}
