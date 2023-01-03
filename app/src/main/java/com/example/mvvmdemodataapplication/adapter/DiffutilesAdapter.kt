package com.example.mvvmdemodataapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemodataapplication.databinding.RecyclarCardItemBinding
import com.example.mvvmdemodataapplication.model.CardList

class DiffutilesAdapter : ListAdapter<CardList.Cart.Product, DiffutilesAdapter.ViewHolder>(Diffutiles()) {

    private lateinit var binding: RecyclarCardItemBinding

    inner class ViewHolder(val binding: RecyclarCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.data =getItem(position)
        }
    }


    class Diffutiles:DiffUtil.ItemCallback<CardList.Cart.Product>(){
        override fun areItemsTheSame(oldItem: CardList.Cart.Product, newItem: CardList.Cart.Product): Boolean {
           return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: CardList.Cart.Product, newItem: CardList.Cart.Product): Boolean {
            return oldItem== newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =
            RecyclarCardItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }
}