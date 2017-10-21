package kodluyoruz.com.kdvhesaplayici;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button activity_main_btnKdv1, activity_main_btnKdv8, activity_main_btnKdv18, activity_main_btnKdvHaric, activity_main_btnKdvDahil;
    EditText activity_main_etKdvTutari;
    TextView activity_main_tvkdvHaric, activity_main_tvkdvTutari, activity_main_tvKdv;
    String editControl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        activity_main_btnKdv1.setOnClickListener(this);
        activity_main_btnKdv8.setOnClickListener(this);
        activity_main_btnKdv18.setOnClickListener(this);
        activity_main_btnKdvDahil.setOnClickListener(this);
        activity_main_btnKdvHaric.setOnClickListener(this);
    }

    private void initView() {
        activity_main_btnKdv1 = (Button) findViewById(R.id.activity_main_btnKdv1);
        activity_main_btnKdv8 = (Button) findViewById(R.id.activity_main_btnKdv8);
        activity_main_btnKdv18 = (Button) findViewById(R.id.activity_main_btnKdv18);

        activity_main_btnKdvHaric = (Button) findViewById(R.id.activity_main_btnKdvHaric);
        activity_main_btnKdvDahil = (Button) findViewById(R.id.activity_main_btnKdvDahil);

        activity_main_etKdvTutari = (EditText) findViewById(R.id.activity_main_etKdvTutari);

        activity_main_tvkdvHaric = (TextView) findViewById(R.id.activity_main_tvkdvHaric);
        activity_main_tvkdvTutari = (TextView) findViewById(R.id.activity_main_tvkdvTutari);
        activity_main_tvKdv = (TextView) findViewById(R.id.activity_main_tvKdv);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.activity_main_btnKdv1:


                if(v.getId()==R.id.activity_main_btnKdvDahil){
                    editControl = activity_main_etKdvTutari.getText().toString();
                    if (editControl.matches("")) {
                        Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                        Double sonuc = (sayi / 1.01);
                        activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                        activity_main_tvkdvTutari.setText(sonuc + " ");
                    }
                }else if(v.getId()==R.id.activity_main_btnKdvHaric){
                    editControl = activity_main_etKdvTutari.getText().toString();
                    if (editControl.matches("")) {
                        Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                        Double sonuc = (sayi * 0.01);
                        activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                        activity_main_tvkdvTutari.setText(sonuc + " ");
                    }


                }






            case R.id.activity_main_btnKdv8:

                switch (v.getId()) {
                    case R.id.activity_main_btnKdvDahil:
                        editControl = activity_main_etKdvTutari.getText().toString();
                        if (editControl.matches("")) {
                            Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                            return;
                        } else {
                            int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                            Double sonuc = (sayi / 1.08);
                            activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                            activity_main_tvkdvTutari.setText(sonuc + " ");
                        }
                        break;


                    case R.id.activity_main_btnKdvHaric:
                        editControl = activity_main_etKdvTutari.getText().toString();
                        if (editControl.matches("")) {
                            Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                            return;
                        } else {
                            int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                            Double sonuc = (sayi * 0.08);
                            activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                            activity_main_tvkdvTutari.setText(sonuc + " ");
                        }
                        break;
                }
                break;
            case R.id.activity_main_btnKdv18:

                switch (v.getId()) {
                    case R.id.activity_main_btnKdvDahil:
                        editControl = activity_main_etKdvTutari.getText().toString();
                        if (editControl.matches("")) {
                            Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                            return;
                        } else {
                            int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                            Double sonuc = (sayi / 1.18);
                            activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                            activity_main_tvkdvTutari.setText(sonuc + " ");
                        }
                        break;


                    case R.id.activity_main_btnKdvHaric:
                        editControl = activity_main_etKdvTutari.getText().toString();
                        if (editControl.matches("")) {
                            Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                            return;
                        } else {
                            int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                            Double sonuc = (sayi * 0.18);
                            activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                            activity_main_tvkdvTutari.setText(sonuc + " ");
                        }
                        break;
                }
                break;
        }

    }


}


