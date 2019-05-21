package tranthanh.dmt.listviewcauthu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    cauthuAdapter adapter;
    ArrayList<cauthu> listcauthu;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapter=new cauthuAdapter(this,R.layout.dong_cauthu,listcauthu);
        listView.setAdapter(adapter);
    }
    void Anhxa(){
        listView=(ListView) findViewById(R.id.listcauthu);
        listcauthu=new ArrayList<>();
        listcauthu.add(new cauthu("C,Ronaldo","34","Tien dao cam","Bo Dao Nha",R.drawable.ronaldo));
        listcauthu.add(new cauthu("W.Rooney","32","Ho Ve Cong","Anh",R.drawable.rooney));
        listcauthu.add(new cauthu("Luiz","28","Hau Ve Trai","Anh",R.drawable.luiz));
        listcauthu.add(new cauthu("Nani","35","Tien dao Canh Phai","Bo Dao Nha",R.drawable.nani));
        listcauthu.add(new cauthu("L.messi","36","so 10","Arhentila",R.drawable.messi));
        listcauthu.add(new cauthu("D.Gea","29","Thu Mon","Tay Ban Nha",R.drawable.gea));
    }
}
