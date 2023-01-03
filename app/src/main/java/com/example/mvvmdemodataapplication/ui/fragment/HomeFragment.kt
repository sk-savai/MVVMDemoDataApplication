package com.example.mvvmdemodataapplication.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemodataapplication.R
import com.example.mvvmdemodataapplication.adapter.CardAdapter
import com.example.mvvmdemodataapplication.adapter.DiffutilesAdapter
import com.example.mvvmdemodataapplication.api.RetrofitApi
import com.example.mvvmdemodataapplication.api.RetrofitObject
import com.example.mvvmdemodataapplication.databinding.FragmentHomeBinding
import com.example.mvvmdemodataapplication.model.CardList
import com.example.mvvmdemodataapplication.repository.CardRepository
import com.example.mvvmdemodataapplication.viewmodel.CardViewModel
import com.example.mvvmdemodataapplication.viewmodelfactory.CardViewModelFactory


class HomeFragment : Fragment() {
    lateinit var adapter: CardAdapter
    lateinit var diffutilesAdapter: DiffutilesAdapter
    private lateinit var cardViewModel:CardViewModel
    private lateinit var binding:FragmentHomeBinding
    private val cardList=ArrayList<CardList.Cart.Product?>()

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false)
        val retrofitApi= RetrofitObject.getInstance().create(RetrofitApi::class.java)
        val cardRepository= CardRepository(retrofitApi)
        cardViewModel= ViewModelProvider(this, CardViewModelFactory(cardRepository))[CardViewModel::class.java]


        //Diffutils
/*        recyclarViewDiff()*/

        //Recyclar Adapter
/*        recyclarView()*/

        //Generic Adapter
        genericAdapter()


/*        cardViewModel.liveData.observe(viewLifecycleOwner) {
            if (it != null){
                diffutilesAdapter.submitList(it.carts!![2]?.products!!)
            }
            Log.d("Data", it.carts!![2]?.products.toString())
        }*/



/*        cardViewModel.liveData.observe(viewLifecycleOwner) {
            Log.d("SK",it.toString())
            for (i in 0 until it.carts?.size!!){
                Log.d("Add", it.carts!![2]?.products.toString())
            }
            if (it != null){
                cardList.addAll(it.carts!![2]?.products!!)
                adapter.notifyDataSetChanged()
                Log.d("AddData",it.toString())
            }
               Log.d("Data", it.carts!![2]?.products.toString())
        }*/

        return binding.root
    }

/*    private fun recyclarViewDiff() {
        diffutilesAdapter= DiffutilesAdapter()
        binding.rvRecyclarView.adapter=diffutilesAdapter
    }*/

/*    private fun recyclarView() {
        adapter= CardAdapter(cardList)
        binding.rvRecyclarView.adapter=adapter
    }*/

    fun genericAdapter(){

    }


}