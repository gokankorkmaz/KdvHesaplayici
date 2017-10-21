package kodluyoruz.com.kdvhesaplayici;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button activity_main_btnKdv1, activity_main_btnKdv8, activity_main_btnKdv18;
    EditText activity_main_etKdvTutari;
    TextView activity_main_tvkdvHaric, activity_main_tvkdvTutari, activity_main_tvKdv;
    String editControl;
    RadioButton activity_main_rbtnKdvDahil, activity_main_rbtnKdvHaric;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        activity_main_btnKdv1.setOnClickListener(this);
        activity_main_btnKdv8.setOnClickListener(this);
        activity_main_btnKdv18.setOnClickListener(this);
        activity_main_rbtnKdvDahil.setOnClickListener(this);
        activity_main_rbtnKdvHaric.setOnClickListener(this);
    }

    private void initView() {
        activity_main_btnKdv1 = (Button) findViewById(R.id.activity_main_btnKdv1);
        activity_main_btnKdv8 = (Button) findViewById(R.id.activity_main_btnKdv8);
        activity_main_btnKdv18 = (Button) findViewById(R.id.activity_main_btnKdv18);

        activity_main_rbtnKdvDahil = (RadioButton) findViewById(R.id.activity_main_rbtnKdvDahil);
        activity_main_rbtnKdvHaric = (RadioButton) findViewById(R.id.activity_main_rbtnKdvHaric);

        activity_main_etKdvTutari = (EditText) findViewById(R.id.activity_main_etKdvTutari);

        activity_main_tvkdvHaric = (TextView) findViewById(R.id.activity_main_tvkdvHaric);
        activity_main_tvkdvTutari = (TextView) findViewById(R.id.activity_main_tvkdvTutari);
        activity_main_tvKdv = (TextView) findViewById(R.id.activity_main_tvKdv);

     }

    @Override
    public void onClick(View v) {




        switch (v.getId()) {
            case R.id.activity_main_btnKdv1:
                editControl = activity_main_etKdvTutari.getText().toString();
                if (editControl.matches("")) {
                    Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (activity_main_rbtnKdvDahil.isChecked()) {
                    activity_main_tvKdv.setText("KDV HARİÇ");

                    int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                    Double sonuc = (sayi / 1.01);
                    double son=(Math.floor(sonuc* 100) / 100);
                    activity_main_tvkdvHaric.setText(son + " ");
                    activity_main_tvkdvTutari.setText(new DecimalFormat("##.##").format(sayi-son));

                   // activity_main_tvkdvTutari.setText(sayi-son+" ");

                } else if (activity_main_rbtnKdvHaric.isChecked()) {
                    activity_main_tvKdv.setText("KDV DAHİL");

                    int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                    Double sonuc = (sayi * 0.01);
                    activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                    activity_main_tvkdvTutari.setText(sonuc + " ");



                }
break;

            case R.id.activity_main_btnKdv8:
                editControl = activity_main_etKdvTutari.getText().toString();
                if (editControl.matches("")) {
                    Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (activity_main_rbtnKdvDahil.isChecked()) {
                    activity_main_tvKdv.setText("KDV HARİÇ");

                    int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                    Double sonuc = (sayi / 1.08);
                    double son=(Math.floor(sonuc* 100) / 100);
                    activity_main_tvkdvHaric.setText(son + " ");
                    activity_main_tvkdvTutari.setText(new DecimalFormat("##.##").format(sayi-son));

                } else if (activity_main_rbtnKdvHaric.isChecked()) {
                    activity_main_tvKdv.setText("KDV DAHİL");

                    int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                    Double sonuc = (sayi * 0.08);
                    activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                    activity_main_tvkdvTutari.setText(sonuc + " ");



                }


                break;
            case R.id.activity_main_btnKdv18:
                editControl = activity_main_etKdvTutari.getText().toString();
                if (editControl.matches("")) {
                    Toast.makeText(this, "Lütfen Tutar Giriniz", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (activity_main_rbtnKdvDahil.isChecked()) {
                    activity_main_tvKdv.setText("KDV HARİÇ");

                    int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                    Double sonuc = (sayi / 1.18);
                    double son=(Math.floor(sonuc* 100) / 100);
                    activity_main_tvkdvHaric.setText(son + " ");
                    activity_main_tvkdvTutari.setText(new DecimalFormat("##.##").format(sayi-son));

                } else if (activity_main_rbtnKdvHaric.isChecked()) {
                    activity_main_tvKdv.setText("KDV DAHİL");
                    int sayi = Integer.parseInt(activity_main_etKdvTutari.getText().toString());
                    Double sonuc = (sayi * 0.18);
                    activity_main_tvkdvHaric.setText(sayi + sonuc + " ");
                    activity_main_tvkdvTutari.setText(sonuc + " ");



                }


                break;
        }

    }


}


//TODO RadioButtonları üste al