package jp.techacademy.yasushi.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.content.Intent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        if(Num1.length() == 0 || Num2.length() == 0) {
            answer.text = "数字が入っていません"
        }else {
            if (v.id == R.id.button1){
                intent.putExtra("time1", (Num1.text.toString().toDouble() + Num2.text.toString().toDouble()).toString())
                startActivity(intent)
            }else if (v.id == R.id.button2) {
                intent.putExtra("time1",(Num1.text.toString().toDouble() - Num2.text.toString().toDouble()).toString())
                startActivity(intent)
            }else if (v.id == R.id.button3) {
                intent.putExtra("time1",(Num1.text.toString().toDouble() * Num2.text.toString().toDouble()).toString())
                startActivity(intent)
            }else if (v.id == R.id.button4){
                intent.putExtra("time1",(Num1.text.toString().toDouble() / Num2.text.toString().toDouble()).toString())
                startActivity(intent)
            }
        }




    }

}