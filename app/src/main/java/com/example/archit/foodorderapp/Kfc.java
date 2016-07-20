package com.example.archit.foodorderapp;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Kfc extends AppCompatActivity {
    private  TextView tvRes;
    int aalo= 0 ;
    int cd = 0;
    int puff = 0;
    int paneer = 0;
    int TotalBill = 0;
    class viewholder{
        TextView name;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Chicken Fry");
        myList.add("Cold Drink");
        myList.add("Chicken Tandoori");
        myList.add("Veg Burger");
        tvRes = (TextView) findViewById(R.id.tv_billKfc);
        ListView listView = (ListView) findViewById(R.id.list_viewKFC);
        adapter ad = new adapter(myList);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                viewholder vh = (viewholder)view.getTag();
                String cString  = vh.name.getText().toString();

                if(cString.equals("Chicken Fry"))
                {
                    Toast.makeText(Kfc.this, "Added To List", Toast.LENGTH_SHORT).show();
                    {

                        TotalBill+=300;

                    }

                }
                if(cString.equals("Cold Drink"))
                {
                    Toast.makeText(Kfc.this, "Added To List", Toast.LENGTH_SHORT).show();

                    {

                        TotalBill+=25;

                    }

                }
                if(cString.equals("Chicken Tandoori"))
                {
                    Toast.makeText(Kfc.this, "Added To List", Toast.LENGTH_SHORT).show();

                    {

                        TotalBill+=145;

                    }

                }
                if(cString.equals("Veg Burger"))
                {
                    Toast.makeText(Kfc.this, "Added To List", Toast.LENGTH_SHORT).show();

                    {

                        TotalBill+=60;

                    }


                }
                vh.name.setTextColor(Color.BLUE);
                tvRes.setText("Rs "+Integer.toString(TotalBill));



            }

        });
        Button finish = (Button) findViewById(R.id.btn_finishKFC);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Your Order Has Been Placed", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    public class adapter extends BaseAdapter
    {
        ArrayList<String> mylist =new ArrayList<>();
        public adapter(ArrayList<String> mylist)
        {
            this.mylist = mylist;

        }

        @Override
        public int getCount() {
            return mylist.size();
        }

        @Override
        public String getItem(int i) {
            return mylist.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li= getLayoutInflater();
            viewholder  vh;
            if(view == null)
            {
                view = li.inflate(R.layout.yahi_layout,null);
                vh = new viewholder();

                vh.name = (TextView)view.findViewById(R.id.textViewY);
                view.setTag(vh);
            }
            else
                vh = (viewholder) view.getTag();
            String change = getItem(i);
            vh.name.setText(change);
            Log.d("TAg 2",change);

            vh.name.setTextColor(Color.MAGENTA);


            return view;
        }
    }
}
