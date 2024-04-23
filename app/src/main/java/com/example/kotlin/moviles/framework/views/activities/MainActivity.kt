package com.example.kotlin.moviles.framework.views.activities

import MainViewModel
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin.moviles.data.network.model.NinjaBase
import com.example.kotlin.moviles.databinding.ActivityMainBinding
import com.example.kotlin.moviles.framework.adapters.NinjaAdapter

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter : NinjaAdapter = NinjaAdapter()
    private lateinit var data:ArrayList<NinjaBase>

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        viewModel.getNinjaList()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<NinjaBase>){
        binding.RVNinja.setHasFixedSize(true)
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVNinja.layoutManager = linearLayoutManager
        adapter.NinjaAdapter(dataForList,this)
        binding.RVNinja.adapter = adapter
    }

    private fun initializeObservers(){
        viewModel.ninjaBaseLiveData.observe(this){ ninjaBaseList ->
            setUpRecyclerView(ArrayList(ninjaBaseList))
        }
    }
}
