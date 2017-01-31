package lifmanandroid.javaclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String showString;
    public TextView showText;
    public Barang [] arrBarang = new Barang[10];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);


        showString = "Manipulasi Class Java Android";
        addSeparator();




        initBarang();
        showString += arrBarang[2].toString();
        addSeparator();
        showString += arrBarang[6].toString();
        addSeparator();
        showString += arrBarang[7].toString();
        addSeparator();
        showString += arrBarang[5].toString();
        addSeparator();
        showString += arrBarang[3].toString();
        addSeparator();
        showString += arrBarang[4].toString();
        addSeparator();
        showText.setText(showString);
    }

    public void addSeparator(){
        showString +="\n------------------------------------------------\n";
    }

    public void initBarang(){
        arrBarang[0] = new Barang("Laptop", 1 , 7000000);
        arrBarang[1] = new Barang("Printe", 1 , 70000);
        arrBarang[2] = new Barang("Mouse", 1 , 73000);
        arrBarang[3] = new Barang("Keyboard", 1 , 123000);
        arrBarang[4] = new Barang("CPU", 1 , 17000000);
        arrBarang[5] = new Barang("Flashdisk", 1 , 77000);
        arrBarang[6] = new Barang("Meja", 2 , 7000000);
        arrBarang[7] = new Barang("Lampu", 2 , 7000);
        arrBarang[8] = new Barang("AC", 1 , 7000000);
        arrBarang[9] = new Barang("Buku", 2 , 700000);

    }
}
