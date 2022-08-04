package com.example.homework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.databinding.TableItemBinding
import com.example.homework.model.UserItem

class RecyclerAdapter(
    val clickListener:(UserItem)->Unit
) : ListAdapter<UserItem, RecyclerAdapter.MyViewHolder>(diffutil) {

    class MyViewHolder(val binding: TableItemBinding) : RecyclerView.ViewHolder(binding.root)

    companion object {
        val diffutil = object : DiffUtil.ItemCallback<UserItem>() {
            override fun areItemsTheSame(oldItem: UserItem, newItem: UserItem): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: UserItem, newItem: UserItem): Boolean {
                return oldItem.company == newItem.company
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            TableItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user=getItem(position)
        holder.binding.apply {
            txtOrder.text=(position+1).toString()
            txtName.text=user.name
            txtUsername.text=user.username
            txtEmail.text=user.email
            txtCity.text=user.address.city

        }
        holder.itemView.setOnClickListener {
            clickListener(user)
        }
    }
}