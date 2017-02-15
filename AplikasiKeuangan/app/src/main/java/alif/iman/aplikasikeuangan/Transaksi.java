package alif.iman.aplikasikeuangan;

import android.provider.BaseColumns;

import java.io.Serializable;

/**
 * Created by D2J-00 on 15/02/2017.
 */
public class Transaksi implements BaseColumns,Serializable {

    public String nama;
    public int jenis;
    public int jumlah;
    public String keterangan;

    public Transaksi(String nama, int jenis, int jumlah) {
        this.nama = nama;
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    public Transaksi(String nama, int jenis, int jumlah, String keterangan) {
        this.nama = nama;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.keterangan = keterangan;
    }

    public String getJenis(){
        if (this.jenis == 1 )
            return  "Pemasukan";
        return "Pengeluaran";
    }

    @Override
    public String toString(){
        return this.nama+": "+this.jumlah;
    }

    public static final String TABLE_NAME = "transaksi";
    public static final String COL_NAMA = "name";
    public static final String COL_JENIS = "type";
    public static final String COL_JUMLAH = "amount";
    public static final String COL_KETERANGAN = "keterangan";

    public static final String SQL_CREATE = "create table "+TABLE_NAME
            +" ("+_ID+" integer primary_key,"
            +" "+COL_NAMA+" text,"
            +" "+COL_JENIS+" integer,"
            +" "+COL_JUMLAH+" integer,"
            +" "+COL_KETERANGAN+" text)";

    public static final String SQL_DELETE = "drop table if exists "+ TABLE_NAME;
}
