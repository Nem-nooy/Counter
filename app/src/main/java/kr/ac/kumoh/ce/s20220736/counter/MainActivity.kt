package kr.ac.kumoh.ce.s20220736.counter

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kr.ac.kumoh.ce.s20220736.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        main = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(main.root)

//        main.btnAdd.setOnClickListener {
//            main.txtCount.text = "${++count}"       // Python's f-stringLIKE
////            main.txtCount.text = (++count).toString()
//        }
//
//        main.btnSub.setOnClickListener {
//            if (count > 0)
//                main.txtCount.text = "${--count}"       // Python's f-stringLIKE
////            main.txtCount.text = (--count).toString()
//            else
//            {
//                val toast = Toast.makeText(this@MainActivity, "음수 불가능!", Toast.LENGTH_SHORT)
//                toast.show()
//            }
//        }

        main.btnReset.setOnClickListener {
            count = 0
            main.txtCount.text = "$count"
        }
    }
}