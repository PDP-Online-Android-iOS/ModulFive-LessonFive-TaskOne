package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.MainAdapter;
import dev.ogabek.java.adapter.TodaysDealsAdapter;
import dev.ogabek.java.model.Favorite;
import dev.ogabek.java.model.TodaysDeals;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        RecyclerView rvMain = findViewById(R.id.rv_main);
        RecyclerView todaysDeals = findViewById(R.id.rv_today_s_deal);

        rvMain.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvMain.setAdapter(new MainAdapter(this, prepareFavoriteList()));

        todaysDeals.setLayoutManager(new GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false));
        todaysDeals.setAdapter(new TodaysDealsAdapter(this, prepareTodaysList()));
    }

    private List<TodaysDeals> prepareTodaysList() {
        List<TodaysDeals> list = new ArrayList<>();
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        list.add(new TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4));
        return list;
    }

    private ArrayList<Favorite> prepareFavoriteList() {
        ArrayList<Favorite> list = new ArrayList<>();

        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));
        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));
        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));
        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));
        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));
        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));
        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));
        list.add(new Favorite("iWatch", R.drawable.i_watch));
        list.add(new Favorite("iPhone", R.drawable.i_phone));

        return list;
    }

}