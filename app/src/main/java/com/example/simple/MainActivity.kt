package com.example.simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_button_click.setOnClickListener { startActivity<ButtonClickActivity>() }
        btn_check_box.setOnClickListener { startActivity<CheckboxActivity>() }
        btn_radio_button.setOnClickListener { startActivity<RadioButtonActivity>() }

    }
}
