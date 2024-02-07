package com.salievyt1353.ulanAka.perehotna5mesets.onBoard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.salievyt1353.ulanAka.perehotna5mesets.R
import com.salievyt1353.ulanAka.perehotna5mesets.databinding.ItemOnBoardBinding

class OnBoardAdapter: RecyclerView.Adapter<OnBoardAdapter.BoardViewHolder>() {





    private val title = listOf(
        "1",
        "2",
        "3",
    )

    private val desc = listOf(
        "1.1",
        "2.2",
        "3.3",
    )


    inner class BoardViewHolder(private val binding: ItemOnBoardBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(pos: Int) {
            binding.txtDesc.text = desc[pos]
            binding.txtTitle.text = title[pos]
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        return BoardViewHolder(
            ItemOnBoardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = title.size

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.onBind(position)
    }

}