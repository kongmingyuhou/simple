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
        btn_linear_layout.setOnClickListener { startActivity<LinearLayoutActivity>() }
        btn_relative_layout.setOnClickListener { startActivity<RelativeLayoutActivity>() }
        //btn_constraint_layout.setOnClickListener { startActivity<ConstraintLayoutActivity>() }
        //btn_text_marquee.setOnClickListener { startActivity<TextMarqueeActivity>() }
        //btn_image_scale.setOnClickListener { startActivity<ImageScaleActivity>() }
        //btn_edit_text.setOnClickListener { startActivity<EditTextActivity>() }
        //btn_act_first.setOnClickListener { startActivity<ActFirstActivity>() }
        //btn_act_parcelable.setOnClickListener { startActivity<ParcelableFirstActivity>() }
        //btn_act_request.setOnClickListener { startActivity<ActRequestActivity>() }
        //btn_alert_dialog.setOnClickListener { startActivity<AlertDialogActivity>() }
        //btn_login_page.setOnClickListener { startActivity<LoginPageActivity>() }
    }
}
