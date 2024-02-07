package com.salievyt1353.ulanAka.perehotna5mesets.onBoard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.salievyt1353.ulanAka.perehotna5mesets.R
import com.salievyt1353.ulanAka.perehotna5mesets.databinding.FragmentOnBoardBinding


class OnBoardFragment : Fragment() {

    private val binding:FragmentOnBoardBinding by lazy {
        FragmentOnBoardBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

    private var progress = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.button.alpha= 0F
        progress = 1
        if (progress == 1 ){
            binding.button.animate().alpha(1f).translationYBy(-50f).startDelay=3000
        }

        with(binding){ button.setOnClickListener{
             if (progress < 33 || progress == 0) {
                progress = 33
                verticalProgressbar.progress = progress
             } else if (progress < 66 || progress == 33) {
                progress = 66
                verticalProgressbar.progress = progress
             } else if (progress < 100 || progress == 66) {
                progress = 100
                verticalProgressbar.progress = progress
             }
            if (progress == 100){
                button.setOnClickListener {
                    findNavController().navigate(R.id.nextFragment)
                }
            }


         }
        }
    }


}