package com.example.rickandmortyce.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.rickandmortyce.R
import com.example.rickandmortyce.base.BaseFragment
import com.example.rickandmortyce.databinding.FragmentRickAndMortyBinding
import com.example.rickandmortyce.ui.adapters.RickAndMortyAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class RickAndMortyFragment : BaseFragment<FragmentRickAndMortyBinding, RickAndMortyViewModel>(
    R.layout.fragment_rick_and_morty
) {
    override val binding by viewBinding(FragmentRickAndMortyBinding::bind)
    override val viewModel: RickAndMortyViewModel by viewModels()
    private val rickAndMortyAdapter = RickAndMortyAdapter()

    override fun initialize() {
        binding.rvRam.apply {
            layoutManager = LinearLayoutManager(context)
            binding.rvRam.layoutManager = layoutManager
            adapter = rickAndMortyAdapter
        }
    }

//    override fun setupSubscribes() {
//        lifecycleScope.launch {
//            viewModel.fetchCharacter().collect {
//                rickAndMortyAdapter.submitList(it)
//            }
//        }
//    }
}