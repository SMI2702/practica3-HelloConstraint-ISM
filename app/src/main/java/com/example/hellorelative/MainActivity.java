package com.example.hellorelative;

import android.content.pm.ActivityInfo; // Asegúrate de tener esta importación
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // Esto ahora debería funcionar

        // Inicializar el TextView
        mShowCount = (TextView) findViewById(R.id.show_count);

        // Botón TOAST
        Button buttonToast = findViewById(R.id.button_toast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast(v);
            }
        });

        // Botón COUNT
        Button buttonCount = findViewById(R.id.button_count);
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countUp(v);
            }
        });
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_button_toast, Toast.LENGTH_LONG);
        toast.show();
    }
}
