package com.example.hw3;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText sname,fname,phone;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sname=(EditText) findViewById(R.id.surName);
        fname=(EditText) findViewById(R.id.firstName);
        phone=(EditText) findViewById(R.id.phone);
        txv=(TextView) findViewById(R.id.txv);
    }

    @SuppressLint("SetTextI18n")
    public void onclick(View v){

        // 重置欄位的背景顏色
        sname.setBackgroundColor(Color.TRANSPARENT);
        fname.setBackgroundColor(Color.TRANSPARENT);
        phone.setBackgroundColor(Color.TRANSPARENT);

        boolean hasEmptyField = false;
        if (sname.getText().toString().isEmpty()) {
            sname.setBackgroundColor(Color.RED);
            hasEmptyField = true;
        }
        if (fname.getText().toString().isEmpty()) {
            fname.setBackgroundColor(Color.RED);
            hasEmptyField = true;
        }
        if (phone.getText().toString().isEmpty()) {
            phone.setBackgroundColor(Color.RED);
            hasEmptyField = true;
        }

        if (hasEmptyField) {
            txv.setText("請填寫所有欄位");
            txv.setTextColor(Color.RED);
            return;
        }

        Random x=new Random();
        int red=x.nextInt(256);
        int green=x.nextInt(256);
        int blue=x.nextInt(256);
        txv.setTextColor(Color.rgb(red,green,blue));
        txv.setText(sname.getText().toString()+fname.getText()+"的電話是"+phone.getText());
    }

}