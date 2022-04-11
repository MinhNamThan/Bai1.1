package com.example.HelloConstraint;

import static android.graphics.Color.parseColor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import HelloConstraint.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zeroColor = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mCount%2==0){
            zeroColor.setBackgroundTintList(ColorStateList.valueOf(parseColor("#DCDCDC")));
        }else{
            zeroColor.setBackgroundTintList(ColorStateList.valueOf(parseColor("#FF35B8")));
        }
    }

    public void toZero(View view) {
        mShowCount.setText("0");
        mCount = 0;
        zeroColor.setBackgroundTintList(ColorStateList.valueOf(parseColor("#DCDCDC")));
    }
}