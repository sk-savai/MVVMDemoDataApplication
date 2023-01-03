package com.example.mvvmdemodataapplication.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.mvvmdemodataapplication.databinding.RecyclarCardItemBinding
import com.example.mvvmdemodataapplication.model.CardList


class CardAdapter(
    private var cardListData: ArrayList<CardList.Cart.Product?>,
) : Adapter<CardAdapter.ViewHolder>() {
    private lateinit var binding: RecyclarCardItemBinding

    inner class ViewHolder(val binding: RecyclarCardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.data = cardListData[position]
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardAdapter.ViewHolder {
        binding =
            RecyclarCardItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = cardListData.size

    override fun getItemId(position: Int): Long {
        return getItemId(position)
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: CardAdapter.ViewHolder, position: Int) {
        holder.bind(position)
    }


/*    @SuppressLint("NotifyDataSetChanged")
    fun setData(cardList1: ArrayList<Product?>) {
        this.cardList = cardList1
        this.notifyDataSetChanged()
    }*/
}

















