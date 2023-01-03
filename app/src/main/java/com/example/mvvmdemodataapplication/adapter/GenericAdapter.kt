package com.example.mvvmdemodataapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView


class GenericAdapter<T:Any>(

    private val cardList: List<T>,
    @LayoutRes val layoutId:Int,
    private val bindingInterface:GenereicAdapterInterface<T>

): RecyclerView.Adapter<GenericAdapter.ViewHolder>()
{

    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){

        fun <T:Any> bind(
            item:T,
            genereicAdapterInterface: GenereicAdapterInterface<T>)
        =genereicAdapterInterface.bindData(item,view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(layoutId, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cardList[position]
        holder.bind(item,bindingInterface)
    }

    override fun getItemCount(): Int {
        return  cardList.size
    }
}
interface GenereicAdapterInterface<T:Any>{
    fun bindData(item:T,view: View)
}