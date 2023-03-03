package com.example.batch005recview.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.batch005recview.Model.User
import com.example.batch005recview.databinding.UseritemRecyclerviewBinding

class UserAdapter(var userlist:ArrayList<User>): RecyclerView.Adapter<UserAdapter.UserHolder>(){

    class UserHolder(val binding: UseritemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(user: User){
            binding.email.text = user.email
            binding.name.text = user.name
//--------------root,name
            binding.root.setOnClickListener{
                binding.email.text = "Hurra"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserHolder {
        val binding = UseritemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return UserHolder(binding)
    }

    override fun onBindViewHolder(holder: UserHolder, position: Int) {
        holder.bind(userlist.get(position))
    }

    override fun getItemCount(): Int {
        return userlist.size
    }
}