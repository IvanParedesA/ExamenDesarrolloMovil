package com.example.kotlin.moviles.framework.adapters.viewholders

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.moviles.data.network.model.NinjaBase
import com.example.kotlin.moviles.databinding.ItemNinjaBinding

class NinjaViewHolder(private val binding: ItemNinjaBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: NinjaBase, context:Context){
        binding.tvRecordType.text = item.record_type
        binding.tvValue.text = item.value
    }
}