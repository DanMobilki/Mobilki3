package com.example.msip

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.snackbar.Snackbar
import java.math.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    var tt: TextView? = null
    var ed: EditText? = null
    var edt: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tt = findViewById(R.id.textView2)
        ed = findViewById(R.id.editTextText)
        edt = findViewById(R.id.editTextTex)

    }
    fun ClickButton(view: View) {
        val x = ed?.text.toString()
        val t = setOf('0','1','2','3','4','5','6','7','8','9')
        val h = x.count { char -> char in t }
        val f = x.count() - h
        tt?.text = "$f"
    }
}
