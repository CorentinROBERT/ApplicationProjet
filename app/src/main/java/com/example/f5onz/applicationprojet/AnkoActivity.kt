package com.example.f5onz.applicationprojet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_anko.*
import org.jetbrains.anko.*

class AnkoActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anko)
        button1.setOnClickListener { toast("ceci est un toast") }
        button2.setOnClickListener { longToast("ceci est un long toast") }
        button3.setOnClickListener {  alert("Trouvez-vous que cette application est bien ?") {
            title = "Cette application est-elle vraiment bien ?"
            positiveButton("OH OUI") { alert("Tu as raison ;)").show() }
            negativeButton("Non !") {  alert("Toi je t'aime pas vraiment ! Sort d'ici !!").show()
                finish();}
        }.show() }
        button4.setOnClickListener {
            email("ldemmer6@gmail.com","Application du projet", "Ce mail a été envoyé à partir de l'application du projet Android !")}
        button5.setOnClickListener { browse("https://lpmi-info.unice.fr/doku.php?id=dam") }
    }
}
