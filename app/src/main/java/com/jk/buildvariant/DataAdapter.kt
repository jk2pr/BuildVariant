package com.jk.buildvariant

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.jk.buildvariant.databinding.ItemListBinding

class DataAdapter(private val items: List<Item>) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {



        val  binding = DataBindingUtil
                .inflate<ItemListBinding>(LayoutInflater.from(parent.context), R.layout.item_list, parent,false)

       // val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }


    inner class ViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            with(binding) {
                tvTitle.text = item.title
            }
        }

    }
}
