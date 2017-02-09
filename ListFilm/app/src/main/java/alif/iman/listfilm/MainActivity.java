package alif.iman.listfilm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] filmTitles = {"The Thor", "Harry Potter", "Inception",
                                "Wolf of Wallstreet", "Django Unchained", "Titanic",
                                "Captain America","Doctor Strange", "X-Men Apocalypse",
                                "Shutter Island","Bleed For This","The Fault In Our Stars"};

    private ArrayList<Movie> movies = new ArrayList<>();
    private void initMovies(){
        movies.add(new Movie("The Thor","Film tentang dewa yg menjadi superhero dan membawa palu haha",7.5,2009));
        movies.add(new Movie("Harry Potter","Film tentang penyihir berkacamata bulat",6.5,2007));
        movies.add(new Movie("Captain America","Film tentang prajurit Amerika yg membawa perisai seperti wajan",7.5,2011));
        movies.add(new Movie("Titanic","Film tentang cinta ketika Jack & Rose naik kapal bernama Titanic dari Inggris ke America",9.5,1997));
        movies.add(new Movie("The Fault In Our Stars","Film tentang kisah penderita kanker yg menjalani hidup sebelum selama dia dead",8.5,2013));
        movies.add(new Movie("Bleed For This","Film tentang petinju yg rela berdarah demi karir tinjunya",8.5,2017));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initMovies();
        ArrayAdapter<Movie> adapter = new ArrayAdapter<Movie>(this,
                android.R.layout.simple_list_item_1, movies);
        ListView listView = (ListView) findViewById(R.id.list_film);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie selectedMovie = movies.get(position);
                Intent intent = new Intent(getBaseContext(), DetailActivity.class);
                intent.putExtra("alif.iman.listfilm", selectedMovie);
                startActivity(intent);
            }
        });
    }
}
