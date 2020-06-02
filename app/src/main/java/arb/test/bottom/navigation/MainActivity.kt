package arb.test.bottom.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.menu.getItem(0).isCheckable = true
        setFragment(frag1())

        bottomNav.setOnNavigationItemSelectedListener {menu ->

            when(menu.itemId){

                R.id.btn1 -> {
                    setFragment(frag1())
                    true
                }

                R.id.btn2 -> {
                    setFragment(frag2())
                    true
                }

                R.id.btn3 -> {
                    setFragment(frag3())
                    true
                }

                else -> false
            }
        }

    }

    fun setFragment(fr : Fragment){
        val frag = supportFragmentManager.beginTransaction()
        frag.replace(R.id.fragment,fr)
        frag.commit()
    }

}