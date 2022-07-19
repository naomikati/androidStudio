package com.example.morningcustomlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var mList:ListView ?= null
    var users:ArrayList<User> ?= null
    var adapter:CustomAdapter ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mList = findViewById(R.id.mListView)
        users = ArrayList()
        adapter = CustomAdapter(this,users!!)
        //start creating users
        var user1 = User(R.mipmap.nice,"molly","0785435162")
        var user2 = User(R.mipmap.flower,"molly","0785435162")
        var user3 = User(R.mipmap.nice,"molly","0785435162")
        var user4 = User(R.mipmap.nice,"molly","0785435162")
        var user5 = User(R.mipmap.love,"molly","0785435162")
        var user6 = User(R.mipmap.nice,"molly","0785435162")
        var user7 = User(R.mipmap.flower,"molly","0785435162")
        var user8 = User(R.mipmap.nice,"molly","0785435162")
        var user9 = User(R.mipmap.love,"molly","0785435162")
        //Add the created users to the arraylist users
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
        users!!.add(user4)
        users!!.add(user5)
        users!!.add(user6)
        users!!.add(user7)
        users!!.add(user8)
        users!!.add(user9)
      //Assign our custom adapter to the listview
      mList!!.adapter = adapter!!
    }
}