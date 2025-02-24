package bill.edu.ex5_addsubmuldiv_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSoA;
    EditText editTextSoB;
    EditText editTextSoKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    void TimDieuKhien(){
        editTextSoA = (EditText) findViewById(R.id.edt1);
        editTextSoB = (EditText) findViewById(R.id.edt2);
        editTextSoKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.BtnCONG);
        nutTru = (Button) findViewById(R.id.BtnTRU);
        nutNhan = (Button) findViewById(R.id.BtnNHAN);
        nutChia = (Button) findViewById(R.id.BtnCHIA);
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
        //Gắn bộ lắng nghe và sự kiện, sau đ code xử lí cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xử lí Cộng
                //LAY DU LIEU VE

                String strA = editTextSoA.getText().toString();
                String strB = editTextSoB.getText().toString();

                //CHUYEN DU LIEU SANG DANG SO

                float So_A = Float.parseFloat(strA);
                float So_B = Float.parseFloat(strB);

                //TINH TOAN THEO YEU CAU

                float Total = So_A + So_B;
                //Hien ra man hinh ket qua
                //CHUYEN SANG DANG CHUOI
                String ChuoiKQ = String.valueOf(Total);
                //Hien ra man hinh ket qua
                editTextSoKQ.setText(ChuoiKQ);

            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strA = editTextSoA.getText().toString();
                String strB = editTextSoB.getText().toString();

                //CHUYEN DU LIEU SANG DANG SO

                float So_A = Float.parseFloat(strA);
                float So_B = Float.parseFloat(strB);

                //TINH TOAN THEO YEU CAU

                float Total = So_A - So_B;

                //Hien ra man hinh ket qua

                //CHUYEN SANG DANG CHUOI
                String ChuoiKQ = String.valueOf(Total);
                //Hien ra man hinh ket qua
                editTextSoKQ.setText(ChuoiKQ);
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //LAY DU LIEU VE

                String strA = editTextSoA.getText().toString();
                String strB = editTextSoB.getText().toString();

                //CHUYEN DU LIEU SANG DANG SO

                float So_A = Float.parseFloat(strA);
                float So_B = Float.parseFloat(strB);

                //TINH TOAN THEO YEU CAU

                float Tich = So_A * So_B;
                //Hien ra man hinh ket qua

                //CHUYEN SANG DANG CHUOI
                String ChuoiKQ = String.valueOf(Tich);
                //Hien ra man hinh ket qua
                editTextSoKQ.setText(ChuoiKQ);
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //LAY DU LIEU VE

                String strA = editTextSoA.getText().toString();
                String strB = editTextSoB.getText().toString();

                //CHUYEN DU LIEU SANG DANG SO

                float So_A = Float.parseFloat(strA);
                float So_B = Float.parseFloat(strB);

                //TINH TOAN THEO YEU CAU

                float Total = So_A / So_B;

                //CHUYEN SANG DANG CHUOI
                String ChuoiKQ = String.valueOf(Total);
                //Hien ra man hinh ket qua
                editTextSoKQ.setText(ChuoiKQ);
            }
        });
    }

    //XuliCong
    public void XuLiCong (View view){
    }
    //XuLiTru
    public void XuLiTru(View view){
    }
    //XuLiNhan
    public void XuLiNhan(View view){
    }

}