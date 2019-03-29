package com.dondyprax.evaluacionlabo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dondyprax.evaluacionlabo1.utils.AppConstants;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etEmail;

    LinearLayout product1, product2, product3,
            product4, product5, product6,
            product7, product8, product9;

    Button btnSend;

    TextView product1Counter, product2Counter, product3Counter,
    product4Counter, product5Counter, product6Counter,
    product7Counter, product8Counter, product9Counter;

    int product1Count = 0, product2Count = 0, product3Count = 0,
            product4Count = 0, product5Count = 0, product6Count = 0,
            product7Count = 0, product8Count = 0, product9Count = 0,
            productTotal;

    String username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        product1.setOnClickListener(v -> {
            product1Count++;
            product1Counter.setText(Integer.toString(product1Count));
        });

        product2.setOnClickListener(v -> {
            product2Count++;
            product2Counter.setText(Integer.toString(product2Count));
        });

        product3.setOnClickListener(v -> {
            product3Count++;
            product3Counter.setText(Integer.toString(product3Count));
        });

        product4.setOnClickListener(v -> {
            product4Count++;
            product4Counter.setText(Integer.toString(product4Count));
        });

        product5.setOnClickListener(v -> {
            product5Count++;
            product5Counter.setText(Integer.toString(product5Count));
        });

        product6.setOnClickListener(v -> {
            product6Count++;
            product6Counter.setText(Integer.toString(product6Count));
        });

        product7.setOnClickListener(v -> {
            product7Count++;
            product7Counter.setText(Integer.toString(product7Count));
        });

        product8.setOnClickListener(v -> {
            product8Count++;
            product8Counter.setText(Integer.toString(product8Count));
        });

        product9.setOnClickListener(v -> {
            product9Count++;
            product9Counter.setText(Integer.toString(product9Count));
        });

        btnSend.setOnClickListener( v -> {
            username = etUsername.getText().toString();
            email = etEmail.getText().toString();
            productTotal = product1Count + product2Count + product3Count + product4Count + product5Count + product6Count + product7Count + product8Count + product9Count;

            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            Bundle mBundle = new Bundle();

            mBundle.putString(AppConstants.USERNAME_KEY, username);
            mBundle.putString(AppConstants.EMAIL_KEY, email);
            mBundle.putString(AppConstants.PRODUCT1_KEY, Integer.toString(product1Count));
            mBundle.putString(AppConstants.PRODUCT2_KEY, Integer.toString(product2Count));
            mBundle.putString(AppConstants.PRODUCT3_KEY, Integer.toString(product3Count));
            mBundle.putString(AppConstants.PRODUCT4_KEY, Integer.toString(product4Count));
            mBundle.putString(AppConstants.PRODUCT5_KEY, Integer.toString(product5Count));
            mBundle.putString(AppConstants.PRODUCT6_KEY, Integer.toString(product6Count));
            mBundle.putString(AppConstants.PRODUCT7_KEY, Integer.toString(product7Count));
            mBundle.putString(AppConstants.PRODUCT8_KEY, Integer.toString(product8Count));
            mBundle.putString(AppConstants.PRODUCT9_KEY, Integer.toString(product9Count));
            mBundle.putString(AppConstants.PRODUCT_TOTAL_KEY, Integer.toString(productTotal));

            mIntent.putExtras(mBundle);
            startActivity(mIntent);
        });

    }

    public void initViews() {
        etUsername = findViewById(R.id.et_user);
        etEmail = findViewById(R.id.et_email);
        btnSend = findViewById(R.id.action_btn_send);

        product1 = findViewById(R.id.ll_product1);
        product2 = findViewById(R.id.ll_product2);
        product3 = findViewById(R.id.ll_product3);
        product4 = findViewById(R.id.ll_product4);
        product5 = findViewById(R.id.ll_product5);
        product6 = findViewById(R.id.ll_product6);
        product7 = findViewById(R.id.ll_product7);
        product8 = findViewById(R.id.ll_product8);
        product9 = findViewById(R.id.ll_product9);

        product1Counter = findViewById(R.id.tv_count_product1);
        product2Counter = findViewById(R.id.tv_count_product2);
        product3Counter = findViewById(R.id.tv_count_product3);
        product4Counter = findViewById(R.id.tv_count_product4);
        product5Counter = findViewById(R.id.tv_count_product5);
        product6Counter = findViewById(R.id.tv_count_product6);
        product7Counter = findViewById(R.id.tv_count_product7);
        product8Counter = findViewById(R.id.tv_count_product8);
        product9Counter = findViewById(R.id.tv_count_product9);
    }
}
