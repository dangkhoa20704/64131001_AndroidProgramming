package bill.edu.sinhsongaunhien;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText soA, soB, ketqua;
    Button kiemtra;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    void TimDieuKhien(){
        soA = findViewById(R.id.editSoA);
        soB = findViewById(R.id.editSoB);
        ketqua = findViewById(R.id.editkq);
        kiemtra = findViewById(R.id.btnktra);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }
    void SinhSoNgauNhien(){
        int a = (int) (Math.random() * 5)+1;
        int b = (int) (Math.random() * 5)+1;
        soA.setText(String.valueOf(a));
        soB.setText(String.valueOf(b));
    }

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
        TimDieuKhien();
        SinhSoNgauNhien();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua.setText("9");
            }
        });
        kiemtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                int kiemtrakq = Integer.parseInt(ketqua.getText().toString());
                int kqdung = a + b;
                if(kqdung == kiemtrakq){
                    Toast.makeText(MainActivity.this,"Ket qua dung!",Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(MainActivity.this,"Ket qua sai!",Toast.LENGTH_SHORT).show();
                }
                SinhSoNgauNhien();
            }
        });
    }
}