package com.example.navigationcomponentu4universe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentu4universe.databinding.FragmentChooseReceiverBinding

class ChooseReceiverFragment : Fragment() {

    private var _binding: FragmentChooseReceiverBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentChooseReceiverBinding.inflate(inflater, container, false)



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextBtn.setOnClickListener {
            val action =  ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment(
                binding.inputRecipient.text.toString()
            )
            findNavController().navigate(
                ChooseReceiverFragmentDirections.actionChooseReceiverFragmentToSendCashFragment(
                    binding.inputRecipient.text.toString(),
                )
            )
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}