package com.jk.buildvariant


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.jk.buildvariant.databinding.FragmentRecyclerBinding

/**
 * A simple [Fragment] subclass.
 */
class RecyclerFragment : Fragment() {

    private val dataViewModel = DataViewModel()

    lateinit var binding: FragmentRecyclerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_recycler, container, false
        )
        val view = binding.root

        binding.viewModel = dataViewModel
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

    }
}



