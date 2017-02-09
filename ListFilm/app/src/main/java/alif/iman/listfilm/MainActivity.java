package alif.iman.listfilm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String[] filmTitles = {"The Thor", "Harry Potter", "Inception",
                                "Wolf of Wallstreet", "Django Unchained", "Titanic",
                                "Captain America","Doctor Strange", "X-Men Apocalypse",
                                "Shutter Island","Bleed For This","The Fault In Our Stars"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, filmTitles);
        ListView listView = (ListView) findViewById(R.id.list_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
