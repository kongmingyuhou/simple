package com.example.simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_radio_button.*

class RadioButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        rg_sex.setOnCheckedChangeListener{group, checkedId ->
            tv_sex.text=when(checkedId){
                R.id.rb_male -> "哇哦，你是个帅气的男孩"
                R.id.rb_female -> "哇哦，你是个漂亮的女孩"
                else -> ""
            }
        }
    }
}
