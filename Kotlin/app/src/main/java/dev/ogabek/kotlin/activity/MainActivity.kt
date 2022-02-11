package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.MainAdapter
import dev.ogabek.kotlin.adapter.TodaysDealsAdapter
import dev.ogabek.kotlin.model.Favorite
import dev.ogabek.kotlin.model.TodaysDeals

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val rvMain = findViewById<RecyclerView>(R.id.rv_main)
        val todaysDeals = findViewById<RecyclerView>(R.id.rv_today_s_deal)
        rvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvMain.adapter = MainAdapter(this, prepareFavoriteList())
        todaysDeals.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)
        todaysDeals.adapter = TodaysDealsAdapter(this, prepareTodaysList())
    }

    private fun prepareTodaysList(): List<TodaysDeals> {
        val list: MutableList<TodaysDeals> = ArrayList<TodaysDeals>()
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        return list
    }

    private fun prepareFavoriteList(): ArrayList<Favorite> {
        val list: ArrayList<Favorite> = ArrayList<Favorite>()
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        return list
    }
}