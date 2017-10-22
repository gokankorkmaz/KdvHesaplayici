package kodluyoruz.com.kdvhesaplayici;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button activity_main_btnKdv1, activity_main_btnKdv8, activity_main_btnKdv18;
    EditText activity_main_etKdv;
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
        activity_main_etKdv = (EditText) findViewById(R.id.activity_main_etKdv);
        activity_main_tvkdvHaric = (TextView) findViewById(R.id.activity_main_tvkdvHaric);
        activity_main_tvkdvTutari = (TextView) findViewById(R.id.activity_main_tvkdvTutari);
        activity_main_tvKdv = (TextView) findViewById(R.id.activity_main_tvKdv);

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.activity_main_btnKdv1:
                editControl = activity_main_etKdv.getText().toString();
                if (editControl.matches("")) {
                    Toast.makeText(this, R.string.tutarGiriniz, Toast.LENGTH_SHORT).show();
                    return;
                }

                if (activity_main_rbtnKdvDahil.isChecked()) {
                    activity_main_tvKdv.setText(R.string.kdvHaric);

                    int number = Integer.parseInt(activity_main_etKdv.getText().toString());
                    Double sonuc = (number / 1.01);
                    double son = (Math.floor(sonuc * 100) / 100);
                    activity_main_tvkdvHaric.setText(son + "");
                    activity_main_tvkdvTutari.setText(new DecimalFormat("##.##").format(number - son));


                } else if (activity_main_rbtnKdvHaric.isChecked()) {
                    activity_main_tvKdv.setText(R.string.kdvDahil);

                    int number = Integer.parseInt(activity_main_etKdv.getText().toString());
                    Double kdv = (number * 0.01);
                    activity_main_tvkdvHaric.setText(number + kdv + " ");
                    activity_main_tvkdvTutari.setText(kdv + " ");


                }
                break;

            case R.id.activity_main_btnKdv8:
                editControl = activity_main_etKdv.getText().toString();
                if (editControl.matches("")) {
                    Toast.makeText(this, R.string.tutarGiriniz, Toast.LENGTH_SHORT).show();
                    return;
                }

                if (activity_main_rbtnKdvDahil.isChecked()) {
                    activity_main_tvKdv.setText(R.string.kdvHaric);


                    int number = Integer.parseInt(activity_main_etKdv.getText().toString());
                    Double kdv = (number / 1.08);
                    double son = (Math.floor(kdv * 100) / 100);
                    activity_main_tvkdvHaric.setText(son + " ");
                    activity_main_tvkdvTutari.setText(new DecimalFormat("##.##").format(number - son));

                } else if (activity_main_rbtnKdvHaric.isChecked()) {
                    activity_main_tvKdv.setText(R.string.kdvDahil);

                    int number = Integer.parseInt(activity_main_etKdv.getText().toString());
                    Double kdv = (number * 0.08);
                    activity_main_tvkdvHaric.setText(number + kdv + " ");
                    activity_main_tvkdvTutari.setText(kdv + " ");

                }

                break;
            case R.id.activity_main_btnKdv18:
                editControl = activity_main_etKdv.getText().toString();
                if (editControl.matches("")) {
                    Toast.makeText(this, R.string.tutarGiriniz, Toast.LENGTH_SHORT).show();
                    return;
                }

                if (activity_main_rbtnKdvDahil.isChecked()) {
                    activity_main_tvKdv.setText(R.string.kdvHaric);

                    int number = Integer.parseInt(activity_main_etKdv.getText().toString());
                    Double kdv = (number / 1.18);
                    double son = (Math.floor(kdv * 100) / 100);
                    activity_main_tvkdvHaric.setText(son + " ");
                    activity_main_tvkdvTutari.setText(new DecimalFormat("##.##").format(number - son));

                } else if (activity_main_rbtnKdvHaric.isChecked()) {
                    activity_main_tvKdv.setText(R.string.kdvDahil);

                    int number = Integer.parseInt(activity_main_etKdv.getText().toString());
                    Double kdv = (number * 0.18);
                    activity_main_tvkdvHaric.setText(number + kdv + " ");
                    activity_main_tvkdvTutari.setText(kdv + " ");


                }


                break;
        }

    }


}


