package com.sagr.concatexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.sagr.concatexample.adapter.BannerAdapter
import com.sagr.concatexample.adapter.MyDetailAdapter
import com.sagr.concatexample.adapter.UsersAdapter
import com.sagr.concatexample.databinding.ActivityMainBinding
import com.sagr.concatexample.model.MyDetail

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ConcatAdapter
    private lateinit var myDetailAdapter: MyDetailAdapter
    private lateinit var userVerticalAdapter: UsersAdapter
    private lateinit var bannerAdapter: BannerAdapter

    private val myDetail = listOf(
        MyDetail(1, "Himanshu Singh", "I am a writer and Open Source contributor in MindOrks."),
        MyDetail(2, "John Doe", "A passionate Android developer."),
        MyDetail(3, "Jane Smith", "Loves contributing to open source.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupDataInRecyclerView()
        setupButtonListener()
    }

    private fun setupDataInRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        userVerticalAdapter = UsersAdapter(DataSource.getUser())
        bannerAdapter = BannerAdapter(DataSource.getBanner())
        myDetailAdapter = MyDetailAdapter(myDetail)
        adapter = ConcatAdapter(myDetailAdapter, userVerticalAdapter, bannerAdapter)
        binding.recyclerView.adapter = adapter
    }

    private fun setupButtonListener() {
        binding.addAdapterButton.setOnClickListener {
            val newDetail = listOf(
                MyDetail(4, "Alice Johnson", "A software engineer with a love for technology."),
                MyDetail(5, "Bob Brown", "An avid coder and tech enthusiast.")
            )
            val newDetailAdapter = MyDetailAdapter(newDetail)

            adapter = ConcatAdapter(adapter, newDetailAdapter)
            binding.recyclerView.adapter = adapter
        }
    }
}
