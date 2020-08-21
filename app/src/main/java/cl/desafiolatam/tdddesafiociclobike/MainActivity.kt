package cl.desafiolatam.tdddesafiociclobike

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setupCiclovias = SetupCiclovias().init()

        val myAdapter = CycloAdapter(setupCiclovias)

        cyclo_recycler.adapter = myAdapter
    }
}