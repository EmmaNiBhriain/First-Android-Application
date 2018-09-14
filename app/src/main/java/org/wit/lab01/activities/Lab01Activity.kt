package org.wit.lab01.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lab01.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.lab01.R
import org.wit.lab01.models.Lab01Model


class Lab01Activity : AppCompatActivity(), AnkoLogger {

    var lab = Lab01Model()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab01)

        btnAdd.setOnClickListener() {
            lab.title = placemarkTitle.text.toString()
            if (lab.title.isNotEmpty()) {
                info("add Button Pressed: $lab")
            }
            else {
                toast ("Please Enter a title")
            }
        }
    }
}
