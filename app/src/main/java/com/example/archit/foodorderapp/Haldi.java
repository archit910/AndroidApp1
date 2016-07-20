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

public class Haldi extends AppCompatActivity {
    private  TextView tvRes;
    int aalo= 0 ;
    int cd = 0;
    int puff = 0;
    int paneer = 0;
    int TotalBill = 0;
    ArrayList<String> selected = new ArrayList<>();
    class viewholder{
        TextView name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haldi);
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Masala Dosa");
        myList.add("Chooole Bhature");
        myList.add("Aalo tikki");
        myList.add("Thali");
        tvRes = (TextView) findViewById(R.id.tv_billHR);
        ListView listView = (ListView) findViewById(R.id.list_viewHR);
        adapter ad = new adapter(myList);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                viewholder vh = (viewholder)view.getTag();
                String cString  = vh.name.getText().toString();

                if(cString.equals("Masala Dosa"))
                {
                    Toast.makeText(Haldi.this, "Added To List", Toast.LENGTH_SHORT).show();
                    {

                        TotalBill+=130;

                    }

                }
                if(cString.equals("Chooole Bhature"))
                {
                    Toast.makeText(Haldi.this, "Added To List", Toast.LENGTH_SHORT).show();

                    {

                        TotalBill+=65;

                    }

                }
                if(cString.equals("Aalo tikki"))
                {
                    Toast.makeText(Haldi.this, "Added To List", Toast.LENGTH_SHORT).show();

                    {

                        TotalBill+=45;

                    }

                }
                if(cString.equals("Thali"))
                {
                    Toast.makeText(Haldi.this, "Added To List", Toast.LENGTH_SHORT).show();

                    {

                        TotalBill+=245;

                    }


                }
                vh.name.setTextColor(Color.BLUE);
                tvRes.setText("Rs "+Integer.toString(TotalBill));



            }

        });
        Button finish = (Button) findViewById(R.id.btn_finishHR);
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
