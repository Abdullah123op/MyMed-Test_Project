package com.example.mymed_test_project;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.example.mymed_test_project.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //initViewFirstPage();
    }

//    private void initViewFirstPage() {
//        binding.etNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean hasFocus) {
//                if (hasFocus) {
//                    binding.etNumber.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.et_positive_background));
//                } else {
//                    binding.etNumber.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.et_negative_background));
//                }
//            }
//        });
//
//        binding.etNumber.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (binding.etNumber.getText().toString().trim().length() == 10) {
//                    binding.btnSendOtp.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.btn_positive_background));
//                    binding.btnSendOtp.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.white));
//                } else {
//                    binding.btnSendOtp.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.btn_negative_background));
//                    binding.btnSendOtp.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.negative));
//                }
//            }
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//    }
}