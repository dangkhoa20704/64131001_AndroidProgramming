package bill.edu.recyclerview;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> listRecylerData;
    RecyclerView recyclerViewLandScape;
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
        //3
            listRecylerData = getDataForRecyclerView();
        //4
            recyclerViewLandScape = findViewById(R.id.recyclerLand);
        //5
            RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
            recyclerViewLandScape.setLayoutManager(layoutLinear);
            landScapeAdapter = new LandScapeAdapter(this, listRecylerData);
            recyclerViewLandScape.setAdapter(landScapeAdapter);
        }
    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        dsDuLieu.add(new LandScape("eiffel", "Tháp Eiffel"));
        dsDuLieu.add(new LandScape("LangBac", "Lăng Chủ Tịch Hồ Chí Minh"));
        dsDuLieu.add(new LandScape("BuckingHam", "Cung Điện BuckingHam"));
        return dsDuLieu;
    }

}