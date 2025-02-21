package bill.edu.ex2_linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }
    public void XuLiCong(View view){
        //Tim tham chieu den dieu khien

        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextSoKQ = findViewById(R.id.edtKQ);

        //LAY DU LIEU VE

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        //CHUYEN DU LIEU SANG DANG SO

        int So_A = Integer.parseInt(strA);
        int So_B = Integer.parseInt(strB);

        //TINH TOAN THEO YEU CAU

        int Total = So_A + So_B;
        String strTotal = String.valueOf(Total);//CHUYEN SANG DANG CHUOI

        //Hien ra man hinh ket qua

        editTextSoKQ.setText(strTotal);

    }
}