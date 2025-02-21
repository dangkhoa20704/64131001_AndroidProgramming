package bill.edu.ex4_addsubmuldiv_onclick;

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
        EditText editTextSoA = findViewById(R.id.edt1);
        EditText editTextSoB = findViewById(R.id.edt2);
        EditText editTextSoKQ = findViewById(R.id.edtKQ);
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
        TimDieuKhien();
    }

    //XuliCong
    public void XuLiCong (View v){
        //LAY DU LIEU VE

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        //CHUYEN DU LIEU SANG DANG SO

        float So_A = Float.parseFloat(strA);
        float So_B = Float.parseFloat(strB);

        //TINH TOAN THEO YEU CAU

        float Total = So_A + So_B;
        String strTotal = String.valueOf(Total);//CHUYEN SANG DANG CHUOI

        //Hien ra man hinh ket qua
        EditText editTextSoKQ = (EditText) findViewById(R.id.edtKQ);
        //CHUYEN SANG DANG CHUOI
        String ChuoiKQ = String.valueOf(Total);
        //Hien ra man hinh ket qua
        editTextSoKQ.setText(ChuoiKQ);

    }
    //XuLiTru
    public void XuLiTru(View v){
        //LAY DU LIEU VE

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        //CHUYEN DU LIEU SANG DANG SO

        float So_A = Float.parseFloat(strA);
        float So_B = Float.parseFloat(strB);

        //TINH TOAN THEO YEU CAU

        float Total = So_A - So_B;
        String strTotal = String.valueOf(Total);//CHUYEN SANG DANG CHUOI

        //Hien ra man hinh ket qua

        //CHUYEN SANG DANG CHUOI
        String ChuoiKQ = String.valueOf(Total);
        //Hien ra man hinh ket qua
        editTextSoKQ.setText(ChuoiKQ);
    }
    //XuLiNhan
    public void XuLiNhan(){
        //LAY DU LIEU VE

        String strA = editTextSoA.getText().toString();
        String strB = editTextSoB.getText().toString();

        //CHUYEN DU LIEU SANG DANG SO

        float So_A = Float.parseFloat(strA);
        float So_B = Float.parseFloat(strB);

        //TINH TOAN THEO YEU CAU

        float Total = So_A * So_B;
        String strTotal = String.valueOf(Total);//CHUYEN SANG DANG CHUOI

        //Hien ra man hinh ket qua

        //CHUYEN SANG DANG CHUOI
        String ChuoiKQ = String.valueOf(Total);
        //Hien ra man hinh ket qua
        editTextSoKQ.setText(ChuoiKQ);
    }
    //XuLiChia
    public void XuLiChia(){
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
}