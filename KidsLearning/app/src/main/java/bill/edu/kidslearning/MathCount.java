package bill.edu.kidslearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MathCount extends AppCompatActivity {
    ImageButton Home;
    Button sai2, sai7, sai9, dung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_math_count);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Home = findViewById(R.id.btnHome);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(MathCount.this, MathsModel.class);
                startActivity(intentHome);
            }
        });
        sai2 = findViewById(R.id.btn2);
        sai9 = findViewById(R.id.btn9);
        sai7 = findViewById(R.id.btn7);
        dung = findViewById(R.id.btn6);
        dung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MathCount.this, "Đáp án đúng",Toast.LENGTH_LONG).show();
            }
        });
        sai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MathCount.this,"Đáp án sai",Toast.LENGTH_LONG).show();
            }
        });
        sai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MathCount.this,"Đáp án sai",Toast.LENGTH_LONG).show();
            }
        });
        sai9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MathCount.this,"Đáp án sai",Toast.LENGTH_LONG).show();
            }
        });
    }
}