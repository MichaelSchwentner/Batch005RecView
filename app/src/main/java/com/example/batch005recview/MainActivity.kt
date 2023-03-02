package com.example.batch005recview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.batch005recview.Adapter.UserAdapter
import com.example.batch005recview.Model.User
import com.example.batch005recview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: UserAdapter
    private lateinit var userList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        fillUserList()
        setUpUi()
    }

    fun setUpUi(){
        binding.recView.layoutManager = LinearLayoutManager(this)
        adapter = UserAdapter(userList)
        binding.recView.adapter = adapter
    }

    fun fillUserList(){
        userList = arrayListOf(
            User("Till", "abc@test.de"),
            User("Till2", "abc2@test.de"),
            User("Till3", "abc3@test.de")
        )
    }
}