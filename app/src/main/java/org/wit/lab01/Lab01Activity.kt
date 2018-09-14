package org.wit.lab01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lab01.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class Lab01Activity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab01)
        info("Placemark Activity started..")
        btnAdd.setOnClickListener() {
            info("add Button Pressed")
        }
    }
}
