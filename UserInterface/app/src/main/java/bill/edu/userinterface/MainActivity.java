package bill.edu.userinterface;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn_nav), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bottomNavigationView = findViewById(R.id.btn_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int mnuItemDuoChon = item.getItemId();
                if(mnuItemDuoChon == R.id.mnu_home)
                    //Thay fargment
                    Toast.makeText(MainActivity.this, "Thay Home",Toast.LENGTH_SHORT).show();
                else if (mnuItemDuoChon == R.id.mnu_search){
                    Toast.makeText(MainActivity.this, "Thay Sreach",Toast.LENGTH_SHORT).show();
                }
                else if (mnuItemDuoChon == R.id.nmu_profile){
                    Toast.makeText(MainActivity.this, "Thay Profile",Toast.LENGTH_SHORT).show();
                }
                else
                    return false;
                return true;
            }
        });
    }
}