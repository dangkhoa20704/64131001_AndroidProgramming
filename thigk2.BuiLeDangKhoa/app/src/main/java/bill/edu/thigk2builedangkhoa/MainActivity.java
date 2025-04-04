package bill.edu.thigk2builedangkhoa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button nut1, nut2,nut3,nut4;
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
        nut1 = findViewById(R.id.btn1);
        nut2 = findViewById(R.id.btn2);
        nut3 = findViewById(R.id.btn3);
        nut4 = findViewById(R.id.btn4);

        nut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intentnut1 = new Intent(MainActivity.this, ChucNang1.class);
                startActivity(Intentnut1);
            }
        });
        nut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intentnut2 = new Intent(MainActivity.this, ChucNang3.class);
                startActivity(Intentnut2);
            }
        });
        nut4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intentnut4 = new Intent(MainActivity.this, AboutMe.class);
                startActivity(Intentnut4);
            }
        });
    }
}