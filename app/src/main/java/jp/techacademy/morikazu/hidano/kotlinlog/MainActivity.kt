package jp.techacademy.morikazu.hidano.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
//        dog.move()

        val human = Human("守和", 43, "Android")
        human.say()

        val human2 = Human("守和", 43, "Android")
        human2.think()
    }

}