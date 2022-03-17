package ran.am.day4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner lv;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    CheckBox c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= findViewById(R.id.spinner);
        c=findViewById(R.id.checkBox);
        arrayList=new ArrayList();


        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");        arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");       arrayList.add("india");        arrayList.add("Georgia");        arrayList.add("USA");        arrayList.add("UK");

        arrayAdapter=new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,arrayList);
        lv.setAdapter(arrayAdapter);
      /*  lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "hi "+arrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });*/
        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "hi "+arrayList.get(position), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void chk(View view) {
        Toast.makeText(this, ""+c.isChecked(), Toast.LENGTH_SHORT).show();
    }
}