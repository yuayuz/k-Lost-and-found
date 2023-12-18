package com.k

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.k.ui.screens.main.MainFrame

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainFrame()
        }
    }
}

//不同号用一个信息数据库。。。
//列表到聊天界面数据传输问题


