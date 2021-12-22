package com.schiavone.honorsmobileapps.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.schiavone.honorsmobileapps.navigationcomponentdemo.databinding.FragmentReplyBinding
import com.schiavone.honorsmobileapps.navigationcomponentdemo.databinding.FragmentSendMessageBinding


class SendMessageFragment : Fragment() {
    private var _binding: FragmentSendMessageBinding?=null
    private val binding get()=_binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentSendMessageBinding.inflate(inflater,container, false)
        val rootview=binding.root
        binding.sendButton.setOnClickListener{
    rootview.findNavController().navigate(R.id.action_sendMessageFragment_to_replyFragment)
        }
        return rootview
    }
    override fun onDestroyView(){
        super.onDestroyView()
        _binding=null
    }
}