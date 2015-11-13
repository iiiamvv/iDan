package com.dazhong.idan;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class OrderDetail extends Activity {
	
	private Button btn_start;
	private Button btn_end;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.order_detail);
		
		btn_start = (Button) findViewById(R.id.btn_start);
		btn_end = (Button) findViewById(R.id.btn_end);
		btn_start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final EditText editText = new EditText(OrderDetail.this);
				
				new AlertDialog.Builder(OrderDetail.this).setTitle("����д��ʼ·��").
					setView(editText).setPositiveButton("ȷ������ʼҵ��", new android.content.DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							String aa = "adb";
							aa = editText.getText().toString();
							Log.i("jxb", "aa = "+aa);
							btn_start.setVisibility(View.GONE);
							btn_end.setVisibility(View.VISIBLE);
						}
					}).
					setNegativeButton("ȡ��", null).show();
				
			}
		});
		
		
		btn_end.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				final EditText editText = new EditText(OrderDetail.this);
				new AlertDialog.Builder(OrderDetail.this).setTitle("����д����·��").
				setView(editText).setPositiveButton("��д��һ��", new android.content.DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						String bb = "adb";
						bb = editText.getText().toString();
						Log.i("jxb", "bb = "+bb);
						btn_end.setVisibility(View.GONE);
						btn_start.setVisibility(View.VISIBLE);
						
						Intent intent = new Intent();
						intent.setClass(OrderDetail.this, OrderDetailEnd.class);
						startActivity(intent);
						
					}
				}).
				setNegativeButton("ȡ��", null).show();
			}
		});
		
		
	}
	
}
