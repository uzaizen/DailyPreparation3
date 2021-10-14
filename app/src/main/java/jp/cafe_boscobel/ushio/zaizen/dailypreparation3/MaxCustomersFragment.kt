package jp.cafe_boscobel.ushio.zaizen.dailypreparation3

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.fragment_max_customers.*
import kotlinx.android.synthetic.main.fragment_max_customers.view.*

class MaxCustomersFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_max_customers, container, false)

        view.maxcustomersbutton.setOnClickListener(maxcustomernumberset())

        return view
    }

    private inner class maxcustomernumberset : View.OnClickListener {
        override fun onClick(view: View) {
            if (maxcustomers.text == null) {
                MAXCUSTOMER=0
            } else {
                MAXCUSTOMER = maxcustomers.text.toString().toInt()
                CulcRequired(MAXCUSTOMER)
            }
            /*キーボードを消す*/
            val inputManager = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(view.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
        }
        }

    fun CulcRequired (MaxCustomer:Int){
        Soup.Required = MaxCustomer * 120
        PotatoSalad.Required = MaxCustomer * 40
        CarrotRapee.Required = MaxCustomer * 20
        Rice.Required = MaxCustomer / 3 + 1
        Hamberg.Required = MaxCustomer / 4 + 1
        Locomoko.Required = MaxCustomer / 6 + 1
        Sarmon.Required = MaxCustomer / 5
        Chiken.Required = MaxCustomer / 5
        RoastBeef.Required = MaxCustomer / 5
    }

    }

