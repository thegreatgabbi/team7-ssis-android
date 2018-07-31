package sg.edu.team7.stationeryshop.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import sg.edu.team7.stationeryshop.R;
import sg.edu.team7.stationeryshop.fragments.MakeStockAdjustmentFragment;

public class AddStockAdjustmentDetailActivity extends AppCompatActivity implements MakeStockAdjustmentFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_adjustment_new_detail);

        //Initialize button
        Button submit = findViewById(R.id.add_btn);

        //Get texts
        EditText itemcode = (EditText)findViewById(R.id.add_itemcode);
        EditText itemname = (EditText) findViewById(R.id.add_itemname);
        EditText bef_qty = (EditText)findViewById(R.id.add_before);
        EditText aft_qty = (EditText)findViewById(R.id.add_after);
        EditText reason = (EditText) findViewById(R.id.add_reason);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NewStockAdjustmentActivity.class);

                intent.putExtra("itemcode",itemcode.getText().toString());
                intent.putExtra("itemname",itemname.getText().toString());
                intent.putExtra("bef_qty",bef_qty.getText().toString());
                intent.putExtra("aft_qty",aft_qty.getText().toString());
                intent.putExtra("reason",reason.getText().toString());

                startActivity(intent);

            }
        });
    }

    @Override
    public void onFragmentInteraction(String title) {

    }
}