package com.schiavone.honorsmobileapps.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.schiavone.honorsmobileapps.navigationcomponentdemo.databinding.FragmentReplyBinding

class ReplyFragment : Fragment() {
    private var _binding: FragmentReplyBinding?=null
    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentReplyBinding.inflate(inflater,container, false)
        val rootview=binding.root
        binding.sendReplyButton.setOnClickListener{

        }
        return rootview
    }
        override fun onDestroyView(){
            super.onDestroyView()
            _binding=null
        }

}