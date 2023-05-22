package com.example.navigationcomponentu4universe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentu4universe.databinding.FragmentSendCashBinding

class SendCashFragment : Fragment() {

    private var _binding: FragmentSendCashBinding? = null
    private val binding get() = _binding!!

    private val args: SendCashFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSendCashBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvRecipient.text = "Send cash to ${args.receiverName}"

        binding.sendBtn.setOnClickListener {
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}