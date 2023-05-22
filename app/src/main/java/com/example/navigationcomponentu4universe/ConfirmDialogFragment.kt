package com.example.navigationcomponentu4universe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentu4universe.databinding.FragmentConfirmDialogBinding

class ConfirmDialogFragment : Fragment() {

    private var _binding: FragmentConfirmDialogBinding? = null
    private val binding get() = _binding!!

    private val args: ConfirmDialogFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentConfirmDialogBinding.inflate(inflater, container, false)



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val receiverName = args.receiverName
        val amount = args.amount

        binding.tvSendMessage.text = "Do you want to send $amount$ to $receiverName?"

        binding.btnYes.setOnClickListener {
            Toast.makeText(requireContext(), "$amount$ sent to $receiverName. ", Toast.LENGTH_SHORT).show()
        }

        binding.btnNo.setOnClickListener {
            findNavController().popBackStack()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}