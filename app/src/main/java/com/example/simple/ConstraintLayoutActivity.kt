package com.example.simple

import android.annotation.TargetApi
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_constraint_layout.*
import org.jetbrains.anko.*

@TargetApi(Build.VERSION_CODES.KITKAT)
class ConstraintLayoutActivity : AppCompatActivity() {
    private var isMoved = false
    private var lastViewId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)
    }

    private fun addNewView() {
        val tv = TextView(this)
        tv.text = "长按删除该文本"
        val container = ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT,
            ConstraintLayout.LayoutParams.WRAP_CONTENT
        )
        //设置控件左侧与另一个控件的左侧对齐
        //水平方向上只能使用start和end，因为left和right可能无法奏效
        container.startToStart = lastViewId
        //设置控件顶部与另一个控件的底部对齐
        container.topToBottom = lastViewId
        container.topMargin = dip(30)
        //左侧间距要使用Start，不能用Left，因为set.applyTo方法会清空Left的间距。marginStart需要API17支持
        container.marginStart = dip(10)
        tv.layoutParams = container
        //tv.setOnLongClickListener { vv -> cl_content.removeView(vv); true }
        lastViewId += 1000
        tv.id = lastViewId
        //cl_content.addView(tv)
    }
}
