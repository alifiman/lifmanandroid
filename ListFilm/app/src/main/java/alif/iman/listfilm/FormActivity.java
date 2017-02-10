package alif.iman.listfilm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String [] rating = {"5.5", "6.0", "6.5", "7.0", "7.5", "8.0", "8.5", "9.0", "9.5"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Spinner pilihrating = (Spinner) findViewById(R.id.pilihrating);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, rating);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pilihrating.setAdapter(adapter);
        }

      public void addFilm(View view){
          String title = ((EditText) findViewById(R.id.inpjudul)).getText().toString();
          int year = Integer.parseInt(((EditText) findViewById(R.id.year)).getText().toString());
          double rating = Double.parseDouble(((Spinner) findViewById(R.id.pilihrating)).getSelectedItem().toString());
          String description = ((EditText) findViewById(R.id.inpdeskripsi)).getText().toString();

          Movie movie = new Movie(title, description, rating, year);

          Intent intent = new Intent();
          intent.putExtra("filmlist.result", movie);
          setResult(Activity.RESULT_OK, intent);
          finish();

    }

    }

