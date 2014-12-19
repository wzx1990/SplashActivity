package com.example.kuhua;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity {

	private LayoutInflater mInflater;
	private RadioGroup scv_RadioGroup;
	private String[] tabTitle = {"选项1","选项2","选项3","选项4"};
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		this.setContentView(R.layout.main);
		this.findId();
		this.inintData();
		this.initScrolView();
	}
	private void inintData()
	{
		mInflater = (LayoutInflater) this
				.getSystemService(LAYOUT_INFLATER_SERVICE);
	}
	private void findId()
	{
		this.scv_RadioGroup = (RadioGroup)findViewById(R.id.scview_radiogroup);
	}
	
	private void initScrolView()
	{
		this.scv_RadioGroup.removeAllViews();
		for(int i = 0; i < this.tabTitle.length; i ++)
		{
			RadioButton Rg = (RadioButton)this.mInflater.inflate(R.layout.radiogroup_item, null);
			Rg.setId(i);
			Rg.setText(this.tabTitle[i]);
//			Rg.setLayoutParams(new LayoutParams(source))
			this.scv_RadioGroup.addView(Rg);
		}
	}
	
}
