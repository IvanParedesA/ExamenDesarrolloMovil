package com.example.kotlin.moviles.framework.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.moviles.data.network.model.NinjaBase
import com.example.kotlin.moviles.databinding.ItemNinjaBinding
import com.example.kotlin.moviles.framework.adapters.viewholders.NinjaViewHolder

class NinjaAdapter: RecyclerView.Adapter<NinjaViewHolder>() {
    var data:ArrayList<NinjaBase> = ArrayList()
    lateinit var context: Context
    fun NinjaAdapter(basicData : ArrayList<NinjaBase>, context:Context){
        this.data = basicData
        this.context = context
    }
    override fun onBindViewHolder(holder: NinjaViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item, context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NinjaViewHolder {
        val binding = ItemNinjaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NinjaViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}