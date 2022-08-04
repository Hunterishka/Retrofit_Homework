package com.example.homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.homework.databinding.FragmentHelpBinding

class HelpFragment : Fragment() {
    val args:HelpFragmentArgs by navArgs()
    lateinit var binding: FragmentHelpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHelpBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtName.text=args.user.name
        binding.txtUsername.text=args.user.username
        binding.txtEmail.text=args.user.email
        binding.txtCity.text=args.user.address.city
    }
}