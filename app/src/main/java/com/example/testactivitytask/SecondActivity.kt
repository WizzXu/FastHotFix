package com.example.testactivitytask

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.commonlibrary.CommonLibrary
import com.example.mylibrary.MyLibrary
import com.example.testactivitytask.databinding.ActivitySecondBinding
import dalvik.system.PathClassLoader
import java.io.File

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            application.startActivity(intent)
        }
        binding.tv.text = "Second234Activity"
        //Log.e("xwy--> SecondActivity:", taskId.toString())

        //引用 library工程下的 MyLibrary
        Log.e("TAG", "新4apk")
        Log.e("xwy-->", "MyLibrary.className:${MyLibrary.className}")
        Log.e("xwy-->", "MyLibrary.commonClassName:${MyLibrary.commonClassName}")
        // 引用 library工程下的 MyLibrary
        Log.e("xwy-->", "CommonLibrary.className:${CommonLibrary.className}")
    }
}