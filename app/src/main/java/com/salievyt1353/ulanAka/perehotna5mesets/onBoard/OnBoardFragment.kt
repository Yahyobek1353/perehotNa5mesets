package com.salievyt1353.ulanAka.perehotna5mesets.onBoard


import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
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

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.progressBar.scaleY = 10f
        binding.progressBar.
        // Устанавливаем начальное значение прогресса
        setProgress(progress)

        // Настройка обработчика нажатия на кнопку добавляет 50
        binding.increaseButton.setOnClickListener {
            if (progress < 100) {
                progress +=50
                setProgress(progress)
            }

            }
        //минусует 50
        binding.Button.setOnClickListener {
            if (progress>0){
                progress -=50
                setProgress(progress)
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun setProgress(progress: Int) {
        binding.progressBar.progress = progress

        // Устанавливаем цвет текста в зависимости от значения прогресса
        when (progress) {
            0 -> {
                binding.Button.isEnabled = false
                binding.Button.setBackgroundColor(R.color.darker_gray)
            }
            50 -> {
                binding.Button.isEnabled = true
                binding.Button.setBackgroundColor(R.color.black)
                binding.textView1.setTextColor(R.color.black)}

            100 -> { binding.textView1.setTextColor(R.color.black)
                binding.textView2.setTextColor(R.color.black)
                binding.Button.setBackgroundColor(R.color.darker_gray)
            }
        }
    }
}