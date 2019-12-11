package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import android.content.Intent
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri
import org.jetbrains.anko.browse


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonR.setOnClickListener {
            startActivity(intentFor<Main2Activity>("id" to "rojo"))
        }

        botonA.setOnClickListener {
            startActivity(intentFor<Main2Activity>("id" to "amarillo"))
        }
        navegador.setOnClickListener {

            //val uriUrl = Uri.parse("www.google.com")
            browse("https://www.google.com")
            //val launchBrowser = Intent(Intent.ACTION_VIEW, uriUrl)
            //startActivity(launchBrowser)
        }
    }
}
