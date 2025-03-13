package bill.edu.listview;

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

public class MainActivity extends AppCompatActivity {
    ListView listViewNNLT;
    ArrayList<String> dsNgonNguLT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.listNNLT), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listViewNNLT = findViewById(R.id.listNNLT);
        //B1: Chuan bi danh sach hard-code
        dsNgonNguLT = new ArrayList<String>();
        dsNgonNguLT.add("Python");
        dsNgonNguLT.add("Php");
        dsNgonNguLT.add("HTML");

        //b2
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, dsNgonNguLT);
        listViewNNLT.setAdapter(adapterNNLT);

        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giaTriDuocChon = dsNgonNguLT.get(position);
                //Lam gi do voi gia tri thi tuy
                Toast.makeText(MainActivity.this, giaTriDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}