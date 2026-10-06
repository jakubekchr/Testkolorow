package com.example.polska;

import static android.view.View.INVISIBLE;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private  int licznikklikniec = 0;
    private TextView pytanie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        pytanie = findViewById(R.id.textviewpyt);
    }

    public void sprawdzOK(View view) {
        Toast.makeText(this, "Ten kolor nalezy do flagi Polski", Toast.LENGTH_SHORT).show();
    }

    public void ukryj(View view) {
        licznikklikniec++;
        view.setVisibility(INVISIBLE);
        if (licznikklikniec == 4) {
            pytanie.setText("Wygrales");
        }
    }
}