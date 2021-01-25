package com.royalsoftsolutions.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        //  MyListData[] myListData;

        //A a = new A();

        MyListData[] myListData = new MyListData[]{
                new MyListData ( "Email",R.drawable.images2,"password" ),
                new MyListData ( "Info", android.R.drawable.ic_dialog_info,"password" ),
                new MyListData ( "Delete", android.R.drawable.ic_delete,"password" ),
                new MyListData ( "Dialer", android.R.drawable.ic_dialog_dialer,"password" ),
                new MyListData ( "Alert", android.R.drawable.ic_dialog_alert ,"password"),
                new MyListData ( "Map", android.R.drawable.ic_dialog_map ,"password"),
                new MyListData ( "Email", android.R.drawable.ic_dialog_email,"password" ),
                new MyListData ( "Info", android.R.drawable.ic_dialog_info,"password" ),
                new MyListData ( "Delete", android.R.drawable.ic_delete,"password" ),
                new MyListData ( "Dialer", android.R.drawable.ic_dialog_dialer,"password" ),
                new MyListData ( "Alert", android.R.drawable.ic_dialog_alert ,"password"),
                new MyListData ( "Map", android.R.drawable.ic_dialog_map,"password" ),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById ( R.id.recyclerView );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this ) );

        MyListAdapter adapter = new MyListAdapter ( myListData );
        recyclerView.setAdapter ( adapter );
        recyclerView.setHasFixedSize ( true );

    }
}
