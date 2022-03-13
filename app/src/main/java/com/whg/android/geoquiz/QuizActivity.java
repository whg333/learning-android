package com.whg.android.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity";

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_title);
        setContentView(R.layout.activity_quiz);
        Log.d(TAG, "onCreate...");

        mTrueButton = findViewById(R.id.true_button);
        mTrueButton.setOnClickListener((view)->{
            Toast toast = Toast.makeText(QuizActivity.this,
                    R.string.correct_toast, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        });

        mFalseButton = findViewById(R.id.false_button);
        mFalseButton.setOnClickListener((view)->{
            Toast toast =Toast.makeText(QuizActivity.this,
                    R.string.incorrect_toast, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        });
    }
}