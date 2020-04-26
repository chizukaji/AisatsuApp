package jp.techacademy.chizu.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)

    }

    override fun onClick(v: View){
        showTimePickerDialog()

        textView.text = "kari hour:minute"
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                textView.text = "$hour:$minute"

                when {
                    hour >= 2 && hour <= 9 -> textView.text = "おはよう"
                    hour >= 10 && hour <= 17 -> textView.text = "こんにちは"
                    else -> textView.text ="こんばんは"
                }

            },
            13, 0, true)
        timePickerDialog.show()
    }



}
