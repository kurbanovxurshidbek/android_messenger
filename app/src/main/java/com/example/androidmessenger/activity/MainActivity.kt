package com.example.androidmessenger.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmessenger.R
import com.example.androidmessenger.adapter.ChatAdapter
import com.example.androidmessenger.model.Chat
import com.example.androidmessenger.model.Message
import com.example.androidmessenger.model.Room

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList<Chat>()

        val rooms: ArrayList<Room> = ArrayList<Room>()
        rooms.add(Room(R.drawable.im_user_1, "Xurshidbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_2, "Begzodbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_3, "Sherzodbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_1, "Xurshidbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_2, "Begzodbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_3, "Sherzodbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_1, "Xurshidbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_2, "Begzodbek Kurbanov"))
        rooms.add(Room(R.drawable.im_user_3, "Sherzodbek Kurbanov"))

        // Rooms
        chats.add(Chat(rooms))

        // Messages
        chats.add(Chat(Message(R.drawable.im_user_2, "Xurshidbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_1, "Begzodbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_3, "Sherzodbek", true)))
        chats.add(Chat(Message(R.drawable.im_user_2, "Xurshidbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_1, "Begzodbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_3, "Sherzodbek", true)))
        chats.add(Chat(Message(R.drawable.im_user_2, "Xurshidbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_1, "Begzodbek", false)))
        chats.add(Chat(Message(R.drawable.im_user_3, "Sherzodbek", true)))

        return chats
    }
}