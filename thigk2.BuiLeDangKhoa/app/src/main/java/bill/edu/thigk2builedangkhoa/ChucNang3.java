package bill.edu.thigk2builedangkhoa;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang3 extends AppCompatActivity {
    ListView list;
    ArrayList<String> ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        list = findViewById(R.id.list);
        ds = new ArrayList<String>();
        ds.add("Tiến về Sài Gòn");
        ds.add("Giải Phongs Miền Nam");
        ds.add("Đất Nước Trọn Niềm Vui");
        ds.add("Bài ca Thống Nhất");
        ds.add("Mùa xuân trên thành phố HCM");
        ds.add("Tôi yêu Việt Nam");

        ArrayAdapter<String> adapterDs;
        adapterDs = new ArrayAdapter<String>(ChucNang3.this, android.R.layout.simple_list_item_1, ds);
        list.setAdapter(adapterDs);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String danhsach = ds.get(position);

                Toast.makeText(ChucNang3.this,danhsach,Toast.LENGTH_SHORT).show();
            }
        });
    }
}