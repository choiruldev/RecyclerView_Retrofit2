package com.chrl.retrofit2

import androidx.recyclerview.widget.StaggeredGridLayoutManager.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.chrl.retrofit2.api.RecyclerData
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        initRecyclerView()
        createData()
    }

    private fun initRecyclerView(){
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
            recyclerViewAdapter = RecyclerViewAdapter()
            adapter = recyclerViewAdapter

            val decoration = DividerItemDecoration(applicationContext, VERTICAL)
            addItemDecoration(decoration)
        }
    }

    fun createData() {
        val item = ArrayList<RecyclerData>()
        item.add(RecyclerData("Java", "Java description"))
        item.add(RecyclerData("C++", "C++ description"))
        item.add(RecyclerData("Android", "Android description"))
        item.add(RecyclerData("iOS", "iOS description"))
        item.add(RecyclerData("PHP", "PHP description"))
        item.add(RecyclerData("Kotlin", "Kotlinb description"))
       recyclerViewAdapter.setListData(item)
       recyclerViewAdapter.notifyDataSetChanged()




    }
}