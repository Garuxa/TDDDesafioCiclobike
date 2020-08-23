package cl.desafiolatam.tdddesafiociclobike

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setupCiclovias = SetupCiclovias().init()

        val myAdapter = CycloAdapter(setupCiclovias)

        cyclo_recycler.adapter = myAdapter

        cyclo_recycler.addItemDecoration(
            DividerItemDecoration(
                this@MainActivity,
                LinearLayoutManager.VERTICAL
            )
        )

        btn_filter.setOnClickListener {
            cyclo_recycler.adapter = CycloAdapter(SetupCiclovias().condes())
        }

        btn_not_filter.setOnClickListener {
            cyclo_recycler.adapter = CycloAdapter(SetupCiclovias().init())
        }
    }
}