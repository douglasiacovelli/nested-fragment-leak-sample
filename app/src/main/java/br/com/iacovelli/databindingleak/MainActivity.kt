package br.com.iacovelli.databindingleak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentFragment = ParentFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.container, parentFragment)
            .commit()
    }
}
