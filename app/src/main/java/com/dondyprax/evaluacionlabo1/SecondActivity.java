package com.dondyprax.evaluacionlabo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.dondyprax.evaluacionlabo1.utils.AppConstants;

public class SecondActivity extends AppCompatActivity {

    TextView username, email, totalProducts, product1, product2, product3, product4, product5, product6, product7, product8, product9;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        username = findViewById(R.id.receive_user);
        email = findViewById(R.id.receive_email);
        totalProducts = findViewById(R.id.receive_total_products);
        btnShare = findViewById(R.id.btn_share);

        product1 = findViewById(R.id.tv_receive_product1);
        product2 = findViewById(R.id.tv_receive_product2);
        product3 = findViewById(R.id.tv_receive_product3);
        product4 = findViewById(R.id.tv_receive_product4);
        product5 = findViewById(R.id.tv_receive_product5);
        product6 = findViewById(R.id.tv_receive_product6);
        product7 = findViewById(R.id.tv_receive_product7);
        product8 = findViewById(R.id.tv_receive_product8);
        product9 = findViewById(R.id.tv_receive_product9);

        Intent mIntent = getIntent();
        Bundle mBundle = mIntent.getExtras();

        if(mBundle != null) {
            username.setText(mBundle.getString(AppConstants.USERNAME_KEY));
            email.setText(mBundle.getString(AppConstants.EMAIL_KEY));
            totalProducts.setText(mBundle.getString(AppConstants.PRODUCT_TOTAL_KEY));
            product1.setText(mBundle.getString(AppConstants.PRODUCT1_KEY));
            product2.setText(mBundle.getString(AppConstants.PRODUCT2_KEY));
            product3.setText(mBundle.getString(AppConstants.PRODUCT3_KEY));
            product4.setText(mBundle.getString(AppConstants.PRODUCT4_KEY));
            product5.setText(mBundle.getString(AppConstants.PRODUCT5_KEY));
            product6.setText(mBundle.getString(AppConstants.PRODUCT6_KEY));
            product7.setText(mBundle.getString(AppConstants.PRODUCT7_KEY));
            product8.setText(mBundle.getString(AppConstants.PRODUCT8_KEY));
            product9.setText(mBundle.getString(AppConstants.PRODUCT9_KEY));
        }

        btnShare.setOnClickListener( v -> {
            Intent mIntentShare = new Intent();
            Bundle sBundle = new Bundle();
            mIntentShare.setAction(Intent.ACTION_SEND);
            mIntentShare.setType("text/plain");

            sBundle.putString(AppConstants.USERNAME_KEY, username.getText().toString());
            sBundle.putString(AppConstants.EMAIL_KEY, email.getText().toString());
            sBundle.putString(AppConstants.PRODUCT_TOTAL_KEY, totalProducts.getText().toString());
            sBundle.putString(AppConstants.PRODUCT1_KEY, product1.getText().toString());
            sBundle.putString(AppConstants.PRODUCT2_KEY, product2.getText().toString());
            sBundle.putString(AppConstants.PRODUCT3_KEY, product3.getText().toString());
            sBundle.putString(AppConstants.PRODUCT4_KEY, product4.getText().toString());
            sBundle.putString(AppConstants.PRODUCT5_KEY, product5.getText().toString());
            sBundle.putString(AppConstants.PRODUCT6_KEY, product6.getText().toString());
            sBundle.putString(AppConstants.PRODUCT7_KEY, product7.getText().toString());
            sBundle.putString(AppConstants.PRODUCT8_KEY, product8.getText().toString());
            sBundle.putString(AppConstants.PRODUCT9_KEY, product9.getText().toString());


            mIntentShare.putExtras(sBundle);
        });
    }
}
