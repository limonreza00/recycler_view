package com.coderscastle.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerView)

        val arrayList = ArrayList<Users>()
        arrayList.add(Users("Asif", 10,"01111"))
        arrayList.add(Users("Babu", 12,"01112"))
        arrayList.add(Users("Cuba", 13,"01113"))
        arrayList.add(Users("Dodo", 14,"01114"))
        arrayList.add(Users("Eko", 15,"01115"))
        arrayList.add(Users("Fikri", 16,"01116"))
        arrayList.add(Users("Gita", 17,"01117"))
        arrayList.add(Users("Hani", 18,"01118"))
        arrayList.add(Users("Iman", 19,"01119"))
        arrayList.add(Users("Joko", 20,"01120"))
        arrayList.add(Users("Kala", 21,"01121"))
        arrayList.add(Users("Lala", 22,"01122"))
        arrayList.add(Users("Mami", 23,"01123"))
        arrayList.add(Users("Nini", 24,"01124"))
        val adapter = Adapter(arrayList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}