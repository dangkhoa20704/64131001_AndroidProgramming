package ntu.ex7_intentlogin;

import android.content.Intent;
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

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnXacNhan = (Button) findViewById(R.id.btnOk);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Xu li dang nhap
                //LAY DU LIEU
                EditText edTenDN = (EditText) findViewById(R.id.edtName);
                EditText edPass = (EditText) findViewById(R.id.edtPass);
                EditText edEmail = (EditText) findViewById(R.id.edtEmail);
                //b2.Lay du lieu
                String tenDangNhap = edTenDN.getText().toString();
                String email = edEmail.getText().toString();
                String mk = edPass.getText().toString();
                //b3. Kiem tra mat khau
                if(tenDangNhap.equals("builedangkhoa") && mk.equals("Khoa20704") && email.equals("Khoa20704@gmail.com")){
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    //Goi du lieu vao iQuiz
                    iQuiz.putExtra("ten_dang_nhap",tenDangNhap);
                    iQuiz.putExtra("mk_dang_nhap",mk);
                    iQuiz.putExtra("email_dang_nhap",email);
                    //Gui di
                    startActivity(iQuiz);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Tên đăng nhập hoặc mật khẩu sai !",Toast.LENGTH_LONG);
                }
            }
        });
    }
}