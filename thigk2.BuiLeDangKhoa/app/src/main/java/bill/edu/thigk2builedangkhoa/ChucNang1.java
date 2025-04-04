package bill.edu.thigk2builedangkhoa;

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

public class ChucNang1 extends AppCompatActivity {
    EditText thang, nam, kq;
    Button DungSai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        thang = findViewById(R.id.edtThang);
        nam = findViewById(R.id.edtNam);
        kq = findViewById(R.id.edtkq);
        DungSai = findViewById(R.id.btnDS);
        DungSai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strThang = thang.getText().toString().trim();
                String strNam = nam.getText().toString().trim();

                if (strThang.equals("4") && strNam.equals("1975")) {
                    kq.setText("Đúng");
                } else {
                    kq.setText("Sai");
                }
            }
        });
    }


}