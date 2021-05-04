package linerlayout.hrbeu.edu.linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_vertical);//垂直排列
        //setContentView(R.layout.main_horizontal);//水平排列
    }
}
